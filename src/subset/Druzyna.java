package subset;

import java.util.*;

public class Druzyna {
	
	private String nazwa;
	
	private List<Zawodnik> czlonkowie = new ArrayList<>();
	private List<Zawodnik> kapitanowie = new ArrayList<>();

	public Druzyna(String nazwa) {
		this.nazwa = nazwa;
	}
	
	public void dodajZawodnika(Zawodnik zawodnik) {
		czlonkowie.add(zawodnik);
		zawodnik.dodajDruzyne(this);
		zawodnik.czyJestWDruzynie = true;
	}
	public void dodajKapitana(Zawodnik zawodnik) {
		if(!czlonkowie.contains(zawodnik)) {
			throw new IllegalArgumentException("Nie ma go w tej druzynie");
		}
		kapitanowie.add(zawodnik);
	}
	
	

	public List<Zawodnik> getCzlonkowie() {
		return czlonkowie;
	}

	public void setCzlonkowie(List<Zawodnik> czlonkowie) {
		this.czlonkowie = czlonkowie;
	}

	public List<Zawodnik> getKapitanowie() {
		return kapitanowie;
	}

	public void setKapitanowie(List<Zawodnik> kapitanowie) {
		this.kapitanowie = kapitanowie;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	

}
