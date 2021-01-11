import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HesapMakinesi hesap = new HesapMakinesi();
		Scanner scanner = new Scanner(System.in);
		String islem;
		int a, b, c;
		while (true) {
			System.out.println("q: Çýkýþ\n" + "1: Toplama\n" + "2: Çýkarma\n" + "3: Çarpma\n" + "4: Bölme");
			System.out.println("***************");
			System.out.println("Ýþlemler");
			System.out.println("***************");
			System.out.print("Yapmak istediðiniz iþlem: ");
			islem = scanner.nextLine();

			if (islem.equals("q")) {
				System.out.println("Çýkýþ yapýlýyor...");
				break;
			}
			else if (islem.equals("1")) {
				System.out.println("Kaç deðer toplayacaksýnýz?(2 veya 3)");
				int deger = scanner.nextInt();
				if (deger == 2) {
					System.out.println("1.sayý: ");
					a = scanner.nextInt();
					System.out.println("2.sayý: ");
					b = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Sonuç: " + hesap.toplama(a, b));
				}
				else if (deger == 3) {
					System.out.println("1.sayý: ");
					a = scanner.nextInt();
					System.out.println("2.sayý: ");
					b = scanner.nextInt();
					System.out.println("3.sayý: ");
					c = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Sonuç: " + hesap.toplama(a, b, c));
				}
				else {
					System.out.println("\n!!!!!!!!!!!\n" + "Geçersiz Ýþlem\n" + "!!!!!!!!!!!");
				}
			}
			else if (islem.equals("2")) {
				System.out.println("1.sayý: ");
				a = scanner.nextInt();
				System.out.println("2.sayý: ");
				b = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Sonuç: " + hesap.cikarma(a, b));

			}
			else if (islem.equals("3")) {
				System.out.println("Kaç deðer çarpacaksýnýz?(2 veya 3)");
				int deger = scanner.nextInt();
				if (deger == 2) {
					System.out.println("1.sayý: ");
					a = scanner.nextInt();
					System.out.println("2.sayý: ");
					b = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Sonuç: " + hesap.carpma(a, b));
				}
				else if (deger == 3) {
					System.out.println("1.sayý: ");
					a = scanner.nextInt();
					System.out.println("2.sayý: ");
					b = scanner.nextInt();
					System.out.println("3.sayý: ");
					c = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Sonuç: " + hesap.carpma(a, b, c));
				}
				else {
					System.out.println("\n!!!!!!!!!!!\n" + "Geçersiz Ýþlem\n" + "!!!!!!!!!!!");
				}
			}
			else if (islem.equals("4")) {
				System.out.println("1.sayý: ");
				a = scanner.nextInt();
				System.out.println("2.sayý: ");
				b = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Sonuç: " + hesap.bolme(a, b));

			}
			else {
				System.out.println("\n!!!!!!!!!!!\n" + "Geçersiz Ýþlem\n" + "!!!!!!!!!!!");
			}

		}
	}

}
