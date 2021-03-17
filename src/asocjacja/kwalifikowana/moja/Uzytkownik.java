package asocjacja.kwalifikowana.moja;

import java.util.*;

import asocjacja.kwalifikowana.Basen;

public class Uzytkownik {
	
	private String imie, nazwisko;
	private static Map<String, Komputer> komputery = new HashMap<>();

	public Uzytkownik(String imie, String nazwisko) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
	}
	
	public void dodajKomputer(Komputer komputer) {
		if(!komputery.containsKey(komputer.getNazwa())) {
			komputery.put(komputer.getNazwa(), komputer);
		}
		
		komputer.dodajUzytkownika(this);
	}
	
	public static Komputer pokazUzytkownikow(String nazwa) throws Exception {
		if(!komputery.containsKey(nazwa)) {
			throw new Exception("B³êdna nazwa komputera");
		}
		
		return komputery.get(nazwa);
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
