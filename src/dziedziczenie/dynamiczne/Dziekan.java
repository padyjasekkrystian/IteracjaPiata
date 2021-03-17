package dziedziczenie.dynamiczne;

public class Dziekan extends Osoba{
	
	private String tytul;

	public Dziekan(Osoba o, String tytul) {
		super(o.getImie(), o.getNazwisko());
		this.tytul = tytul;		
	}

	public String getTytul() {
		return tytul;
	}

	public void setTytul(String tytul) {
		this.tytul = tytul;
	}
	
	public String toString() {
		return getClass().getSimpleName() + ": " + getImie() + " " + getNazwisko() + " ma tytul " + tytul;

	}

}
