package wielodziedziczenie;

public class StudentWykladowca extends Student implements IWykladowca {

	private int rabat;
	private double pensja;

	public StudentWykladowca(String imie, String nazwisko, int numerIndeksu, int rabat, double pensja) {
		super(imie, nazwisko, numerIndeksu);
		this.rabat = rabat;
		this.pensja = pensja;
	}

	public int getRabat() {
		return rabat;
	}

	public void setRabat(int rabat) {
		this.rabat = rabat;
	}

	public double getPensja() {
		return pensja;
	}

	public void setPensja(double pensja) {
		this.pensja = pensja;
	}

	public String toString() {
		return getImie() + " " + getNazwisko() + " jest studentem o numerze indeksu " + getNumerIndeksu() +
				", a jego pensja wynosi " + getPensja() + ", a rabat " + getRabat();
	}
}
