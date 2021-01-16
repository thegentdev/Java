import java.util.Scanner;

public class Main {
	public static boolean yeniIslemSor() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Yeni iþlem yapmak istermisiniz?(e/h): ");
		String yeniIslem= scanner.nextLine();
		if(yeniIslem.equals("e")) {
			return true;
		}
		else if(yeniIslem.equals("h")) {
			return false;
		}
		else {
			return true;
		}
		
	}
	public static void main(String[] args) {
		Yazilimci yazilimci = new Yazilimci("MF", "E", 1,5000, "C,C++,Java");
		Yonetici yonetici = new Yonetici("thegent", "dev", 2,9000, 50);
		Scanner scanner = new Scanner(System.in);

		String anaMenu = "**************\n"
							+ "Ýþlemler\n"
							+ "**************\n"
							+ "q- Çýkýþ\n"
							+ "1- Yazýlýmcý Ýþlemleri\n"
							+ "2- Yönetici Ýþlemleri\n";

		String yazilimciMenu = "**************\n"
								+ "Yazýlýmcý Ýþlemleri\n"
								+ "**************\n"
								+ "q- Çýkýþ\n"
								+ "1- Format at\n"
								+ "2- Bilgileri göster\n";

		String yoneticiMenu = "**************\n"
								+ "Yonetici Ýþlemleri\n"
								+ "**************\n"
								+ "q- Çýkýþ\n"
								+ "1- Zam Yap\n"
								+ "2- Bilgileri göster\n";
		String islemal = "Yapmak istediðiniz iþlem: ";
		

		while (true) {
			System.out.println(anaMenu);
			System.out.println(islemal);
			String secilenÝslem = scanner.nextLine();
			if (secilenÝslem.equals("q")) {
				break;
			}
			else if (secilenÝslem.equals("1")) {
				while (true) {
					System.out.println(yazilimciMenu);
					System.out.println(islemal);
					secilenÝslem = scanner.nextLine();
					if (secilenÝslem.equals("q")) {
						break;
					}
					else if (secilenÝslem.equals("1")) {
						System.out.print("Ýþletim sistemi: ");
						String isletimSistemi = scanner.nextLine();
						yazilimci.formatAt(isletimSistemi);
						if(yeniIslemSor()== false) {
							break;
						}
					}
					else if (secilenÝslem.equals("2")) {
						yazilimci.bilgileriGoster();
						if(yeniIslemSor()== false) {
							break;
						}
					}
					else {
						System.out.println("Geçersiz iþlem...");

					}

				}

			}
			else if (secilenÝslem.equals("2")) {
				while (true) {
					System.out.println(yoneticiMenu);
					System.out.println(islemal);
					secilenÝslem = scanner.nextLine();
					if (secilenÝslem.equals("q")) {
						break;
					}
					else if (secilenÝslem.equals("1")) {
						System.out.print("Zam miktarý: ");
						int zamMiktari = scanner.nextInt();
						yonetici.zamYap(zamMiktari);
						if(yeniIslemSor()== false) {
							break;
						}
					}
					else if (secilenÝslem.equals("2")) {
						yonetici.bilgileriGoster();
						if(yeniIslemSor()== false) {
							break;
						}
					}
					else {
						System.out.println("Geçersiz iþlem...");

					}
				}
			}
			else {
				System.out.println("Geçersiz iþlem...");

			}
		}
		System.out.println("Çýkýþ yapýlýyor...");
	}

}
/* ------- Sözde Kod
 * while(true)
 * 	seçim yaz
 * 	seçim al
 * 	if seçim eþit yazilimci
 * 		while(true)
 * 			yazilimci seçim yaz
 * 			seçimi uygula
 * 			yeni seçim sor	
 * 	if seçim eþit yönetici
 * 		while(true)
 * 			yönetici seçim yaz
 * 			seçimi uygula
 * 			yeni seçim sor
 */

/*
 * ------- Main
 * +++
 * 
 * 
 * ------- Çalýþanlar
 * Ana sýnýf, diðerlerine kaltým yoluyla aktaracaðýz.
 * +Deðiþkenler: isim,soyisim,id
 * +Metotlar: bilgileri göster(diðerleri override)
 * 
 * ------- Yazýlýmcý
 * kalýtým-çalýþanlar
 * +Deðiþkenler: bildiði diller
 * +Metotlar: format at, bilgileri göster(override-diller)
 * 
 * ------- Yönetici
 * kalýtým-çalýþanlar
 * +Deðiþkenler: sorumlu olduðu kiþi sayýsý
 * +Metotlar:Zam yap
 * 
 */
