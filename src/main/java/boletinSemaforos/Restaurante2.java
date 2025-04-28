package boletinSemaforos;

import java.util.concurrent.Semaphore;

public class Restaurante2 {

	private boolean comidaDisponible;
	private Semaphore semaforo;
	private int comensalesQueHanComido;

	public Restaurante2(int numeroHilos) {
		this.comidaDisponible = false;
		this.semaforo = new Semaphore(numeroHilos);
	}

	public synchronized void cocinarPlato() {

		try {
			
			System.out.println("Plato listo");
			Thread.sleep(3000);
			comidaDisponible = true;
			System.out.println("A comer");
			notifyAll();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public synchronized void comerPlato() {

		while (!comidaDisponible) {

			try {
				System.out.println("Esperando pacientemente");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		try {
			
			semaforo.acquire();
			System.out.println("Comiendo comida");
			Thread.sleep(3000);
			semaforo.release();
			System.out.println("Comida terminada");
			
			 // Ahora controlamos cuántos han comido los dos hilos 
			
            comensalesQueHanComido++;
            if (comensalesQueHanComido == 2) { 
                comidaDisponible = false;
                comensalesQueHanComido = 0; // Reiniciar para el siguiente menú
            }
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
