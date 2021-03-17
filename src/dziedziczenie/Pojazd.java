package dziedziczenie;

public abstract class Pojazd {
	
	private String marka, model;

	public Pojazd(String marka, String model) {
		super();
		this.marka = marka;
		this.model = model;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public abstract String zwrocNazwe();

}
