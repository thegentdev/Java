import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		float BedenKitleEndeksi;
		float Boy, Kilo;
		
		System.out.print("Lütfen Kilonuzu giriniz: ");
		Kilo = scanner.nextFloat();
		
		System.out.print("Lütfen boyunuzu giriniz(metre): ");
		Boy = scanner.nextFloat();
		
		BedenKitleEndeksi = Kilo / (Boy * Boy);
		
		System.out.println("Beden kitle endeksiniz: " + BedenKitleEndeksi);
		
	}

}
