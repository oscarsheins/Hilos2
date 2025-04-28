package boletinSemaforos;

import java.util.concurrent.Semaphore;

public class Coche implements Runnable{
	
	private int id;
	private  Semaphore semaforo;
	
//	A si no porque haci cada coche tendra supropio semaforo 
//	Semaphore semaforo = new Semaphore(3);
	
	
	public Coche(int id, Semaphore semaforo) {
		super();
		this.id = id;
		this.semaforo = semaforo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Semaphore getSemaforo() {
		return semaforo;
	}

	public void setSemaforo(Semaphore semaforo) {
		this.semaforo = semaforo;
	}

	public void repostar() {
		
		try {
			 System.out.println("Coche " + id + " espera para repostar...");
	            semaforo.acquire(); 
	            System.out.println("Coche " + id + " está repostando...");
	            
	            Thread.sleep(5000); // Repostando 5 segundos
	            System.out.println("Coche " + id + " ha terminado de repostar.");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			semaforo.release();
	
		}
		
	}

	@Override
	public void run() {
		
		repostar();
		
	}
	
	

}
