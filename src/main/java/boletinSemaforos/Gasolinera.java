package boletinSemaforos;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class Gasolinera {
	
	public static void main(String[] args) {
		
		int numeroHilos = 8;
		Semaphore semaforo = new Semaphore(3);
		
		List<Thread> hilos = new ArrayList<Thread>();
		
		for(int i = 0; i <= numeroHilos; i++) {
			
			Thread hilo = new Thread(new Coche(i, semaforo));
			hilos.add(hilo);
			
		}
		
		for(Thread hilo : hilos) {
			hilo.start();	
		}
		
	}

}
