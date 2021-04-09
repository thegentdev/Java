import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String islemler = "1- Daire alaný hesapla\n"
							+ "2- Ucgen cevre hesapla\n"
							+ "3- Vektor carpýmý\n"
							+ "q- Cikis\n";
		System.out.println(islemler);
		System.out.println("--------------------------");
		Scanner scanner = new Scanner(System.in);
		String islem;
		while (true) {
			System.out.print("Yapmak istediginiz islem\n>>>");
			islem = scanner.nextLine();
			if(islem.equals("q")) {
				break;
			}
			else if(islem.equals("1")) {
				System.out.print("Yaricap:");
				int yaricap = scanner.nextInt();
				scanner.nextLine();
				Problem.Matematik.daireAlan(yaricap);
			}
			else if(islem.equals("2")) {
				System.out.print("Kenar1:");
				int k1=scanner.nextInt();scanner.nextLine();
				System.out.print("Kenar2:");
				int k2=scanner.nextInt();scanner.nextLine();
				System.out.print("Kenar3:");
				int k3=scanner.nextInt();scanner.nextLine();
				Problem.Matematik.ucgenCevresi(k1, k2, k3);
			}
			else if(islem.equals("3")) {
				Vector vektor1 = new Vector("vector1");
				Vector vektor2 = new Vector("vector2");
				
				Problem.Fizik.vektorCarpim(vektor1, vektor2);
			}
			

		}
		System.out.println("Program sonlandýrýldý.");

	}

}
