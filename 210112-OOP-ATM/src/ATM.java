import java.util.Scanner;

public class ATM {
	public void calis() {
		/*
		 * Atm t�m �al��mas� burada olacak Hesaba giri� -��lemler
		 */
		Hesap hesap = new Hesap(987654, 1234, 3000, "MFE");
		Login login = new Login();
		Scanner scanner = new Scanner(System.in);
		String islemler = "*************\n" + "��lemler\n" + "*************\n" + "1-Para �ek\n" + "2-Para Yat�r\n"
				+ "3-Bakiye Sorgula\n" + "4-��k��\n" + "*************\n";
		if (login.login(hesap)) {
			while (true) {
				System.out.println(islemler);
				System.out.print("Yapmak istedi�iniz i�lem numaras�: ");
				int islemNo = scanner.nextInt();
				scanner.nextLine();

				switch (islemNo) {
				case 1: {
					System.out.println("�ekmek istedi�iniz meblay� giriniz:");
					int talepPara = scanner.nextInt();
					scanner.nextLine();
					hesap.paraCek(talepPara);
				}
				case 2: {
					System.out.println("Yat�rmak istedi�iniz meblay� giriniz:");
					int yat�r�lacakPara = scanner.nextInt();
					scanner.nextLine();
					hesap.paraYat�r(yat�r�lacakPara);
				}
				case 3: {
					System.out.println("Bakiyeniz: " + hesap.getBakiye());
				}
				case 4: {
					break;
				}
				default:
					System.out.println("Ge�eriz giri�,Tekrar deneyiniz");
				}
			}
		}

	}
}
