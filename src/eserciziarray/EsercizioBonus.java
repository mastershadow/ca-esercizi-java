package eserciziarray;

import java.util.Scanner;

public class EsercizioBonus {

	public static void main(String[] args) {
		// char[] c = {'o','n','o','r','a','r','o','n','o'};
		// vogliamo che la stringa la inserisca l'utente
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci una stringa:");
		// leggiamo la stringa
		String s = sc.next();
		// chiudiamo lo scanner
		sc.close();
		// trasformiamo la stringa in una array di caratteri
		char[] c = s.toCharArray();
		
		boolean palindroma = true;
		int lunghezza = c.length;
		// indice per arrivare a metà array compreso
		int indiceMassimo = (int)Math.ceil(lunghezza / 2.0);
		
		for (int i = 0; i < indiceMassimo; i++) {
			char a = c[i];
			char b = c[lunghezza - 1 - i];
			
			// se non sono uguali
			if (a != b) {
				// dico che non è palindroma
				palindroma = false;
				// interrompo il ciclo
				break;
			}
		}
		
		if (palindroma) {
			System.out.println("Palindromo");
		} else {
			System.out.println("Non palindromo");
		}
		
	}

}
