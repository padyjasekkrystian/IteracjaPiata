package uml.moje;

import java.util.*;

public class Firma {
	
	private String nazwa;
	private List<Pracownik> pracownicy = new ArrayList<>();
	

	public Firma(String nazwa) {
		this.nazwa = nazwa;
	}
	
	public void dodajPracownika(Pracownik pracownik) {
		pracownicy.add(pracownik);
		pracownik.dodajFirme(this);
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	
	
	

}
