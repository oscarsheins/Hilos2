package boletinSemaforos;

public class Comensal implements Runnable{
	
private Restaurante restaurante;
	
	public Comensal (Restaurante restaurante) {
		this.restaurante = restaurante;
	}

	@Override
	public void run() {
		
		restaurante.comerPlato();
		
	}
	
	

}
