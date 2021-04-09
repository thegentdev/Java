
public class Ucgen extends Sekil {
	private int taban, h;

	public Ucgen(String isim, int taban, int h) {
		super(isim);
		this.taban = taban;
		this.h = h;
	}

	public int getTaban() {
		return taban;
	}

	public void setTaban(int taban) {
		this.taban = taban;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	@Override
	void alanHesapla() {
		// TODO Auto-generated method stub
		float alan = (taban * h) / 2;
		System.out.println("Ucgenin alani: " + alan);
	}

}
