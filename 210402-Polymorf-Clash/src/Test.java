import java.util.Scanner;

public class Test {
	public static void saldýr(Hero saldýran,Hero savunan) {
		System.out.println("Can miktarý: "+savunan.getCan());
		savunan.setCan(savunan.getCan()-saldýran.getSaldiriGucu());
		System.out.println("Kalan can: "+savunan.getCan());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ClashofClansa hoþgeldiniz...");
		//System.out.println("Çýkýþ için q giriniz.");
		
		Scanner scanner = new Scanner(System.in);
		HeroFabrikasý fabrika = new HeroFabrikasý(); 
		while(true) {
			System.out.println("1. karakteri seçin: ");
			String islem = scanner.nextLine();
			Hero hero1 = fabrika.heroUret(islem);
			
			System.out.println("2. karakteri seçin: ");
			islem = scanner.nextLine();
			Hero hero2 = fabrika.heroUret(islem);
			
			
			
			if(hero1 == null || hero2 == null) {
				System.out.println("Geçersiz iþlem");
			}
			else {
				saldýr(hero1,hero2);
			}
			 
		}
	}

}
