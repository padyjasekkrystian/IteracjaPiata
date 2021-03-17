package equals.hashcode;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Pracownik p1 = new Pracownik("Jan", "Kowalski");
		Pracownik p2 = new Pracownik("Jan", "Kowalski");

		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		Set<Pracownik> zbior = new HashSet<>();
		zbior.add(p1);
		zbior.add(p2);
		
		System.out.println(zbior);

	}
}
