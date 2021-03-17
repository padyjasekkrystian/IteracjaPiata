package wielodziedziczenie;

public class Student extends Osoba {
	
	private int numerIndeksu;
	
	public Student(String imie, String nazwisko, int numerIndeksu) {
		super(imie, nazwisko);
		this.numerIndeksu = numerIndeksu;
	}

	public int getNumerIndeksu() {
		return numerIndeksu;
	}

	public void setNumerIndeksu(int numerIndeksu) {
		this.numerIndeksu = numerIndeksu;
	}

}
