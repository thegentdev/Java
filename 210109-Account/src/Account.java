
public class Account {
	private int accountNo;
	private String name;
	private String email;
	private double balance;

	public Account() {
		this(9999,"No name","xxxx@xxx",0);
	}
	
	public Account(int accountNo, String name, String email, double balance) {
		this.accountNo = accountNo;
		this.name = name;
		this.email = email;
		this.balance = balance;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if (balance < 0) {
			System.out.println("The balance cannot be less than zero!");
		} else {
			this.balance = balance;
		}
	}

	public void withdrawal(int money) {
		if (balance - money < 0) {
			System.out.println("Insufficient balance!");
			System.out.println("Balance: " + balance);
		} else {
			balance -= money;
			System.out.println("The transaction is successful!");
			System.out.println("Available balance: " + balance);
		}
	}

}
