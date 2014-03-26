package zaino;

import java.util.ArrayList;

public class Zaino {
	private String marcaModello;
	private String proprietario;
	private int massimoNumeroDiCose;
	private ArrayList<Cosa> cose;
	
	public Zaino(String mm, String p, int max) {
		marcaModello = mm;
		proprietario = p;
		massimoNumeroDiCose = max;
		creaCose();
	}

	private void creaCose() {
		cose = new ArrayList<Cosa>();
		cose.add(new Cosa("Penna", "Penna nera"));
		cose.add(new Cosa("Quaderno", "Quaderno quadri"));
		cose.add(new Cosa("Libro", "Libro bianco"));
	}
	
	public String getMarcaModello() {
		return marcaModello;
	}
	
	public String getProprietario() {
		return proprietario;
	}
	
	public int getMassimoNumeroDiCose() {
		return massimoNumeroDiCose;
	}
	
	public void setMarcaModello(String s) {
		marcaModello = s;
	}
	
	public void setProprietario(String p) {
		proprietario = p;
	}
	
	public void setMassimoNumeroDiCose(int m) {
		massimoNumeroDiCose = m;
	}
	
	public void elencaCose() {
		for (int i = 0; i < cose.size(); i++) {
			Cosa c = cose.get(i);
			int pos = i + 1;
			System.out.println(pos + ") " + c.getNome() + " - " + c.getDescrizione());
		}
	}
	
	public Cosa prendiCosa(int posizione) {
		int i = posizione - 1;
		Cosa c = cose.get(i);
		cose.remove(i); // rimuovo dalla lista delle cose
		return c;
	}
	
	public boolean inserisciCosa(Cosa c) {
		if (massimoNumeroDiCose > cose.size()) {
			cose.add(c);
			return true;
		} else {
			return false;
		}
	}
	
}
