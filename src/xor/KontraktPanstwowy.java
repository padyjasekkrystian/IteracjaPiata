package xor;

public class KontraktPanstwowy {
	
	private int numerSeryjny;
	private Lekarz lekarz;

	public KontraktPanstwowy(int numerSeryjny) {
		this.numerSeryjny = numerSeryjny;
	}
	
	public void dodajLekarza(Lekarz lekarz) {
		if(!lekarz.getPowiazanie()) {			
			lekarz.setKontraktPanstwowy(this);
			lekarz.jestPowiazanie();			
		}else {
			throw new IllegalArgumentException("Lekarz ma juz przypisany kontrakt");
		}
	}

	public int getNumerSeryjny() {
		return numerSeryjny;
	}

	public void setNumerSeryjny(int numerSeryjny) {
		this.numerSeryjny = numerSeryjny;
	}
	
	
	
	
	
	
	

}
