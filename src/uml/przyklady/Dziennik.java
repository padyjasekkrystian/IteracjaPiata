package uml.przyklady;

import java.util.*;

public class Dziennik {
	
	private String klasa, kolor;
	
	private List<Nauczyciel> nauczyciele = new ArrayList<>();

	public Dziennik(String klasa, String kolor) {
		this.klasa = klasa;
		this.kolor = kolor;
	}
	
	public void dodajNauczyciela(Nauczyciel nauczyciel) {
		nauczyciele.add(nauczyciel);
	}

	public String getKlasa() {
		return klasa;
	}

	public void setKlasa(String klasa) {
		this.klasa = klasa;
	}

	public String getKolor() {
		return kolor;
	}

	public void setKolor(String kolor) {
		this.kolor = kolor;
	}
	
	public String toString() {
		return klasa;
	}
	
	
	

}
