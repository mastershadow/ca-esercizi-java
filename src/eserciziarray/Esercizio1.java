package eserciziarray;

public class Esercizio1 {

	public static void main(String[] args) {
		int[] n = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		// contiene il risultato della somma
		int somma = 0;
		// ciclo per scorrere l'array
		for (int i = 0; i < n.length; i++) {
			// il valore attuale di somma + il valore della posizione corrente
			// nell'array n (di interi)
			somma = somma + n[i];
		}
		// stampo il risultato
		System.out.println("La somma è: " + somma);
		
	}

}
