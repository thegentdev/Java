
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resolution resolution = new Resolution(1920, 1080);
		Monitor monitor = new Monitor("VG6", "ASUS", 21, resolution);
		Kasa kasa = new Kasa("M65", "MSI", "Temper");
		Anakart anakart = new Anakart("F57", "MSI", "Ubuntu", 4);
		Bilgisayar pc = new Bilgisayar(monitor, kasa, anakart);
		
		pc.getKasa().bilgisayar_ac();
		pc.getMonitor().monitoru_kapa();
	}

}
