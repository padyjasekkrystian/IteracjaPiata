package uml.przyklady;

import java.util.ArrayList;
import java.util.List;

public class Klasa {
	
	private String nazwa;
	private List<Uczen> uczniowie = new ArrayList<>();
	

	public Klasa(String nazwa) {
		this.nazwa = nazwa;
	}
	
	public void dodajUcznia(Uczen uczen) throws Exception {
		if(uczen.getKlasa() != null) {
			throw new Exception("Uczen ma juz przypisana klase");
		}
		uczniowie.add(uczen);
		uczen.setKlasa(this);
	}
	
	public void usunUcznia(Uczen uczen) {
		uczniowie.remove(uczen);
		uczen.setKlasa(null);
	}


	public String getNazwa() {
		return nazwa;
	}


	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	
	public String toString() {
		return nazwa;
	}
	
	

}
