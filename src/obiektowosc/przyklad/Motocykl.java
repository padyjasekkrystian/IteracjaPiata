package obiektowosc.przyklad;

import java.util.ArrayList;
import java.util.List;

/**
 * @author padyj
 *
 */
public class Motocykl {
	private final String marka, model, typ;
	private int moc, rokProdukcji;

	private static List<Motocykl> ekstensja = new ArrayList<>();

	public Motocykl(String marka, String model, String typ, int moc, int rokProdukcji) {
		this.marka = marka;
		this.model = model;
		this.typ = typ;
		this.moc = moc;
		this.rokProdukcji = rokProdukcji;

		ekstensja.add(this);
	}
	
	public static List<Motocykl> mocniejszeOd150(List<Motocykl> lista){
		List<Motocykl> motocykle = new ArrayList<>();
		for(Motocykl m: lista) {
			if(m.getMoc() > 150) {
				motocykle.add(m);
			}
		}
		return motocykle;
	}
	
	public static List<Motocykl> danaMarka(List<Motocykl> lista, String marka){
		List<Motocykl> motocykle = new ArrayList<>();
		for(Motocykl m: lista) {
			if(m.getMarka().equals(marka)) {
				motocykle.add(m);
			}
		}
		return motocykle;
	}

	public int getMoc() {
		return moc;
	}

	public void setMoc(int moc) {
		this.moc = moc;
	}

	public int getRokProdukcji() {
		return rokProdukcji;
	}

	public void setRokProdukcji(int rokProdukcji) {
		this.rokProdukcji = rokProdukcji;
	}

	public String getMarka() {
		return marka;
	}

	public String getModel() {
		return model;
	}

	public String getTyp() {
		return typ;
	}

	public static List<Motocykl> getEkstensja() {
		return ekstensja;
	}
	
	public String toString() {
		return marka + " " + model;
	}

}
