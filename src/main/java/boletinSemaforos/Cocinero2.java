package boletinSemaforos;

public class Cocinero2 implements Runnable{
	
	private Restaurante2 restaurante;
	
	public Cocinero2(Restaurante2 restaurante) {
		this.restaurante = restaurante;
	}

	@Override
	public void run() {
			
		restaurante.cocinarPlato();
			
	}
	

}
