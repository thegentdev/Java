
public class Main {
	public static boolean Asal(int sayi) {
		for (int i = 2; i <= sayi; i++) {
			if (sayi % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static int Ebob(int sayi1, int sayi2) {
		int ebob=1, i;

		for (i = 2; i <= sayi1 && i <= sayi2; i++) {
			if ((sayi1 % i == 0) && (sayi2 % i == 0)) {
				ebob = i;
			}
		}
		return ebob;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Asallýk durumu: " + Asal(12));
		System.out.println("Ebob: " + Ebob(12,120));
	}

}
