package xor;

public class KontraktPrywatny {
	
	private String nazwa;

	public KontraktPrywatny(String nazwa) {
		this.nazwa = nazwa;
	}
	
	public void dodajLekarza(Lekarz lekarz) {
		if(!lekarz.getPowiazanie()) {			
			lekarz.setKontraktPrywatny(this);
			lekarz.jestPowiazanie();			
		}else {
			throw new IllegalArgumentException("Lekarz ma juz przypisany kontrakt");
		}
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	
	
	

}
