package uml.moje;

public class SamochodNaprawa {
	
	private Naprawa naprawa;
	private Samochod samochod;
	private int koszt;
	public SamochodNaprawa(Naprawa naprawa, Samochod samochod, int koszt) {
		this.naprawa = naprawa;
		this.samochod = samochod;
		this.koszt = koszt;
		naprawa.dodajSamochodNaprawa(this);
		samochod.dodajSamochodNaprawa(this);
	}
	public Naprawa getNaprawa() {
		return naprawa;
	}
	public void setNaprawa(Naprawa naprawa) {
		this.naprawa = naprawa;
	}
	public Samochod getSamochod() {
		return samochod;
	}
	public void setSamochod(Samochod samochod) {
		this.samochod = samochod;
	}
	public int getKoszt() {
		return koszt;
	}
	public void setKoszt(int koszt) {
		this.koszt = koszt;
	}
	
	public String toString() {
		return "W samochoddzie:  " + samochod + " by³o naprawiane: " + naprawa + ", a koszta wynios³y: " + koszt + "z³";
	}
	
	

}
