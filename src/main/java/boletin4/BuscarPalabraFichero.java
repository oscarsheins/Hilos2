package boletin4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class BuscarPalabraFichero {

	public final static String rutaResources = "src\\main\\resources\\";
	
	private List<File> ficheros;
	private int TotalPalabras;
	
	
	public BuscarPalabraFichero(List<File> ficheros) {
		super();
		this.ficheros = new ArrayList<File>();
	}

	public List<File> getFicheros() {
		return ficheros;
	}

	public void setFicheros(List<File> ficheros) {
		this.ficheros = ficheros;
	}
	
	public int getTotalPalabras() {
		return TotalPalabras;
	}

	public void setTotalPalabras(int totalPalabras) {
		TotalPalabras = totalPalabras;
	}

	public int leerFichero(String palabraABuscar) {
		
		int contadoPalabra = 0;
		for(File fichero : ficheros) {
			
			
			Scanner in = null;

			try {
				FileReader ficheroCriatura = new FileReader(rutaResources + fichero.getName());
				in = new Scanner(ficheroCriatura);
				in.useLocale(Locale.ENGLISH);
				in.useDelimiter(",|\\r?\\n");

				if (in.hasNextLine()) {
					in.nextLine();
				}

				while (in.hasNext()) {

					String palabra = in.next();

					if (palabra.equals(palabraABuscar)) {

						contadoPalabra++;
						

					}

				}

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				if(in != null) {
					in.close();
				}
			}

			System.out.println("Se a contado la palbra" + contadoPalabra);
		}
		
		return this.TotalPalabras = contadoPalabra;
		
	}
	
	
}
