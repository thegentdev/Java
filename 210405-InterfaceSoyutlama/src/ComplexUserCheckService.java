
public class ComplexUserCheckService implements IUserCheckService {

	@Override
	public boolean CheckUser(User user) {
		// TODO Auto-generated method stub
		if (user.getAge() >= 18 && user.getName().startsWith("Mu")) {
			return true;

		}
		else {
			return false;
		}
	}

}
