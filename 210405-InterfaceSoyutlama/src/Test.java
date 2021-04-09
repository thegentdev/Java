
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
 * Ýki farklý kayýt kontrol servisimiz var.(ComplexUserCheckService / AgeUserCheckService)
 * Sýnýflar içerisinde farklý sýnýflardan nesne üretmek baðýmlýlýk arttýrýr.
 * Bunun sonucunda kullanýlan serviste bir sorun olduðunda farklý servise geçiþ zorlaþýr.
 * Hedef baðýmlýlýklarý minimumda tutmak. Mümkünse sadece son kullaným yerini deðiþtirerek,
 * servisler arasýnda geçiþ yapýlabilmeli. Bu projede de bu hedefi gerçekleþtirdik.
 * 
 * SignUpManager sýnýfýnda bir Interface referansý oluþturduk ve constructorla kullanacaðýmýz,
 * servisi aldýk -> SignUpManager signUpManager = new SignUpManager(new ComplexUserCheckService());
 * bu son kullaným yerinde constructor içine hangi servisi yazarsak o servis kodda çalýþacaktýr.
 * Bu sayade soyutlama gerçekleþtirildi.
 * 
 * 
 */
