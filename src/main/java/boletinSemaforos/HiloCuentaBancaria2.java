package boletinSemaforos;

public class HiloCuentaBancaria2 extends Thread{
	
	private CuentaBancaria2 cuentaBancaria;
	private String nombreHilo;
	
	public HiloCuentaBancaria2(CuentaBancaria2 cuentaBancaria, String nombreHilo) {
		super();
		this.cuentaBancaria = cuentaBancaria;
		this.nombreHilo = nombreHilo;
	}

	public CuentaBancaria2 getCuentaBancaria() {
		return cuentaBancaria;
	}

	public void setCuentaBancaria(CuentaBancaria2 cuentaBancaria) {
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
			
		cuentaBancaria.consultarSaldo();
		
	}
	
}
