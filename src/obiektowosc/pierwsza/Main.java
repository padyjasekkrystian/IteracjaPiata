package obiektowosc.pierwsza;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		/*
		 * Klasa - naturalny opis obiekty, zawiera zestaw cech (atrybutow) oraaz metod
		 * dla danego obiektu- Pies
		 * 
		 * obiekt - wystapienie (instancja klasy), konkretny byt - ten konkretny pies
		 * Azor
		 * 
		 * Ekstensja klasy - zbior wszystkich obiektów danej klasy
		 */

		Samochod s1 = new Samochod("Opel", "Astra", "czerwony", 30000, 2001);

		System.out.println(s1.getKolor());
		s1.setKolor("czarny");

		System.out.println(s1.getKolor());

		System.out.println(s1);

		System.out.println("Wiek auta: " + s1.obliczWiek());

		Samochod s2 = new Samochod("Daewoo", "Matiz", "zloty", 120000, 1998);
		Samochod s3 = new Samochod("Mercedes", "Cla", "czarny", 15000, 2018);

		System.out.println(Samochod.getEkstensja());
		
		System.out.println(Samochod.znajdzNajstarszy(Samochod.getEkstensja()));
	
	}
	

}
