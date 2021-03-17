package uml.moje;

import java.util.*;

public class Pracownik {
	private String imie, nazwisko, pesel;
	private int liczbaGodzin, premia;
	private static int minimalnaPensja = 3500;
	private Pracownik szef;
	private Samochod samochod;
	private Zakwaterowanie zakwaterowanie;
	private List<String> zlecenia = new ArrayList<>();
	private List<Firma> firmy = new ArrayList<>();
	private List<Pracownik> podwladni = new ArrayList<>();
	private static List<Pracownik> ekstensja = new ArrayList<>();
	
	public Pracownik(String imie, String nazwisko, String pesel, int liczbaGodzin, int premia) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.liczbaGodzin = liczbaGodzin;
		this.premia = premia;
		setPesel(pesel);
		ekstensja.add(this);
	}
	public Pracownik(String imie, String nazwisko, String pesel, int liczbaGodzin) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.liczbaGodzin = liczbaGodzin;
		setPesel(pesel);
		ekstensja.add(this);
	}
	public void dodajPodwladnego(Pracownik pracownik) throws Exception {
		if(podwladni.contains(pracownik) == true) {
			throw new Exception("Pracownik jest juz podwladny");
		}
		podwladni.add(pracownik);
		pracownik.setSzef(this);
	}
	public void usunPodwladnego(Pracownik pracownik) {
		podwladni.remove(pracownik);
		pracownik.setSzef(null);
	}
	public void wyswietlSzefow() {
		if(szef != null) {
		System.out.println(szef);
		szef.wyswietlSzefow();
		}
	}
	
	//jesli dodajemt podwladnego podwladnemu i on ma szefa to ma miec dwoch szefow 
	
	public void dodajFirme(Firma firma) {
		firmy.add(firma);
	}
	
	//atrybut wyliczalny
	public int obliczPensje(int stawka) {
		return stawka * liczbaGodzin + getPremia();
	}
	public void dodajZlecenie(String zlecenie) {
		zlecenia.add(zlecenie);
	}
	public void usunZlecenie(String zlecenie) {
		zlecenia.remove(zlecenie);
	}
	public void wyswietlZlecenia() {
		System.out.println("Pracownik " + imie + " " + nazwisko + " ma nastepujace zlecenia: ");
		for(String element : zlecenia) {
			System.out.print(element + " ");
		}
	}
	
	public Pracownik getSzef() {
		return szef;
	}
	public void setSzef(Pracownik szef) {
		this.szef = szef;
	}
	public List<Pracownik> getPodwladni() {
		return podwladni;
	}
	public void setPodwladni(List<Pracownik> podwladni) {
		this.podwladni = podwladni;
	}
	public Samochod getSamochod() {
		return samochod;
	}
	public void setSamochod(Samochod samochod) {
		this.samochod = samochod;
	}
	
	public Zakwaterowanie getZakwaterowanie() {
		return zakwaterowanie;
	}
	public void setZakwaterowanie(Zakwaterowanie zakwaterowanie) {
		this.zakwaterowanie = zakwaterowanie;
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
	public String getPesel() {
		return pesel;
	}
	//troche bez sensu bo peselu raczej sie nie zmeinia, chyba ze mozna zalozyc ze chcemy go poprawic
	public void setPesel(String pesel) {
		for(Pracownik element : ekstensja) {
			if(element.getPesel().equals(pesel)) {
				throw new IllegalArgumentException("PESEL musi byc unikalny");
			}
		}
		
		this.pesel = pesel;
	}
	public int getPremia() {
		return premia;
	}
	public void setPremia(int premia) {
		this.premia = premia;
	}
	public static int getMinimalnaPensja() {
		return minimalnaPensja;
	}
	public static void setMinimalnaPensja(int minimalnaPensja) {
		Pracownik.minimalnaPensja = minimalnaPensja;
	}
	public List<String> getZlecenia() {
		return zlecenia;
	}
	public void setZlecenia(List<String> zlecenia) {
		this.zlecenia = zlecenia;
	}
	public String toString() {
		return imie + " " + nazwisko;
	}
	
	

}
