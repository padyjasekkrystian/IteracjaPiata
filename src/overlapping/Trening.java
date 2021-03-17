package overlapping;

import java.util.EnumSet;

public class Trening {
	
	private String nazwa, opis, styl;
	private int minimalnyCzasPodWoda;
	
	//EnumSet to jest specjalny set ktory przechowuje typy wyliczeniowe
	private EnumSet<Podklasy> rodzajTreningu = EnumSet.of(Podklasy.TRENING);

	public Trening(String nazwa, String opis, String styl) {
		this.nazwa = nazwa;
		this.opis = opis;
		this.styl = styl;
		rodzajTreningu.add(Podklasy.TRENING_TECHNICZNY);
	}

	public Trening(String nazwa, String opis, int minimalnyCzasPodWoda) {
		this.nazwa = nazwa;
		this.opis = opis;
		this.minimalnyCzasPodWoda = minimalnyCzasPodWoda;
		rodzajTreningu.add(Podklasy.TRENING_NURKOWY);
	}

	public Trening(String nazwa, String opis, String styl, int minimalnyCzasPodWoda) {
		this.nazwa = nazwa;
		this.opis = opis;
		this.styl = styl;
		this.minimalnyCzasPodWoda = minimalnyCzasPodWoda;
		rodzajTreningu.add(Podklasy.TRENING_TECHNICZNY);
		rodzajTreningu.add(Podklasy.TRENING_NURKOWY);
	}
	
	
	public String toString() {
		if (rodzajTreningu.contains(Podklasy.TRENING_TECHNICZNY)) {
			if (rodzajTreningu.contains(Podklasy.TRENING_NURKOWY)) {
				return "Trening techniczno-nurkowy: " + nazwa + "\nopis: " + opis + "\nstyl " + styl
						+ "\nminimalny czas pod woda " + minimalnyCzasPodWoda;
			} else {
				return "Trening techniczny: " + nazwa + "\nopis " + opis + "\nstyl " + styl;
			}
		} else {
			return "Trening nurkowy: " + nazwa + "\nopis  " + opis + "\nminimalny czas pod woda  "
					+ minimalnyCzasPodWoda;
		}
	}
	
	
	

}
