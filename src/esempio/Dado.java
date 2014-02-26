package esempio;

import java.util.Random;

public class Dado {
	/*
	 * DEVONO ESSERCI:
	 * - COSTRUTTORE VUOTO (numero facce di base = 6)
	 * - COSTRUTTORE CON NUMERO FACCE VARIABILI
	 * - SETTER NUMERO FACCE
	 * - METODO LANCIA PER OTTENERE UN RISULTATO
	 */
	
	private int numeroFacce;
	private Random gen;
	
	public Dado() {
		numeroFacce = 6;
		gen = new Random();
	}
	
	public Dado(int numFacce) {
		numeroFacce = numFacce;
		gen = new Random();
	}
	
	public void setFacce(int nuovoVal) {
		numeroFacce = nuovoVal;
	}
	
	public int lancia() {
		int result = gen.nextInt(numeroFacce) + 1;
		return result;
	}

}
