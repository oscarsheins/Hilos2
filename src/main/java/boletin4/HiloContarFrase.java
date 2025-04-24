package boletin4;

import java.util.Scanner;

public class HiloContarFrase extends Thread{

	private String frase;
	private int numeroDeLetrasTotal;
	private char letraAContar;

	public HiloContarFrase(String frase, char letraAContar) {
		super();
		this.frase = frase;
		this.letraAContar = letraAContar;
	}

	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}

	public int getNumeroDeLetrasTotal() {
		return numeroDeLetrasTotal;
	}

	public void setNumeroDeLetrasTotal(int numeroDeLetrasTotal) {
		this.numeroDeLetrasTotal = numeroDeLetrasTotal;
	}

	public String pedirFrase() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la frase");
		String frase = sc.nextLine();

		sc.close();

		return frase;
	}

	public void contarLetra(char letra) {
		int contador = 0;
		String fraseMinuscula = frase.toLowerCase();
		for (char c : fraseMinuscula.toCharArray()) {
			if (c == letra) {
				contador++;
			}

		}
		
		System.out.println("La letra " + letra + " se a contado " + contador + " veces");

		this.numeroDeLetrasTotal = contador;
		
	}
	
	

	@Override
	public void run() {
		
		contarLetra(letraAContar);
		
	}

}
