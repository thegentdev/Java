
public class Problem {
	public static class Matematik {

		public static void daireAlan(int yaricap) {
			double dairealani = Math.pow(yaricap, 2) * Math.PI;
			System.out.println("Dairenin alaný: " + dairealani);
		}

		public static void ucgenCevresi(int kenar1, int kenar2, int kenar3) {
			int cevre = kenar1 + kenar2 + kenar3;
			System.out.println("Ucgenin cevresi: " + cevre);
		}
	}

	public static class Fizik {

		public static void vektorCarpim(Vector v1, Vector v2) {
			int vecCarpim = v1.getI() * v2.getI()
					+ v1.getJ() * v2.getJ()
					+ v1.getK() * v2.getK();
			System.out.println("Vektorlerin çarpýmý: " + vecCarpim);
		}

	}

}
