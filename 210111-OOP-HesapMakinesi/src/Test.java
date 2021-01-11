import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HesapMakinesi hesap = new HesapMakinesi();
		Scanner scanner = new Scanner(System.in);
		String islem;
		int a, b, c;
		while (true) {
			System.out.println("q: ��k��\n" + "1: Toplama\n" + "2: ��karma\n" + "3: �arpma\n" + "4: B�lme");
			System.out.println("***************");
			System.out.println("��lemler");
			System.out.println("***************");
			System.out.print("Yapmak istedi�iniz i�lem: ");
			islem = scanner.nextLine();

			if (islem.equals("q")) {
				System.out.println("��k�� yap�l�yor...");
				break;
			}
			else if (islem.equals("1")) {
				System.out.println("Ka� de�er toplayacaks�n�z?(2 veya 3)");
				int deger = scanner.nextInt();
				if (deger == 2) {
					System.out.println("1.say�: ");
					a = scanner.nextInt();
					System.out.println("2.say�: ");
					b = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Sonu�: " + hesap.toplama(a, b));
				}
				else if (deger == 3) {
					System.out.println("1.say�: ");
					a = scanner.nextInt();
					System.out.println("2.say�: ");
					b = scanner.nextInt();
					System.out.println("3.say�: ");
					c = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Sonu�: " + hesap.toplama(a, b, c));
				}
				else {
					System.out.println("\n!!!!!!!!!!!\n" + "Ge�ersiz ��lem\n" + "!!!!!!!!!!!");
				}
			}
			else if (islem.equals("2")) {
				System.out.println("1.say�: ");
				a = scanner.nextInt();
				System.out.println("2.say�: ");
				b = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Sonu�: " + hesap.cikarma(a, b));

			}
			else if (islem.equals("3")) {
				System.out.println("Ka� de�er �arpacaks�n�z?(2 veya 3)");
				int deger = scanner.nextInt();
				if (deger == 2) {
					System.out.println("1.say�: ");
					a = scanner.nextInt();
					System.out.println("2.say�: ");
					b = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Sonu�: " + hesap.carpma(a, b));
				}
				else if (deger == 3) {
					System.out.println("1.say�: ");
					a = scanner.nextInt();
					System.out.println("2.say�: ");
					b = scanner.nextInt();
					System.out.println("3.say�: ");
					c = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Sonu�: " + hesap.carpma(a, b, c));
				}
				else {
					System.out.println("\n!!!!!!!!!!!\n" + "Ge�ersiz ��lem\n" + "!!!!!!!!!!!");
				}
			}
			else if (islem.equals("4")) {
				System.out.println("1.say�: ");
				a = scanner.nextInt();
				System.out.println("2.say�: ");
				b = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Sonu�: " + hesap.bolme(a, b));

			}
			else {
				System.out.println("\n!!!!!!!!!!!\n" + "Ge�ersiz ��lem\n" + "!!!!!!!!!!!");
			}

		}
	}

}
