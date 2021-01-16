
public class Calisanlar {
	private String isim, soyisim;
	private int id, maas;

	public Calisanlar(String isim, String soyisim, int id, int maas) {

		this.isim = isim;
		this.soyisim = soyisim;
		this.id = id;
		this.maas = maas;
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

	public int getMaas() {
		return maas;
	}

	public void setMaas(int maas) {
		this.maas = maas;
	}

	public void bilgileriGoster() {
		System.out.println("Ýsim:"	+ this.isim
							+ "\nSoyisim:" + this.soyisim
							+ "\nid:" + this.id
							+ "\nMaaþ:" + this.maas);
	}

}
