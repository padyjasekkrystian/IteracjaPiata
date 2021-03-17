package subset;

import java.util.*;

public class Zawodnik {
	
	private String imie, nazwisko;
	public boolean czyJestWDruzynie = false;
	
	private List<Druzyna> druzyny = new ArrayList<>();

	public Zawodnik(String imie, String nazwisko) {
		this.imie = imie;
		this.nazwisko = nazwisko;
	}
	
	public void dodajDruzyne(Druzyna druzyna) {
		druzyny.add(druzyna);
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	
	public String toString() {
		return imie + " " + nazwisko;
	}
	
	
	
	

}
