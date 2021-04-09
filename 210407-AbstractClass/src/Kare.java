
public class Kare extends Sekil {
	private int kenar;

	public Kare(String isim, int kenar) {
		super(isim);
		this.kenar = kenar;
	}

	public int getKenar() {
		return kenar;
	}

	public void setKenar(int kenar) {
		this.kenar = kenar;
	}

	@Override
	void alanHesapla() {
		// TODO Auto-generated method stub
		double alan = Math.pow(kenar, 2);
		System.out.println("Karenin alanı: " + alan);
	}

}
