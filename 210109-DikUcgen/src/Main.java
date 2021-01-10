import java.util.Scanner;
import java.lang.Math;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double a, b, c;

		System.out.println("Lütfen üçgenin kenar uzunluklarýný giriniz:");

		System.out.print("1. kenar: ");
		a = scanner.nextDouble();

		System.out.print("2. kenar: ");
		b = scanner.nextDouble();

		c = Math.sqrt((a * a) + (b * b));
		System.out.println("Hipotenüs: " + c);

	}

}
