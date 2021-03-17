package dziedziczenie.wieloaspektowe;

public abstract class Pojazd {
	
	private String marka, model, markaDpf;
	private int iloscMiejsc;

	public Pojazd(String marka, String model, String markaDpf) {
		this.marka = marka;
		this.model = model;
		this.markaDpf = markaDpf;
	}
	
	public Pojazd(String marka, String model, int iloscMiejsc) {
		this.marka = marka;
		this.model = model;
		this.iloscMiejsc = iloscMiejsc;
	}

	public String getMarkaDpf() {
		return markaDpf;
	}

	public void setMarkaDpf(String markaDpf) {
		this.markaDpf = markaDpf;
	}

	public int getIloscMiejsc() {
		return iloscMiejsc;
	}

	public void setIloscMiejsc(int iloscMiejsc) {
		this.iloscMiejsc = iloscMiejsc;
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
	
	
	
	

}
