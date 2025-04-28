package boletinSemaforos;

public class Comensal2 implements Runnable {

	private Restaurante2 restaurante;

	public Comensal2(Restaurante2 restaurante) {
		this.restaurante = restaurante;
	}

	@Override
	public void run() {

		restaurante.comerPlato();

	}

}
