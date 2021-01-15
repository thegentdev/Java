import java.util.Scanner;

public class Login {
	private int girisHakki = 3;
	private int musteriNo, sifre;

	public boolean login(Hesap hesap) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bankamýza hoþgeldiniz");
		while (girisHakki > 0) {
			System.out.println("Müþteri numaranýz:");
			musteriNo = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Þifreniz:");
			sifre = scanner.nextInt();
			scanner.nextLine();
			if ((musteriNo == hesap.getMusteriNo()) && (sifre == hesap.getSifre())) {
				System.out.println("Giriþ baþarýlý...");
				return true;
			}
			else {
				girisHakki--;
				System.out.println("Giriþ baþarýsýz,lütfen tekrar deneyiniz..\n"
									+"Kalan giriþ hakkýnýz:"+girisHakki);
			}
		}
		System.out.println("Giriþ hakkýnýz bitmiþtir!");
		return false;
	}
}
