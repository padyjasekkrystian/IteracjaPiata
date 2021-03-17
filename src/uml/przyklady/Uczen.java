package uml.przyklady;

import java.util.ArrayList;
import java.util.List;

public class Uczen extends Osoba {

	private double sredniaOcen;

	// pole klasy Szkola, dla asocjacji licznosci 1
	private Szkola szkola;
	private Klasa klasa;
	private List <UczenSprawdzian> uczenSprawdzian = new ArrayList<>();


	public Uczen(String imie, String nazwisko, String adres, double sredniaOcen) {
		// metoda super pozwala skopiowac konstruktor z nadklasy
		super(imie, nazwisko, adres);
		this.sredniaOcen = sredniaOcen;
	}
	
	public void dodajUczenSprawdzian(UczenSprawdzian us) {
		uczenSprawdzian.add(us);
	}
	

	public Klasa getKlasa() {
		return klasa;
	}

	public void setKlasa(Klasa klasa) {
		this.klasa = klasa;
	}

	public double getSredniaOcen() {
		return sredniaOcen;
	}

	public void setSredniaOcen(double sredniaOcen) {
		this.sredniaOcen = sredniaOcen;
	}

	public Szkola getSzkola() {
		return szkola;
	}

	public void setSzkola(Szkola szkola) {
		this.szkola = szkola;
	}
	
	public String toString() {
		return getImie() + " " + getNazwisko();
	}

}
