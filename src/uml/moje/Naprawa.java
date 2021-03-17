package uml.moje;

import java.util.*;


public class Naprawa {
	
	private String zakres;
	private List<SamochodNaprawa> samochodNaprawa = new ArrayList<>();

	public Naprawa(String zakres) {
		this.zakres = zakres;
	}
	public void dodajSamochodNaprawa(SamochodNaprawa sn) {
		samochodNaprawa.add(sn);
	}

	public String getZakres() {
		return zakres;
	}

	public void setZakres(String zakres) {
		this.zakres = zakres;
	}
	
	public String toString() {
		return zakres;
	}
	
	

}
