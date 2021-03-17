package dziedziczenie.dynamiczne;

public class Main {

	public static void main(String[] args) {

		Osoba o = new Student("Jan", "Kowalski", 1234);
		System.out.println(o);
		
		o = new Wykladowca(o, 3000);
		System.out.println(o);
		
		o = new Dziekan(o,"super dziekan");
		System.out.println(o);

	}

}
