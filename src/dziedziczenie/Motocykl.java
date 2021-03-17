package dziedziczenie;

public class Motocykl extends Pojazd{
	
	private String typMotocykla;

	public Motocykl(String marka, String model, String typMotocykla) {
		super(marka, model);
		this.typMotocykla = typMotocykla;
	}

	public String getTypMotocykla() {
		return typMotocykla;
	}

	public void setTypMotocykla(String typMotocykla) {
		this.typMotocykla = typMotocykla;
	}

	public String zwrocNazwe() {
		return "Motocykl";
	}
	
}
