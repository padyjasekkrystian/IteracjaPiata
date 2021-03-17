package uml.przyklady;

public class Sala {
	
	private String nazwa;
	private Szkola szkola;

	public Sala(String nazwa, Szkola szkola) throws Exception {
		this.nazwa = nazwa;
		
		if(szkola == null) {
			throw new Exception("Musi byc jakaœ szko³a!");
		}
		this.szkola = szkola;
		szkola.dodajSale(this);
	}
	

	public Szkola getSzkola() {
		return szkola;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	
	public String toString() {
		return nazwa;
	}
	
	
	
	

}
