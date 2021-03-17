package wielodziedziczenie;

public class Wykladowca extends Osoba {
	
	private int pensja;

	public Wykladowca(String imie, String nazwisko, int pensja) {
		super(imie, nazwisko);
		this.pensja = pensja;
	}

	public int getPensja() {
		return pensja;
	}

	public void setPensja(int pensja) {
		this.pensja = pensja;
	}
	
	

}
