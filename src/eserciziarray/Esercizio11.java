package eserciziarray;

public class Esercizio11 {

	public static void main(String[] args) {
		int[] n = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		int somma = 0;
		double media = 0;
		// ciclo per calcolare la somma dei valori
		for (int i = 0; i < n.length; i++) {
			somma = somma + n[i];
		}
		// trasformo il numero intero di valori in
		// un numero con la virgola (double) utilizzando
		// l'operatore di cast (forzatura) a tipo (da int a double)
		double numeroDiValori = (double)n.length;
		// devo dividere per un double altrimenti 
		// perdo i valori con la virgola
		media = somma / numeroDiValori;
		System.out.println("La media è: " + media);
		
		// conto i valori oltre la media
		int conta = 0;
		for (int i = 0; i < n.length; i++) {
			if (n[i] > media) { // se oltre la media aumento conta di 1
				conta = conta + 1;
			}
		}
		System.out.println("I numeri oltre la media sono " + conta);
	}

}
