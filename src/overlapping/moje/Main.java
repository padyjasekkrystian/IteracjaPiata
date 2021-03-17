package overlapping.moje;

public class Main {

	public static void main(String[] args) {
		
		Samochod s1 = new Samochod("sedan", "bmw", 100);
		Samochod s2 = new Samochod("kombi", "opel", "benzyna");
		Samochod s3 = new Samochod("kabriolet", "honda", "benzyna", 50);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
