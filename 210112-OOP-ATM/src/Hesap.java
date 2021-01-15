
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

	public void paraCek(int talepPara) {
		if (bakiye - talepPara < 0) {
			System.out.println("Bakiye yetersiz!");
		}
		else {
			this.bakiye -= talepPara;
			System.out.println("��lem ba�ar�l�, kalan bakiye: " + this.bakiye);
		}
	}

	public void paraYat�r(int yat�r�lacakPara) {
		if (yat�r�lacakPara < 0) {
			System.out.println("Ge�ersiz i�lem!");
		}
		else {
			this.bakiye += yat�r�lacakPara;
			System.out.println("��lem ba�ar�l�, g�ncel bakiye: " + this.bakiye);
		}
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
		if (bakiye >= 0) {
			this.bakiye = bakiye;
		}
		else {
			System.out.println("Bakiye s�f�rdan k���k olamaz!");
		}
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

}
