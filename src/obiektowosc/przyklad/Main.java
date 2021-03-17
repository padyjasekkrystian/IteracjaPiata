package obiektowosc.przyklad;

public class Main {

	public static void main(String[] args) {
		
		Motocykl m1 = new Motocykl("Yamaha", "fz6", "naked", 98, 2006);
		Motocykl m2 = new Motocykl("Ktm", "exc", "enduro", 45, 2013);
		Motocykl m3 = new Motocykl("Ktm", "duke", "naked", 200, 2018);
		Motocykl m4 = new Motocykl("Yamaha", "R1", "sport", 180, 2006);

		
		System.out.println(Motocykl.mocniejszeOd150(Motocykl.getEkstensja()));
		System.out.println(Motocykl.danaMarka(Motocykl.getEkstensja(), "Ktm"));
	}

}
