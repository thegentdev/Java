
public abstract class Sekil {
	public String isim;
	
	
	public Sekil(String isim) {
		super();
		this.isim = isim;
	}


	public String getIsim() {
		return isim;
	}


	public void setIsim(String isim) {
		this.isim = isim;
	}


	abstract void alanHesapla();
	
}
