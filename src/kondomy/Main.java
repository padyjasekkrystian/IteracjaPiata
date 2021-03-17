package kondomy;

public class Main {
	public static void main(String[] args) {

		/*
		 * Klient kupuje produkty. Klient ma imie nazwisko i rozmiar kutasa. Pordukt ma
		 * nazwe, cene i jesli jest to kondom to wymiar. Klient moze miec wiele
		 * produktow, produkt moze miec jednego klienta. 1) Napisz mrtode ktota znajduje
		 * klienta ktory wydal najwiecej. 2) napisz metode ktora zwroci liste klientow
		 * ktorzy kupili durexa 3) napisz metode ktora zwroci liste klientow ktorzy
		 * kupili durexy ale nie na swoj rozmiar kutasa
		 */
		
		Klient k1 = new Klient("Marek", "Gleñ", "S");
		Klient k2 = new Klient("Krystian", "Padyjasek", "XXL");
		Produkt p1 = new Produkt("Durex", "XL", 20);
		Produkt p2 = new Produkt("Skyn", "L", 8);
		Produkt p3 = new Produkt("Szynka", 15);
		k1.dodajProdukt(p1);
		k2.dodajProdukt(p2);
		k2.dodajProdukt(p3);
		
		System.out.println(Klient.zlyKutas(Klient.getEkstensja()));
		System.out.println(Klient.kupiliDurexa(Klient.getEkstensja()));
		System.out.println(Klient.wydalNajwiecej(Klient.getEkstensja()));
		
	}

}
