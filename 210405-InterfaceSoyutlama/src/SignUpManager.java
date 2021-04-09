
public class SignUpManager {
	private IUserCheckService iUserCheckService;

	public SignUpManager(IUserCheckService iUserCheckService) {
		super();
		this.iUserCheckService = iUserCheckService;
	}
	
	public void SignUp(User user) {
		if(iUserCheckService.CheckUser(user)) {
			System.out.println("Kullancý kayýt oldu: "+user.getName());
		}
		else {
			System.out.println("Kullancý kayýt olamadý.");
		}
	}
}
