import java.util.LinkedList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		LinkedList<Aday> array = new LinkedList<Aday>();
		AdayUret adayuretici = new AdayUret();
//		Sayisal o1 = new Sayisal();
//		System.out.println("Puan:" + o1.puanHesapla());
		System.out.print("Üretilecek aday alani:");
	
		array.add(adayuretici.adayUret(scanner.nextLine()));
		System.out.println(array.get(0).getIsim());
	}

}
