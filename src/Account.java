
public class Account {

	private Integer number_account;
	private String holder;
	private double balance;
	private Integer accounts;

	public void BankData() {
		System.out.println("------");
		System.out.println("bank data");
		System.out.println("number  " + this.number_account);
		System.out.println("holder  " + this.holder);
		System.out.println("balance " + this.balance);

	}

	// method open account
	public void acccount(String holder) {

		this.holder = holder;
		accounts++;
		this.number_account = accounts;
		this.balance=0;
	}

}