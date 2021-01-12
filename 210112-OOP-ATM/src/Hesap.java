
public class Hesap {
	/*
	 * Hesap bilgileri tutulacak
	 */
	private int musteriNo, sifre, bakiye;
	private String isim;

	public Hesap(int musteriNo, int sifre, int bakiye, String isim) {
		this.musteriNo = musteriNo;
		this.sifre = sifre;
		this.bakiye = bakiye;
		this.isim = isim;
	}

	public int getMusteriNo() {
		return musteriNo;
	}

	public void setMusteriNo(int musteriNo) {
		this.musteriNo = musteriNo;
	}

	public int getSifre() {
		return sifre;
	}

	public void setSifre(int sifre) {
		this.sifre = sifre;
	}

	public int getBakiye() {
		return bakiye;
	}

	public void setBakiye(int bakiye) {
		this.bakiye = bakiye;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}
	

}
