
public class Monitor {
	private String model, uretici;
	private int boyut_inch;
	private Resolution resolution;

	public Monitor(String model, String uretici, int boyut_inch, Resolution resolution) {

		this.model = model;
		this.uretici = uretici;
		this.boyut_inch = boyut_inch;
		this.resolution = resolution;
	}

	public void monitoru_kapa() {
		System.out.println("Monitor kapatýldý.. ");
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

	public int getBoyut_inch() {
		return boyut_inch;
	}

	public void setBoyut_inch(int boyut_inch) {
		this.boyut_inch = boyut_inch;
	}

	public Resolution getResolution() {
		return resolution;
	}

	public void setResolution(Resolution resolution) {
		this.resolution = resolution;
	}

}
