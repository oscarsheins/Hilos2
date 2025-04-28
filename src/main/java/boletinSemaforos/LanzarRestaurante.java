package boletinSemaforos;

public class LanzarRestaurante {

	public static void main(String[] args) {
		
		Restaurante restaurante = new Restaurante();

        // Crear e iniciar los hilos de los comensales
        for (int i = 1; i <= 3; i++) {
            new Thread(new Comensal(restaurante)).start();
        }

        // Crear e iniciar el hilo del cocinero
        new Thread(new Cocinero(restaurante)).start();
		
	}
	
}
