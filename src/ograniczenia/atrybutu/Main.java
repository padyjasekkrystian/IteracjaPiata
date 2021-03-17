package ograniczenia.atrybutu;

public class Main {

	public static void main(String[] args) {
		Pracownik p1 = new Pracownik("Mariusz", "Pudzianowski", 3000, 1);
		
		p1.dajPodwyzke(400);
		
		System.out.println(p1.getPensja());

	}

}
