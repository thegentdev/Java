import java.util.Scanner;

public class Test {
	public static void sald�r(Hero sald�ran,Hero savunan) {
		System.out.println("Can miktar�: "+savunan.getCan());
		savunan.setCan(savunan.getCan()-sald�ran.getSaldiriGucu());
		System.out.println("Kalan can: "+savunan.getCan());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ClashofClansa ho�geldiniz...");
		//System.out.println("��k�� i�in q giriniz.");
		
		Scanner scanner = new Scanner(System.in);
		HeroFabrikas� fabrika = new HeroFabrikas�(); 
		while(true) {
			System.out.println("1. karakteri se�in: ");
			String islem = scanner.nextLine();
			Hero hero1 = fabrika.heroUret(islem);
			
			System.out.println("2. karakteri se�in: ");
			islem = scanner.nextLine();
			Hero hero2 = fabrika.heroUret(islem);
			
			
			
			if(hero1 == null || hero2 == null) {
				System.out.println("Ge�ersiz i�lem");
			}
			else {
				sald�r(hero1,hero2);
			}
			 
		}
	}

}
