package xor;

public class Main {

	public static void main(String[] args) {
		
		Lekarz l1 = new Lekarz("Krsytian", "Padyjasek");
		KontraktPanstwowy kpa1 = new KontraktPanstwowy(45);
		KontraktPrywatny kpr1 = new KontraktPrywatny("abc");
		
		kpa1.dodajLekarza(l1);
		System.out.println(l1.getKontraktPanstwowy());
		kpr1.dodajLekarza(l1);
	}

}
