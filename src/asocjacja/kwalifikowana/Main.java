package asocjacja.kwalifikowana;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Basen b1 = new Basen("foka", 20);
		Basen b2 = new Basen("rekin", 50);
		
		Plywak p1 = new Plywak("Bartek", "Flis");
		Plywak p2 = new Plywak("Damian", "Marczak");
		Plywak p3 = new Plywak("Robert", "Krawczyk");
		
		p1.dodajBasen(b1);
		p2.dodajBasen(b1);
		p3.dodajBasen(b1);
		
		p2.dodajBasen(b2);
		p3.dodajBasen(b2);
		
	//	Plywak.pokazPlywakow("foka").wyswietlPlywakow();
		
		System.out.println(Plywak.pokazPlywakow("rekin"));
		
		Plywak.pokazPlywakow("rekin").wyswietlPlywakow();
	}

}
