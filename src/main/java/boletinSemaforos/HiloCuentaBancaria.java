package boletinSemaforos;

public class HiloCuentaBancaria extends Thread{
	
	private SemaforoBinario semaforo;
	private CuentaBancaria cuentaBancaria;
	private String nombreHilo;
	
	public HiloCuentaBancaria(SemaforoBinario semaforo, CuentaBancaria cuentaBancaria, String nombreHilo) {
		super();
		this.semaforo = semaforo;
		this.cuentaBancaria = cuentaBancaria;
		this.nombreHilo = nombreHilo;
	}

	public SemaforoBinario getSemaforo() {
		return semaforo;
	}

	public void setSemaforo(SemaforoBinario semaforo) {
		this.semaforo = semaforo;
	}

	public CuentaBancaria getCuentaBancaria() {
		return cuentaBancaria;
	}

	public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}

	public String getNombreHilo() {
		return nombreHilo;
	}

	public void setNombreHilo(String nombreHilo) {
		this.nombreHilo = nombreHilo;
	}
	
	@Override
	public void run () {
		
		try {
			
			semaforo.obtenerBandera();
			System.out.println("El hilo " + nombreHilo + "ha obtenido la bandera");
			
			cuentaBancaria.consultarSaldo();
			 
			sleep(3000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			semaforo.liberarBandera();
			System.out.println("La bandera ha sido liberada");
			
		}
		
	}
	
}
