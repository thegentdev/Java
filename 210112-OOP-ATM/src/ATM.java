import java.util.Scanner;

public class ATM {
	public void calis() {
		/*
		 * Atm tüm çalýþmasý burada olacak Hesaba giriþ -Ýþlemler
		 */
		Hesap hesap = new Hesap(987654, 1234, 3000, "MFE");
		Login login = new Login();
		Scanner scanner = new Scanner(System.in);
		String islemler = "*************\n" + "Ýþlemler\n" + "*************\n" + "1-Para Çek\n" + "2-Para Yatýr\n"
				+ "3-Bakiye Sorgula\n" + "4-Çýkýþ\n" + "*************\n";
		if (login.login(hesap)) {
			while (true) {
				System.out.println(islemler);
				System.out.print("Yapmak istediðiniz iþlem numarasý: ");
				int islemNo = scanner.nextInt();
				scanner.nextLine();

				switch (islemNo) {
				case 1: {
					System.out.println("Çekmek istediðiniz meblayý giriniz:");
					int talepPara = scanner.nextInt();
					scanner.nextLine();
					hesap.paraCek(talepPara);
				}
				case 2: {
					System.out.println("Yatýrmak istediðiniz meblayý giriniz:");
					int yatýrýlacakPara = scanner.nextInt();
					scanner.nextLine();
					hesap.paraYatýr(yatýrýlacakPara);
				}
				case 3: {
					System.out.println("Bakiyeniz: " + hesap.getBakiye());
				}
				case 4: {
					break;
				}
				default:
					System.out.println("Geçeriz giriþ,Tekrar deneyiniz");
				}
			}
		}

	}
}
