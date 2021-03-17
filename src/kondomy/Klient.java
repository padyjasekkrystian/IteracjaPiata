package kondomy;
import java.util.*;

public class Klient {
	
	private String imie, nazwisko, rozmiarKutasa;
	private List<Produkt> produkty = new ArrayList<>();
	private static List<Klient> ekstensja = new ArrayList<>();
	
	public Klient(String imie, String nazwisko, String rozmiarKutasa) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.rozmiarKutasa = rozmiarKutasa;
		ekstensja.add(this);
	}
	
	public void dodajProdukt(Produkt produkt) {
		if(produkt.getKlient() == null) {
			produkty.add(produkt);
			produkt.setKlient(this);
			}else {
			throw new IllegalArgumentException("Ktos juz ma ten produkt");
		}
	}
	
	public double kosztZakupow() {
		double koszt = 0;
		for(Produkt element: produkty) {
			koszt += element.getCena();
		}
		return koszt;
	}
	
	public static Klient wydalNajwiecej(List<Klient> klienci) {
		Klient najdrozszy = klienci.get(0);
		for(Klient klient : klienci) {
			if(klient.kosztZakupow() > najdrozszy.kosztZakupow()) {
				najdrozszy = klient;
			}
		}
		return najdrozszy;
	}
	
	public static List<Klient> kupiliDurexa(List<Klient> klienci){
		List<Klient> kupili = new ArrayList<>();
		for(Klient klient : klienci) {
			for(Produkt produkt : klient.getProdukty()) {
				if(produkt.getNazwa().equals("Durex") && !kupili.contains(klient)) {
					kupili.add(klient);
				}
			}
		}
		return kupili;
	}
	
	public static List<Klient> zlyKutas(List<Klient> klienci){
		List<Klient> kupiliZle = new ArrayList<>();
		for(Klient klient : klienci) {
			for(Produkt produkt : klient.getProdukty()) {
				if(produkt.getRozmiar() != null && !produkt.getRozmiar().equals(klient.getRozmiarKutasa()) && produkt.getNazwa().equals("Durex")) {
					kupiliZle.add(klient);
				}
			}
		}
		return kupiliZle;
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

	public String getRozmiarKutasa() {
		return rozmiarKutasa;
	}

	public void setRozmiarKutasa(String rozmiarKutasa) {
		this.rozmiarKutasa = rozmiarKutasa;
	}

	public List<Produkt> getProdukty() {
		return produkty;
	}

	public void setProdukty(List<Produkt> produkty) {
		this.produkty = produkty;
	}

	public static List<Klient> getEkstensja() {
		return ekstensja;
	}

	public static void setEkstensja(List<Klient> ekstensja) {
		Klient.ekstensja = ekstensja;
	}
	
	public String toString() {
		return imie + " " + nazwisko;
	}
	
	
	
	
	
	
	
	

}
