package zaino;

public class Cosa {
	private String nome;
	private String descrizione;
	
	public Cosa(String n, String d) {
		nome = n;
		descrizione = d;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	
	public void setNome(String n) {
		nome = n;
	}
	
	public void setDescrizione(String d) {
		descrizione = d;
	}
}
