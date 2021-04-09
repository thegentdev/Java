
public class Hero {
	private int saldiriGucu, hareketHizi, can, maliyet;

	public Hero(int saldiriGucu, int hareketHizi, int can, int maliyet) {

		this.saldiriGucu = saldiriGucu;
		this.hareketHizi = hareketHizi;
		this.maliyet = maliyet;
		this.can = can;
	}

	public void bilgileriGoster() {
		System.out.println("Can: "	+ getCan()
							+ "\nSaldýrý Gücü: " + getSaldiriGucu()
							+ "\nHareket Hýzý: " + getHareketHizi()
							+ "\nMaliyet: " + getMaliyet());
	}

	public int getSaldiriGucu() {
		return saldiriGucu;
	}

	public int getCan() {
		return can;
	}

	public void setCan(int can) {
		this.can = can;
	}

	public void setSaldiriGucu(int saldiriGucu) {
		this.saldiriGucu = saldiriGucu;
	}

	public int getHareketHizi() {
		return hareketHizi;
	}

	public void setHareketHizi(int hareketHizi) {
		this.hareketHizi = hareketHizi;
	}

	public int getMaliyet() {
		return maliyet;
	}

	public void setMaliyet(int maliyet) {
		this.maliyet = maliyet;
	}

}
