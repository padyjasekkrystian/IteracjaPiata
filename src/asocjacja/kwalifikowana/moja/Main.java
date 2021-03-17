package asocjacja.kwalifikowana.moja;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Uzytkownik u1 = new Uzytkownik("Monika", "Blicharz");
		Uzytkownik u2 = new Uzytkownik("Krystian", "Padyjasek");
		
		Komputer k1 = new Komputer("Lenovo", "laptop");
		Komputer k2 = new Komputer("MacBook", "laptop");
		Komputer k3 = new Komputer("Pudelko", "stacjonarny");
		
		u1.dodajKomputer(k3);
		u1.dodajKomputer(k2);
		u1.dodajKomputer(k1);
		u2.dodajKomputer(k1);
		
		Uzytkownik.pokazUzytkownikow("Lenovo").wyswietlUzytkownikow();
		System.out.println(Uzytkownik.pokazUzytkownikow("MacBook"));

	}

}
