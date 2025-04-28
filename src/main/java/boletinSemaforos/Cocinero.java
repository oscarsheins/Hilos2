package boletinSemaforos;

public class Cocinero implements Runnable{
	
	private Restaurante restaurante;
	
	public Cocinero(Restaurante restaurante) {
		this.restaurante = restaurante;
	}

	@Override
	public void run() {
		
		restaurante.cocinarPlato();
		
	}
	

}
