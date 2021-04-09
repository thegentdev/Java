
public class Kasa {
	private String model, uretici, malzeme;

	public Kasa(String model, String uretici, String malzeme) {
		
		this.model = model;
		this.uretici = uretici;
		this.malzeme = malzeme;
	}
	public void bilgisayar_ac() {
		System.out.println("Bilgisayar açýldý...");
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getUretici() {
		return uretici;
	}

	public void setUretici(String uretici) {
		this.uretici = uretici;
	}

	public String getMalzeme() {
		return malzeme;
	}

	public void setMalzeme(String malzeme) {
		this.malzeme = malzeme;
	}
	
	
}
