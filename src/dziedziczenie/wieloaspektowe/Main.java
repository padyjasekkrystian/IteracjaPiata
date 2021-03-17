package dziedziczenie.wieloaspektowe;

public class Main {

	public static void main(String[] args) {
		
		Tir t1 = new Tir("Scania", "AB123", 2);
		Tir t2 = new Tir("Volvo", "cde1", "Bosch");
		
		Osobowy o1 = new Osobowy("Audi", "A4", 5);
		Osobowy o2 = new Osobowy("Citroen", "Berlingo", "abcde");
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(o1);
		System.out.println(o2);

	}

}
