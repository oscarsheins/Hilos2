package boletin4;

public class HiloContarPalabraFichero extends Thread {
	
	private BuscarPalabraFichero buscar;
	private String palabraBuscar;
	private int resultado;
	
	
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
	

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}

	@Override
	public void run() {
		
		resultado = buscar.leerFichero(palabraBuscar);
		
		
	}

	

}
