package uml.moje;

import java.util.ArrayList;
import java.util.List;

public class Zakwaterowanie {

	private String adres, mieszkaniePracownicze;
	private List<Pracownik> mieszkancy = new ArrayList<>();
	private static List<Zakwaterowanie> ekstensja = new ArrayList<>();

	public Zakwaterowanie(String adres, String mieszkaniePracownicze) {		
		setAdres(adres);
		this.mieszkaniePracownicze = mieszkaniePracownicze;
		ekstensja.add(this);
	}
	public Zakwaterowanie(String adres) {
		setAdres(adres);
		ekstensja.add(this);
	}
	
	public void dodajPracownika(Pracownik pracownik) throws Exception {
		if(pracownik.getZakwaterowanie() != null) {
			throw new Exception("Pracownik ma juz przypisane zakwaterowanie");
		}
		mieszkancy.add(pracownik);
		pracownik.setZakwaterowanie(this);
	}
	public void usunPracownika(Pracownik pracownik) {
		if(mieszkancy.contains(pracownik)) {
			mieszkancy.remove(pracownik);
		}
		pracownik.setZakwaterowanie(null);
		
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		for(Zakwaterowanie element : ekstensja) {
			if(element.getAdres().equals(adres)) {
				throw new IllegalArgumentException("Ju¿ jest taki adres!");
			}
		}
		this.adres = adres;
	}

	public String getMieszkaniePracownicze() {
		return mieszkaniePracownicze;
	}

	public void setMieszkaniePracownicze(String mieszkaniePracownicze) {
		this.mieszkaniePracownicze = mieszkaniePracownicze;
	}
	
	public String toString() {
		return adres;
	}
	
	
	
}
