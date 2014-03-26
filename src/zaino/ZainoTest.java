package zaino;

import java.util.Scanner;

public class ZainoTest {

	public static void main(String[] args) {
		Zaino z = new Zaino("Seven", "Eduard", 5);
		Scanner sc = new Scanner(System.in);
		boolean devoUscire = false;
		
		while(!devoUscire) {
			System.out.println("Inserisci comando:");
			String c = sc.next();
			if (c.equals("q")) {
				devoUscire = true;
			} else if (c.equals("elenca")) {
				z.elencaCose();
			} else if (c.equals("zaino")) {
				System.out.println("Marca modello: " + z.getMarcaModello());
				System.out.println("Proprietario: " + z.getProprietario());
				System.out.println("Massimo numero di cose: " + z.getMassimoNumeroDiCose());
			} else if (c.equals("prendi")) {
				z.elencaCose();
				System.out.println("Inserisci il numero:");
				int pos = sc.nextInt();
				Cosa co = z.prendiCosa(pos);
				System.out.println("hai preso: " + co.getNome() + " - " + co.getDescrizione());
			} else if (c.equals("aggiungi")) {
				System.out.println("Inserisci il nome:");
				String nome = sc.next();
				System.out.println("Inserisci la descrizione:");
				String desc = sc.next();
				Cosa co = new Cosa(nome, desc);
				boolean stato = z.inserisciCosa(co);
				if (stato == false) {
					System.out.println("Zaino pieno");
				} else {
					System.out.println("Cosa inserita");
				}
			}
		}
		
		sc.close();
	}

}
