package boletin4;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class LanzarBuscarPalabra {

	// Variable final static con la ruta de la carpeta Resources
	private static final String rutaResources = "src\\main\\resources\\";

	public static void main(String[] args) {
		
		int numeroTotal = 0;
		
		// Instanciando dos objetos File
		File file1 = new File(rutaResources + "archivo2.txt");
		File file2 = new File(rutaResources + "archivo3.txt");

		// Creando una lista y añadiendo los objetos File
		List<File> fileList = new ArrayList<>();
		fileList.add(file1);
		fileList.add(file2);

		BuscarPalabraFichero buscar = new BuscarPalabraFichero(fileList);

		String[] palabrasClave = { "sol", "bosque" };
		HiloContarPalabraFichero[] hilos = new HiloContarPalabraFichero[fileList.size()];

		for (int i = 0; i < palabrasClave.length; i++) {
			hilos[i] = new HiloContarPalabraFichero(buscar, palabrasClave[i]);

		}

		for (HiloContarPalabraFichero hilo : hilos) {
			hilo.start();
		}

		for (HiloContarPalabraFichero hilo : hilos) {
			try {
				hilo.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		for (HiloContarPalabraFichero hilo : hilos) {

//			numeroTotal = hilo.getN + numeroTotal;

		}

		System.out.println(numeroTotal);

	}

}
