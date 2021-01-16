import java.util.Scanner;

public class Main {
	public static boolean yeniIslemSor() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Yeni i�lem yapmak istermisiniz?(e/h): ");
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
							+ "��lemler\n"
							+ "**************\n"
							+ "q- ��k��\n"
							+ "1- Yaz�l�mc� ��lemleri\n"
							+ "2- Y�netici ��lemleri\n";

		String yazilimciMenu = "**************\n"
								+ "Yaz�l�mc� ��lemleri\n"
								+ "**************\n"
								+ "q- ��k��\n"
								+ "1- Format at\n"
								+ "2- Bilgileri g�ster\n";

		String yoneticiMenu = "**************\n"
								+ "Yonetici ��lemleri\n"
								+ "**************\n"
								+ "q- ��k��\n"
								+ "1- Zam Yap\n"
								+ "2- Bilgileri g�ster\n";
		String islemal = "Yapmak istedi�iniz i�lem: ";
		

		while (true) {
			System.out.println(anaMenu);
			System.out.println(islemal);
			String secilen�slem = scanner.nextLine();
			if (secilen�slem.equals("q")) {
				break;
			}
			else if (secilen�slem.equals("1")) {
				while (true) {
					System.out.println(yazilimciMenu);
					System.out.println(islemal);
					secilen�slem = scanner.nextLine();
					if (secilen�slem.equals("q")) {
						break;
					}
					else if (secilen�slem.equals("1")) {
						System.out.print("��letim sistemi: ");
						String isletimSistemi = scanner.nextLine();
						yazilimci.formatAt(isletimSistemi);
						if(yeniIslemSor()== false) {
							break;
						}
					}
					else if (secilen�slem.equals("2")) {
						yazilimci.bilgileriGoster();
						if(yeniIslemSor()== false) {
							break;
						}
					}
					else {
						System.out.println("Ge�ersiz i�lem...");

					}

				}

			}
			else if (secilen�slem.equals("2")) {
				while (true) {
					System.out.println(yoneticiMenu);
					System.out.println(islemal);
					secilen�slem = scanner.nextLine();
					if (secilen�slem.equals("q")) {
						break;
					}
					else if (secilen�slem.equals("1")) {
						System.out.print("Zam miktar�: ");
						int zamMiktari = scanner.nextInt();
						yonetici.zamYap(zamMiktari);
						if(yeniIslemSor()== false) {
							break;
						}
					}
					else if (secilen�slem.equals("2")) {
						yonetici.bilgileriGoster();
						if(yeniIslemSor()== false) {
							break;
						}
					}
					else {
						System.out.println("Ge�ersiz i�lem...");

					}
				}
			}
			else {
				System.out.println("Ge�ersiz i�lem...");

			}
		}
		System.out.println("��k�� yap�l�yor...");
	}

}
/* ------- S�zde Kod
 * while(true)
 * 	se�im yaz
 * 	se�im al
 * 	if se�im e�it yazilimci
 * 		while(true)
 * 			yazilimci se�im yaz
 * 			se�imi uygula
 * 			yeni se�im sor	
 * 	if se�im e�it y�netici
 * 		while(true)
 * 			y�netici se�im yaz
 * 			se�imi uygula
 * 			yeni se�im sor
 */

/*
 * ------- Main
 * +++
 * 
 * 
 * ------- �al��anlar
 * Ana s�n�f, di�erlerine kalt�m yoluyla aktaraca��z.
 * +De�i�kenler: isim,soyisim,id
 * +Metotlar: bilgileri g�ster(di�erleri override)
 * 
 * ------- Yaz�l�mc�
 * kal�t�m-�al��anlar
 * +De�i�kenler: bildi�i diller
 * +Metotlar: format at, bilgileri g�ster(override-diller)
 * 
 * ------- Y�netici
 * kal�t�m-�al��anlar
 * +De�i�kenler: sorumlu oldu�u ki�i say�s�
 * +Metotlar:Zam yap
 * 
 */
