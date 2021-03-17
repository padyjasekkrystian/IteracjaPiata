package xor;

public class Lekarz {
	
	private String imie, nazwisko;
	private KontraktPanstwowy kontraktPanstwowy;
	private KontraktPrywatny kontraktPrywatny;
	
	private boolean jestPowiazanie = false;

	public Lekarz(String imie, String nazwisko) {
		this.imie = imie;
		this.nazwisko = nazwisko;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	
	public void jestPowiazanie() {
		jestPowiazanie = true;
	}
	
	public boolean getPowiazanie() {
		return jestPowiazanie;
	}
	
	public KontraktPanstwowy getKontraktPanstwowy() {
		return kontraktPanstwowy;
	}

	public void setKontraktPanstwowy(KontraktPanstwowy kontraktPanstwowy) {
		this.kontraktPanstwowy = kontraktPanstwowy;
	}

	public KontraktPrywatny getKontraktPrywatny() {
		return kontraktPrywatny;
	}

	public void setKontraktPrywatny(KontraktPrywatny kontraktPrywatny) {
		this.kontraktPrywatny = kontraktPrywatny;
	}

	public String toString() {
		return "imie " + imie + " nazwisko " + nazwisko;
	}
	
	

}
