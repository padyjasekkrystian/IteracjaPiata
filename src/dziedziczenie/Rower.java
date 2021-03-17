package dziedziczenie;

public class Rower extends Pojazd {
	
	private String typRoweru;

	public Rower(String marka, String model, String typRoweru) {
		super(marka, model);
		this.typRoweru = typRoweru;
	}

	public String getTypRoweru() {
		return typRoweru;
	}

	public void setTypRoweru(String typRoweru) {
		this.typRoweru = typRoweru;
	}

	public String zwrocNazwe() {
		return "Rower";
	}
	
	
	

}
