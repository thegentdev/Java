import java.util.Scanner;

public class Login {
	private int girisHakki = 3;
	private int musteriNo, sifre;

	public boolean login(Hesap hesap) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bankam�za ho�geldiniz");
		while (girisHakki > 0) {
			System.out.println("M��teri numaran�z:");
			musteriNo = scanner.nextInt();
			scanner.nextLine();
			System.out.println("�ifreniz:");
			sifre = scanner.nextInt();
			scanner.nextLine();
			if ((musteriNo == hesap.getMusteriNo()) && (sifre == hesap.getSifre())) {
				System.out.println("Giri� ba�ar�l�...");
				return true;
			}
			else {
				girisHakki--;
				System.out.println("Giri� ba�ar�s�z,l�tfen tekrar deneyiniz..\n"
									+"Kalan giri� hakk�n�z:"+girisHakki);
			}
		}
		System.out.println("Giri� hakk�n�z bitmi�tir!");
		return false;
	}
}
