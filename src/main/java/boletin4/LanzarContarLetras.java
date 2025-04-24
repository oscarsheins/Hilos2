package boletin4;

public class LanzarContarLetras {

	public static void main(String[] args) {

		String frase = "Esta es mi frase";
		int numeroTotal = 0;

		char[] vocales = { 'a', 'e', 'i', 'o', 'u' };
		HiloContarFrase[] hilos = new HiloContarFrase[vocales.length];

		for (int i = 0; i < vocales.length; i++) { 
			hilos[i] = new HiloContarFrase(frase, vocales[i]);
			
		}

		for (HiloContarFrase hilo : hilos) {
			hilo.start();
		}

		for (HiloContarFrase hilo : hilos) {
			try {
				hilo.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		for (HiloContarFrase hilo : hilos) {
			
			numeroTotal =  hilo.getNumeroDeLetrasTotal() + numeroTotal;

		}
		
		System.out.println(numeroTotal);
		

	}

}
