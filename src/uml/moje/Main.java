package uml.moje;

public class Main {

	public static void main(String[] args) throws Exception {
		Pracownik p1 = new Pracownik("Marek", "Mostowiak", "93082307452", 200, 300);
		Pracownik p2 = new Pracownik("Fred", "Flinston", "87021285319", 160);
		Pracownik p3 = new Pracownik("Krzysiek", "Kononowicz", "65110475231", 150, 50);
		Pracownik p4 = new Pracownik("Bartek", "Flis", "65110465231", 150, 30);

		
		System.out.println(p1.obliczPensje(30));
		System.out.println(p2.obliczPensje(40));
		
		p1.dodajZlecenie("Szpachlowanie");
		p1.dodajZlecenie("Malowanie");
		p1.wyswietlZlecenia();
		p1.usunZlecenie("Szpachlowanie");
		p1.wyswietlZlecenia();
		System.out.println();
		System.out.println(Pracownik.getMinimalnaPensja());
		System.out.println(p1.getPesel());
		p1.setPesel("75010112345");
		System.out.println(p1.getPesel());
		
		Firma f1 = new Firma("Siatpol");
		f1.dodajPracownika(p1);
		
		Samochod s1 = new Samochod("Porsche", "Panamera");
		Samochod s2 = new Samochod("Fiat", "Panda");
		
		p1.setSamochod(s1);
		System.out.println(p1.getSamochod());

		
		Zakwaterowanie z1 = new Zakwaterowanie("Poniatowskiego");
		z1.dodajPracownika(p1);
		System.out.println(p1.getZakwaterowanie());
		
		Naprawa n1 = new Naprawa("klocki hamulcowe");
		SamochodNaprawa sn1 = new SamochodNaprawa(n1, s1, 300);
		System.out.println(sn1);
		p1.dodajPodwladnego(p2);		
		p2.dodajPodwladnego(p3);
		p3.dodajPodwladnego(p4);
		p4.wyswietlSzefow();
		p2.usunPodwladnego(p3);
		p4.wyswietlSzefow();
		
		
	}

}
