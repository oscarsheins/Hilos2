package boletin4;

public class HiloContarPalabraFichero extends Thread {
	
	private BuscarPalabraFichero buscar;
	private String palabraBuscar;
	
	public HiloContarPalabraFichero(BuscarPalabraFichero buscar, String palabraBuscar) {
		super();
		this.buscar = buscar;
		this.palabraBuscar = palabraBuscar;
	}

	public BuscarPalabraFichero getBuscar() {
		return buscar;
	}

	public void setBuscar(BuscarPalabraFichero buscar) {
		this.buscar = buscar;
	}

	public String getPalabraBuscar() {
		return palabraBuscar;
	}

	public void setPalabraBuscar(String palabraBuscar) {
		this.palabraBuscar = palabraBuscar;
	}
	
	
	@Override
	public void run() {
		
		buscar.leerFichero(palabraBuscar);
		
	}

	

}
