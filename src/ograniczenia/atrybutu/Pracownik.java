package ograniczenia.atrybutu;

import java.util.*;

public class Pracownik {
	
	private int id;
	private String imie, nazwisko;
	private double pensja;
	
	private static List<Pracownik> ekstensja = new ArrayList<>();
	
	public Pracownik(String imie, String nazwisko, double pensja, int id) {
		
		this.imie = imie;
		this.nazwisko = nazwisko;
		setPensja(pensja);
		setId(id);
		ekstensja.add(this);
	}
	
	public void dajPodwyzke(double podwyzka) {
		if(podwyzka > 500) {
			throw new IllegalArgumentException("Podwyzka jest za duza");
		}
		this.pensja = pensja + podwyzka;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		for(Pracownik element: ekstensja) {
			if(element.getId() == id) {
				throw new IllegalArgumentException("Id musi byc unikalne");
			}
		}
		this.id = id;
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

	public double getPensja() {
		return pensja;
	}
	
	

	public void setPensja(double pensja) {
		
		if(pensja < 3000) {
			throw new IllegalArgumentException("Pensja jest za mala.");
		}
		this.pensja = pensja;
	}
	
	
	
	

}
