package subset;

public class Main {

	public static void main(String[] args) {
		Zawodnik z1 = new Zawodnik("Bartek", "Flisu");
		Zawodnik z2 = new Zawodnik("Agata", "Kwiecinska");
		
		Druzyna d1 = new Druzyna("piast dziewice");
		
		d1.dodajZawodnika(z1);
		d1.dodajKapitana(z1);
		
		d1.dodajZawodnika(z2);
		
		System.out.println(d1.getCzlonkowie());
		System.out.println(d1.getKapitanowie());
	}

}
