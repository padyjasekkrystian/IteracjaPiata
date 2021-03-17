package obiektowosc.pierwsza;

import java.util.*;

public class Samochod {

	// pola klasy, atrybuty

	// pole final nie moze byc modyfikowane
	private final String marka, model;
	private String kolor;
	private int przebieg, rokProdukcji;

	// ekstensja klasy Samochod
	private static List<Samochod> ekstensja = new ArrayList<>();

	// konstruktor klasy Samochod, uruchamiany w momencie tworzenia obiektu, za
	// pomoca slowa kluczowego new
	// nic nie zwracaja i nie deklaruja typu zwracanego, nazwa identyczna jak nazwa
	// klasy
	// kontruktor wymusza odpowiednia budowe obiektu

	public Samochod(String marka, String model, String kolor, int przebieg, int rokProdukcji) {
		// this wskazuje ktora wartosc to pole klasy
		this.marka = marka;
		this.model = model;
		this.kolor = kolor;
		this.przebieg = przebieg;
		this.rokProdukcji = rokProdukcji;

		// dodawanie automatyczne do ekstensji
		ekstensja.add(this);
	}

	//ta metoda niej est statyczna poniewaz jest wywolywana dla konkretnego obiektu
	public int obliczWiek() {
		return Calendar.getInstance().get(Calendar.YEAR) - rokProdukcji;
	}
	
	//napisz metode ktora znajduje najstarszy samochod
	public static Samochod znajdzNajstarszy(List<Samochod> lista) {
		Samochod najstarszy = lista.get(0);
		
		for(Samochod s : lista) {
			if(najstarszy.obliczWiek() < s.obliczWiek()) {
				najstarszy = s;
			}
		}
		
		return najstarszy;
	}

	// alt + shift + s

	// gettery zwracaja pole klasy
	public String getKolor() {
		return kolor;
	}

	// settery ustawiaja nowa wartosc dla pola klasy
	public void setKolor(String kolor) {
		this.kolor = kolor;
	}

	public int getPrzebieg() {
		return przebieg;
	}

	public void setPrzebieg(int przebieg) {
		this.przebieg = przebieg;
	}

	public int getRokProdukcji() {
		return rokProdukcji;
	}

	public void setRokProdukcji(int rokProdukcji) {
		this.rokProdukcji = rokProdukcji;
	}

	public String getMarka() {
		return marka;
	}

	public String getModel() {
		return model;
	}

	public static List<Samochod> getEkstensja() {
		return ekstensja;
	}

	// przes³oniecie metody toString, napisanie wlasnego returna do juz istnieajcej
	// metody
	public String toString() {
		return marka + " " + model;
	}

}
