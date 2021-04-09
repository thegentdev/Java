
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user =new User(123,18,"Muhammed Fatih");
		SignUpManager signUpManager = new SignUpManager(new ComplexUserCheckService());
		//SignUpManager signUpManager = new SignUpManager(new AgeUserCheckService());
		
		signUpManager.SignUp(user);
	}

}
/*
 * �ki farkl� kay�t kontrol servisimiz var.(ComplexUserCheckService / AgeUserCheckService)
 * S�n�flar i�erisinde farkl� s�n�flardan nesne �retmek ba��ml�l�k artt�r�r.
 * Bunun sonucunda kullan�lan serviste bir sorun oldu�unda farkl� servise ge�i� zorla��r.
 * Hedef ba��ml�l�klar� minimumda tutmak. M�mk�nse sadece son kullan�m yerini de�i�tirerek,
 * servisler aras�nda ge�i� yap�labilmeli. Bu projede de bu hedefi ger�ekle�tirdik.
 * 
 * SignUpManager s�n�f�nda bir Interface referans� olu�turduk ve constructorla kullanaca��m�z,
 * servisi ald�k -> SignUpManager signUpManager = new SignUpManager(new ComplexUserCheckService());
 * bu son kullan�m yerinde constructor i�ine hangi servisi yazarsak o servis kodda �al��acakt�r.
 * Bu sayade soyutlama ger�ekle�tirildi.
 * 
 * 
 */
