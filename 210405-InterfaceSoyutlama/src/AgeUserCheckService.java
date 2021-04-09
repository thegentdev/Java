
public class AgeUserCheckService implements IUserCheckService {

	@Override
	public boolean CheckUser(User user) {
		// TODO Auto-generated method stub
		if (user.getAge() >= 18) {
			return true;
		}
		else {
			return false;

		}

	}

}
