package overlapping.moje;

import java.util.EnumSet;

public class Samochod {
	
	private String typ, marka, rodzajPaliwa;
	private int silnikElektryczny;
	
	private EnumSet<Podklasy> rodzajSamochodu = EnumSet.of(Podklasy.SAMOCHOD);

	public Samochod(String typ, String marka, String rodzajPaliwa) {
		this.typ = typ;
		this.marka = marka;
		this.rodzajPaliwa = rodzajPaliwa;
		rodzajSamochodu.add(Podklasy.SAMOCHOD_SPALINOWY);
	}
	
	public Samochod(String typ, String marka, int silnikElektryczny) {
		this.typ = typ;
		this.marka = marka;
		this.silnikElektryczny = silnikElektryczny;
		rodzajSamochodu.add(Podklasy.SAMOCHOD_ELEKTRYCZNY);
	}
	
	public Samochod(String typ, String marka, String rodzajPaliwa, int silnikElektryczny) {
		this.typ = typ;
		this.marka = marka;
		this.rodzajPaliwa = rodzajPaliwa;
		this.silnikElektryczny = silnikElektryczny;
		rodzajSamochodu.add(Podklasy.SAMOCHOD_SPALINOWY);
		rodzajSamochodu.add(Podklasy.SAMOCHOD_ELEKTRYCZNY);
	}
	
	public String toString() {
		if (rodzajSamochodu.contains(Podklasy.SAMOCHOD_SPALINOWY)) {
			if (rodzajSamochodu.contains(Podklasy.SAMOCHOD_ELEKTRYCZNY)) {
				return "Samochod hybrydowy: " + marka + ", typ nadwozia: " + typ + " rodzajPaliwa: " + rodzajPaliwa + ", silnik elektryczny: " + silnikElektryczny + "kW";
			} else {
				return "Samochod spalinowy: " + marka + ", typ nadwozia: " + typ + " rodzajPaliwa: " + rodzajPaliwa;
			}
		}else {
			return "Samochod elektryczny: " + marka + ", typ nadwozia: " + typ + ", silnik elektryczny: " + silnikElektryczny + "kW";
		}
	}
	
	
	
	
	

}
