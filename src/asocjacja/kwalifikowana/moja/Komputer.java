package asocjacja.kwalifikowana.moja;

import java.util.*;

public class Komputer {
	
	private String nazwa, typ;
	private List<Uzytkownik> uzytkownicy = new ArrayList<>();

	public Komputer(String nazwa, String typ) {
		super();
		this.nazwa = nazwa;
		this.typ = typ;
	}
	
	public void dodajUzytkownika(Uzytkownik uzytkownik) {
		if(!uzytkownicy.contains(uzytkownik)) {
			uzytkownicy.add(uzytkownik);
		}
	}
	
	public void wyswietlUzytkownikow() {
		System.out.println("Komputer: " + nazwa + " Przewija³ siê przez rêce: " + uzytkownicy);
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public String getTyp() {
		return typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}
	
	public String toString() {
		return nazwa;
	}
	
	

}
