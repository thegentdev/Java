import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("1-Ucgen\n2-Kare\n3-Quit");
		while (true) {
			Sekil sekil = null;
			System.out.print(">>>");
			int secim = scanner.nextInt();
			if (secim == 3) {
				break;
			}
			switch (secim) {
				case 1:
					sekil = new Ucgen("Ucgen1", 10, 5);
					sekil.alanHesapla();
					break;
				case 2:
					sekil = new Kare("kare1", 10);
					sekil.alanHesapla();
					break;

				default:
					break;
			}
		}
		System.out.println("Çýkýþ yapýldý");
	}

}
