package boletinSemaforos;

public class CuentaBancaria {
	
	private int saldo;

	public CuentaBancaria(int saldo) {
		super();
		this.saldo = saldo;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	public void consultarSaldo() {
		
		System.out.println("Usted tiene un saldo de " + this.getSaldo());
		
	}
	



}
