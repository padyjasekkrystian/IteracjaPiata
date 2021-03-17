package uml.moje;

import java.util.ArrayList;
import java.util.List;

public class Samochod {
	
	private String marka, model;
	private List<Pracownik> uzytkownicy = new ArrayList<>();
	private List<SamochodNaprawa> samochodNaprawa = new ArrayList<>();

	public Samochod(String marka, String model) {
		super();
		this.marka = marka;
		this.model = model;
	}
	public void dodajSamochodNaprawa(SamochodNaprawa sn) {
		samochodNaprawa.add(sn);
	}
	
	public void dodajPracownika(Pracownik pracownik) throws Exception {
		if(pracownik.getSamochod() != null) {
			throw new Exception("Pracownik ju¿ ma przypisany samochód");
		}
		uzytkownicy.add(pracownik);
		pracownik.setSamochod(this);
	}
	
	public void usunPracownika(Pracownik pracownik) {
		if(uzytkownicy.contains(pracownik)) {
		uzytkownicy.remove(pracownik);
		}
		pracownik.setSamochod(null);
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public String toString() {
		return marka + " " + model;
	}

}
