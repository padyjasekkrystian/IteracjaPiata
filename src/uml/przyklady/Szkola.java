package uml.przyklady;

import java.util.*;

public class Szkola {

	// atrybut prosty, bez dodatkowych wymagan
	private String nazwa;
	private int rokPowstania;

	// atrybut powtarzalny, moze miec wiecej niz jedna wartosc, na UML: [1..*]
	private List<String> profile = new ArrayList<>();

	// atrybut opcjonalny, niektore obiekty maja wartosc dla tego atrybutu a
	// niektore nie, na UML: [0..1]
	private String wyroznienie;

	// atrybut unikalny, niepowtarzalny w ramach danej ekstensji, na UML: {unique}
	private int numer;

	// atrybut klasowy, ma taka sama wartosc dla kazdego obiektu danej klasy, na UML
	// podkreslony
	private static int minLiczbaUczniow = 150;

	private static List<Szkola> ekstensja = new ArrayList<>();

	// dla asocjacji z uczniem, licznosc *
	private List<Uczen> uczniowie = new ArrayList<>();
	private List<Sala> sale = new ArrayList<>();

	public Szkola(String nazwa, int numer, int rokPowstania) {
		this.nazwa = nazwa;
		this.rokPowstania = rokPowstania;
		setNumer(numer);
		ekstensja.add(this);
	}

	public Szkola(String nazwa, String wyroznienie, int numer, int rokPowstania) {
		this.nazwa = nazwa;
		this.wyroznienie = wyroznienie;
		this.rokPowstania = rokPowstania;
		setNumer(numer);
		ekstensja.add(this);
	}
	
	public void dodajSale(Sala sala) throws Exception {
		sale.add(sala);
	}
	
	public void usunSale(Sala sala) {
		sale.remove(sala);
	}
	

	// metoda dodajaca ucznia do szko³y
	public void dodajUcznia(Uczen uczen) throws Exception {
		
		if(uczen.getSzkola() != null) {
			throw new Exception("Uczen ma przypisana ju¿ szko³ê");
		}
				
		uczniowie.add(uczen);
		//informacja zwrotna, chcemy zeby asocjacja by³a w dwie strony
		uczen.setSzkola(this);
	}

	public void usunUcznia(Uczen uczen) {
		if (uczniowie.contains(uczen)) {
			uczniowie.remove(uczen);
			uczen.setSzkola(null);
		}
	}

	// atrybut wyczaliny, opisany za pomoca metody
	public int obliczWiek() {
		return Calendar.getInstance().get(Calendar.YEAR) - rokPowstania;
	}

	// metoda dodajaca nowa wartosc do listy atrybutu powarzalnego
	public void dodajProfil(String profil) {
		if (!profile.contains(profil)) {
			profile.add(profil);
		}
	}

	// metoda usuwjaca cos z listy
	public void usunProfil(String profil) {
		profile.remove(profil);
	}

	// metoda wyswietlacjaca cala liste
	public void wyswietlProfile() {
		System.out.println("W szkole " + nazwa + " s¹ nastepujace profile: ");
		for (String profil : profile) {
			System.out.println(profil + " ");
		}
	}
	
	

	public List<Sala> getSale() {
		return sale;
	}

	public void setSale(List<Sala> sale) {
		this.sale = sale;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public String getWyroznienie() {
		return wyroznienie;
	}

	public void setWyroznienie(String wyroznienie) {
		this.wyroznienie = wyroznienie;
	}

	// getter do listy
	public List<String> getProfile() {
		return profile;
	}

	public int getNumer() {
		return numer;
	}

	public void setNumer(int numer) {
		for (Szkola element : ekstensja) {
			if (element.getNumer() == numer) {
				throw new IllegalArgumentException("Numer musi byc unikalny!");
			}
		}
		this.numer = numer;
	}

	public static int getMinLiczbaUczniow() {
		return minLiczbaUczniow;
	}

	public static void setMinLiczbaUczniow(int minLiczbaUczniow) {
		Szkola.minLiczbaUczniow = minLiczbaUczniow;
	}

	public List<Uczen> getUczniowie() {
		return uczniowie;
	}

	public String toString() {
		return nazwa;
	}

}
