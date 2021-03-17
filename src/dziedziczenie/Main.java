package dziedziczenie;

public class Main {

	public static void main(String[] args) {
		
		Samochod s1 = new Samochod("Volkswagen", "Passat", "diesel");
		Motocykl m1 = new Motocykl("Yamaha", "fz6", "naked");
		Rower r1 = new Rower("Romet", "Wigry", "sportowy");
		
		System.out.println(s1.zwrocNazwe());
		System.out.println(m1.zwrocNazwe());
		System.out.println(r1.zwrocNazwe());
		}

}
