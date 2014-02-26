package esempio;

public class MatrixTest {

	public static void main(String[] args) {
		// creo una griglia 3 x 3
		int[][] matrice = new int[3][3];
		// popolo la griglia
		// vado sulle righe
		for (int i = 0; i < matrice.length; i++) {
			int[] riga = matrice[i];
			// vado sulle colonne
			for (int j = 0; j < riga.length; j++) {
				riga[j] = i * 3 + j + 1;
			}
		}
		// stampo la matrice (stessa procedura di sopra per la scansione)
		for (int i = 0; i < matrice.length; i++) {
			int[] riga = matrice[i];
			// vado sulle colonne
			for (int j = 0; j < riga.length; j++) {
				System.out.print(riga[j]);
				if (j != riga.length - 1) { // stampa se non uguale all'ultima col
					System.out.print(" ");
				}
			}
			System.out.println(); // vado a capo
		}
	}

}
