package uml.przyklady;

public class UczenSprawdzian {
	
	private double ocena;
	private Sprawdzian sprawdzian;
	private Uczen uczen;

	public UczenSprawdzian(double ocena, Sprawdzian sprawdzian, Uczen uczen) {
		this.ocena = ocena;
		this.sprawdzian = sprawdzian;
		this.uczen = uczen;
		
		sprawdzian.dodajUczenSprawdzian(this);
		uczen.dodajUczenSprawdzian(this);
	}

	public double getOcena() {
		return ocena;
	}

	public void setOcena(double ocena) {
		this.ocena = ocena;
	}

	public Sprawdzian getSprawdzian() {
		return sprawdzian;
	}

	public void setSprawdzian(Sprawdzian sprawdzian) {
		this.sprawdzian = sprawdzian;
	}

	public Uczen getUczen() {
		return uczen;
	}

	public void setUczen(Uczen uczen) {
		this.uczen = uczen;
	}
	
	public String toString() {
		return "Uczeñ " + uczen + " napisa³ sprawdzian z: " + sprawdzian + " i uzyska³ ocene " + ocena;
	}
	
	
	
	
	

}
