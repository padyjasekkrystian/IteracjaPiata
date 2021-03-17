package uml.przyklady;

import java.util.*;

public class Sprawdzian {
	
	private String przedmiot;
	private List <UczenSprawdzian> uczenSprawdzian = new ArrayList<>();

	public Sprawdzian(String przedmiot) {
		this.przedmiot = przedmiot;
	}
	
	public void dodajUczenSprawdzian(UczenSprawdzian us) {
		uczenSprawdzian.add(us);
	}

	public String getPrzedmiot() {
		return przedmiot;
	}

	public void setPrzedmiot(String przedmiot) {
		this.przedmiot = przedmiot;
	}
	
	public String toString() {
		return przedmiot;
	}
	
	
	
	

}
