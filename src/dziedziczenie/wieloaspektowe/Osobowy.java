package dziedziczenie.wieloaspektowe;

public class Osobowy extends Pojazd {
	
	public Osobowy(String marka, String model, String markaDpf) {
		super(marka, model, markaDpf);
	}
	
	public Osobowy(String marka, String model, int iloscMiejsc) {
		super(marka, model, iloscMiejsc);
	}
	
	public String toString() {
		if(getMarkaDpf() == null) {
			return getMarka() + " " + getModel() + " jest samochodem osobowym benzynowym";
		}else {
			return getMarka() + " " + getModel() + " jest samochodym osobowym dieslem";
		}
	}

}
