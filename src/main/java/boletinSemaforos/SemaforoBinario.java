package boletinSemaforos;

public class SemaforoBinario {
	
	private boolean estaLibre;
	
	public SemaforoBinario () {
		
		this.estaLibre = true;
		
	}
	
	public synchronized void obtenerBandera() throws InterruptedException {
		
		while(!estaLibre) {
			wait();
		}
		
		estaLibre = false;
		
	}
	
	public synchronized void liberarBandera() {
		
		estaLibre = true;
		
		notifyAll();
		
	}
	

}
