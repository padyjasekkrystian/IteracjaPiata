package dziedziczenie.dynamiczne;

public class Student extends Osoba {
	
	private double srednia;

	public Student(String imie, String nazwisko, int srednia) {
		super(imie, nazwisko);
		this.srednia = srednia;
	}

	public double getSrednia() {
		return srednia;
	}

	public void setSrednia(double srednia) {
		this.srednia = srednia;
	}
	
	public String toString() {
		return getClass().getSimpleName() + ": " + getImie() + " " + getNazwisko() + " ma srednia " + srednia;
	}

}
