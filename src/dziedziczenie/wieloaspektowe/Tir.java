package dziedziczenie.wieloaspektowe;

public class Tir extends Pojazd{

	public Tir(String marka, String model, String markaDpf) {
		super(marka, model, markaDpf);
	}
	
	public Tir(String marka, String model, int iloscMiejsc) {
		super(marka, model, iloscMiejsc);
	}
	
	public String toString() {
		if(getMarkaDpf() == null) {
			return getMarka() + " " + getModel() + " jest TIRem benzynowym";
		}else {
			return getMarka() + " " + getModel() + " jest TIRem dieslem";
		}
	}
	

}
