package kondomy;

public class Produkt {
	
	private String nazwa, rozmiar;
	private double cena;
	private Klient klient;
	
	public Produkt(String nazwa, String rozmiar, double cena) {
		this.nazwa = nazwa;
		this.rozmiar = rozmiar;
		this.cena = cena;
	}
	
	public Produkt(String nazwa, double cena) {
		this.nazwa = nazwa;
		this.cena = cena;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public String getRozmiar() {
		return rozmiar;
	}

	public void setRozmiar(String rozmiar) {
		this.rozmiar = rozmiar;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public Klient getKlient() {
		return klient;
	}

	public void setKlient(Klient klient) {
		this.klient = klient;
	}
	
	
	
	
	

}
