package boletinSemaforos;

public class Restaurante {

	private boolean comidaDisponible;

	public Restaurante() {
		
		this.comidaDisponible = false;
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
		
		System.out.println("Comiendo comida");

		comidaDisponible = false;
	}

}
