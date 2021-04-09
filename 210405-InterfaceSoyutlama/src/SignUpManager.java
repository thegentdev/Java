
public class SignUpManager {
	private IUserCheckService iUserCheckService;

	public SignUpManager(IUserCheckService iUserCheckService) {
		super();
		this.iUserCheckService = iUserCheckService;
	}
	
	public void SignUp(User user) {
		if(iUserCheckService.CheckUser(user)) {
			System.out.println("Kullanc� kay�t oldu: "+user.getName());
		}
		else {
			System.out.println("Kullanc� kay�t olamad�.");
		}
	}
}
