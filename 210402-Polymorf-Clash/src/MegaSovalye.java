
public class MegaSovalye extends Hero {
	private String hedef = "Kuleler";

	public MegaSovalye(int saldiriGucu, int hareketHizi, int can, int maliyet) {
		super(saldiriGucu, hareketHizi, can, maliyet);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bilgileriGoster() {
		// TODO Auto-generated method stub
		System.out.println("---- Mega Þovalye ----");
		super.bilgileriGoster();
		System.out.println("Hedef: " + getHedef());
	}

	public String getHedef() {
		return hedef;
	}

	public void setHedef(String hedef) {
		this.hedef = hedef;
	}

}
