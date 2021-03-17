package dziedziczenie;

public class Samochod extends Pojazd {

	private String rodzajPaliwa;
	public Samochod(String marka, String model, String rodzajPaliwa) {
		super(marka, model);
		this.rodzajPaliwa = rodzajPaliwa;
	}
	public String getRodzajPaliwa() {
		return rodzajPaliwa;
	}
	public void setRodzajPaliwa(String rodzajPaliwa) {
		this.rodzajPaliwa = rodzajPaliwa;
	}

	public String zwrocNazwe() {
		return "Samochod";
	}
}
