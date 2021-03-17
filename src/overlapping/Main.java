package overlapping;

public class Main {

	public static void main(String[] args) {
		
		Trening t1 = new Trening("techniczny", "ladny trening techniczny", "warszawski");
		Trening t2 = new Trening("nurkowy", "ladny trening nurkowy", 12);
		Trening t3 = new Trening("techniczno nurkowy", "ladny trening techniczno nurkowy", "topielec", 20);
		
		System.out.println(t1);
		System.out.println();
		System.out.println(t2);
		System.out.println();
		System.out.println(t3);
		
		

	}

}
