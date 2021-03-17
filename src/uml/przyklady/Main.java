package uml.przyklady;

public class Main {

	public static void main(String[] args) throws Exception {
		Szkola s1 = new Szkola("Gimnazjum w Radomiu", 1, 1962);

		Szkola s3 = new Szkola("Podstawowa w Bilgoraju", 2, 1980);
		
		s1.dodajProfil("Ekonomiczny");
		s1.dodajProfil("Informatyczny");
		s1.dodajProfil("Budowlany");
		
		s1.wyswietlProfile();
		
		s1.usunProfil("Informatyczny");
		s1.wyswietlProfile();
		
		Szkola s2 = new Szkola("Liceum w Sosnowcu", "Wyroznienie prezesa", 3, 2006);
		System.out.println(s2.getWyroznienie());
	
		System.out.println(Szkola.getMinLiczbaUczniow());
		
		Szkola.setMinLiczbaUczniow(200);
		
		System.out.println(Szkola.getMinLiczbaUczniow());
		
		System.out.println("Wiek szko³y: " + s1.obliczWiek());
		
		Uczen u1 = new Uczen("Krystian", "Padyjasek", "Warszawa", 5.0);
		System.out.println(u1);
		System.out.println(u1.getAdres());
		u1.setAdres("Bilgoraj");
		System.out.println(u1.getAdres());
		
		Uczen u2 = new Uczen("Marek", "Mostowiak", "Radom", 3.5);
		Uczen u3 = new Uczen("Krzysztof", "Zapala", "Tarnogrod", 4.2);
		
		//tworzymy asocjacje pomiedzy szkola a uczniem
		s1.dodajUcznia(u1);
	
		
		System.out.println(s1.getUczniowie());
		

		
		System.out.println(u2.getSzkola());
		
		Nauczyciel n1 = new Nauczyciel("Dorota", "Kowal", "Kosciuszki", 3200);
		Nauczyciel n2 = new Nauczyciel("Tomasz", "Momot", "Kopernika", 3500);
		Dziennik d1 = new Dziennik("2a", "granatowy");
		Dziennik d2 = new Dziennik("1c", "bordowy");
		
		n1.dodajDziennik(d2);
		n1.dodajDziennik(d1);
		n1.wyswitelDzienniki();
		
		Sprawdzian sp1 = new Sprawdzian("Matematyka");
		Sprawdzian sp2 = new Sprawdzian("Fizyka");
		UczenSprawdzian us1 = new UczenSprawdzian(5.0, sp1, u1);
		UczenSprawdzian us2 = new UczenSprawdzian(3.5, sp2, u1);
		System.out.println(us1);
		System.out.println(us2);
		
		Sala sa1 = new Sala("Gimnastyczna", s1);
		Sala sa2 = new Sala("Informatyczna", s1);
		Klasa k1 = new Klasa("1b");
		
		System.out.println(sa1);
		System.out.println(s1.getSale());
		

	}

}
