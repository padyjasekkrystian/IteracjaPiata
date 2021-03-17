package dziedziczenie.dynamiczne;

public class Wykladowca extends Osoba {
	
	private int pensja;

	public Wykladowca(Osoba o, int pensja) {
		super(o.getImie(), o.getNazwisko());
		this.pensja = pensja;		
	}

	public int getPensja() {
		return pensja;
	}

	public void setPensja(int pensja) {
		this.pensja = pensja;
	}
	 
	public String toString() {
		return getClass().getSimpleName() + ": " + getImie() + " " + getNazwisko() + " ma pensje " + pensja;

	}
}
