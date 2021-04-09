import java.util.Scanner;

public class Test {
	public static Kart[][] kartlar = new Kart[4][4];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kartDoldur();
		
		while(oyunBittiMi()== false) {
			oyunTablosu();
			tahminEt();
		}
		
		

	}
	public static void kartDoldur() {
		kartlar[0][0] = new Kart('A');
		kartlar[0][1] = new Kart('J');
		kartlar[0][2] = new Kart('C');
		kartlar[0][3] = new Kart('X');
		kartlar[1][0] = new Kart('P');
		kartlar[1][1] = new Kart('E');
		kartlar[1][2] = new Kart('M');
		kartlar[1][3] = new Kart('J');
		kartlar[2][0] = new Kart('U');
		kartlar[2][1] = new Kart('U');
		kartlar[2][2] = new Kart('X');
		kartlar[2][3] = new Kart('E');
		kartlar[3][0] = new Kart('C');
		kartlar[3][1] = new Kart('P');
		kartlar[3][2] = new Kart('A');
		kartlar[3][3] = new Kart('M');
		
	}

	public static void oyunTablosu() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (kartlar[i][j].isDurum() == true) {
					System.out.print(" |" + kartlar[i][j].getDeger() + "| ");
				}
				else {
					System.out.print(" | | ");
				}
			}
			System.out.println("\n-------------------");
		}
	}

	public static void tahminEt() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen tahmininizi bir bosluk birakarak yaziniz\n>>>");
		int i1 = scanner.nextInt();
		int j1 = scanner.nextInt();

		kartlar[i1][j1].setDurum(true);
		oyunTablosu();

		System.out.print("Lütfen 2. tahmininizi bir bosluk birakarak yaziniz\n>>>");
		int i2 = scanner.nextInt();
		int j2 = scanner.nextInt();
		
		if (kartlar[i1][j1].getDeger() == kartlar[i2][j2].getDeger()) {
			kartlar[i2][j2].setDurum(true);
			System.out.println("Tebrikler doðru bildiniz.");
		}
		else {
			kartlar[i1][j1].setDurum(false);
		}
	}
	public static boolean oyunBittiMi() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (kartlar[i][j].isDurum() == false) {
					return false;
				}
			}
		}
		return true;
		
	}

}
