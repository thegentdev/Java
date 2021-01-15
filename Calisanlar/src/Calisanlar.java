
public class Calisanlar {
	private String isim, soyisim;
	private int id;

	public Calisanlar(String isim, String soyisim, int id) {

		this.isim = isim;
		this.soyisim = soyisim;
		this.id = id;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

	public int getId() {

		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void bilgileriGoster() {
		System.out.println("Ýsim:"	+ this.isim
							+ "\nSoyisim:" + this.soyisim
							+ "\nid:" + this.id);
	}

}
