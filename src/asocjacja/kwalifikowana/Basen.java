package asocjacja.kwalifikowana;

import java.util.*;

public class Basen {
	
	 private String nazwa;
	 private int powierzchnia;
	 private List<Plywak> plywacy = new ArrayList<>();
	 
	public Basen(String nazwa, int powierzchnia) {
		this.nazwa = nazwa;
		this.powierzchnia = powierzchnia;
	}
	
	public void dodajPlywaka(Plywak plywak) {
		if(!plywacy.contains(plywak)) {
			plywacy.add(plywak);
		}
	}
	
	public void wyswietlPlywakow() {
		System.out.println("W basenie " + nazwa + " sa zapisani p³ywacy: " + plywacy);
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public int getPowierzchnia() {
		return powierzchnia;
	}

	public void setPowierzchnia(int powierzchnia) {
		this.powierzchnia = powierzchnia;
	}
	
	public String toString() {
		return nazwa;
	}
	
	
	 
	 
	

}
