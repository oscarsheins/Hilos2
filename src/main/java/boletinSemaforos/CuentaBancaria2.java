package boletinSemaforos;

import java.util.concurrent.Semaphore;


// En esta clase estoy haciendo lo mismo que en la otra pero con la clase Semaphore
public class CuentaBancaria2 {
	
	private int saldo;
	private Semaphore semaforo;

	public CuentaBancaria2(int saldo, int semaforo) {
		super();
		this.saldo = saldo;
		this.semaforo = new Semaphore(semaforo);
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	
	public void consultarSaldo() {
		
		try {
			
			semaforo.acquire();
			System.out.println(Thread.currentThread().getName() + "A obtenido la bandera");
			System.out.println("Usted tiene un saldo de " + this.getSaldo());
			
			Thread.sleep(3000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			semaforo.release();
			System.out.println("La bandera ha sido liberada	");
		}
		
		
		
	}
	
	
	
	



}
