package boletinSemaforos;

public class LanzarRestaurante2 {

	public static void main(String[] args) {
		
		Restaurante2 restaurante2 = new Restaurante2(2);
		
		for(int i = 0; i < 6; i++ ) {
			
			new Thread(new Comensal2(restaurante2)).start();;
			
		}
		
		new Thread(new Cocinero2(restaurante2)).start();
		
	}

}
