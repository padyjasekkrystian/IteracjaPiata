package asocjacja.kwalifikowana;

import java.util.*;

public class Plywak {
	private String imie, nazwisko;
	
	private static Map<String, Basen> baseny = new HashMap<>();

	public Plywak(String imie, String nazwisko) {
		this.imie = imie;
		this.nazwisko = nazwisko;
	}

	public void dodajBasen(Basen basen) {
		if(!baseny.containsKey(basen.getNazwa())) {
			baseny.put(basen.getNazwa(), basen);
		}
		
		basen.dodajPlywaka(this);
	}
	
	public static Basen pokazPlywakow(String nazwa) throws Exception {
		if(!baseny.containsKey(nazwa)) {
			throw new Exception("B³êdna nazwa basenu");
		}
		
		return baseny.get(nazwa);
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
