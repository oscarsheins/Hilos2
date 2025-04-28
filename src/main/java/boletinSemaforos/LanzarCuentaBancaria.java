package boletinSemaforos;

public class LanzarCuentaBancaria {

	public static void main(String[] args) {
		
	CuentaBancaria cuentaBancaria = new CuentaBancaria(121);
	SemaforoBinario semaforo = new SemaforoBinario();
	
	HiloCuentaBancaria hilo1 = new HiloCuentaBancaria(semaforo, cuentaBancaria, "oscar1");
	HiloCuentaBancaria hilo2 = new HiloCuentaBancaria(semaforo, cuentaBancaria, "oscar2");
	
	hilo1.start();
	hilo2.start();
	
	
	CuentaBancaria2 cuentaBancaria2 = new CuentaBancaria2(121, 1);
	
	HiloCuentaBancaria2 hilo21 = new HiloCuentaBancaria2(cuentaBancaria2, "oscar1");
	HiloCuentaBancaria2 hilo22 = new HiloCuentaBancaria2(cuentaBancaria2, "oscar1");
	
	hilo21.start();
	hilo22.start();	
	
	}
	
}
