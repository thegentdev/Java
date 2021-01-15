
public class Yazilimci extends Calisanlar {
	private String programlamaDilleri;

	public Yazilimci(String isim, String soyisim, int id, String programlamaDilleri) {
		super(isim, soyisim, id);
		this.programlamaDilleri = programlamaDilleri;
	}

	public String getProgramlamaDilleri() {
		return programlamaDilleri;
	}

	public void setProgramlamaDilleri(String programlamaDilleri) {
		this.programlamaDilleri = programlamaDilleri;
	}

	@Override
	public void bilgileriGoster() {
		// TODO Auto-generated method stub
		super.bilgileriGoster();
		System.out.println("\nProgramlama Dilleri:" + this.programlamaDilleri);
	}

	public void formatAt(String isletimSistemi) {
		System.out.println(isletimSistemi + "yükleniyor...");
	}

}
