package uml.przyklady;

import java.util.*;

public class Nauczyciel extends Osoba {
	
	private List<Dziennik> dzienniki = new ArrayList<>();
	private double pensja;

	public Nauczyciel(String imie, String nazwisko, String adres, double pensja) {
		super(imie, nazwisko, adres);
		this.pensja = pensja;
	}
	
	public void dodajDziennik(Dziennik dziennik) {
		dzienniki.add(dziennik);
		dziennik.dodajNauczyciela(this);
	}
	
	public void wyswitelDzienniki() {
		for(Dziennik dziennik : dzienniki) {
			System.out.println(dziennik);
		}
	}
	
	public double getPensja() {
		return pensja;
	}

	public void setPensja(double pensja) {
		this.pensja = pensja;
	}
	
	public String toString() {
		return getImie() + " " + getNazwisko();
	}
	

}
