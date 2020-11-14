
public class SavingsAccount extends BankAccount {
	/** interest rate per annum */
	private double rate = 0.025;
	/** savings number - unique for each savings account */
	private int savingsNumber = 0;
	/** savings account number that concatenates the account number and savings number */
	private String accountNumber;


	/**
	 * override standard constructor
	 * 
	 * @param name   the owner of the account
	 * @param amount the beginning balance
	 */
	public SavingsAccount(String name, double amount) {
		super(name, amount);
		this.accountNumber = super.getAccountNumber() + "-" + this.savingsNumber;
	}

	public int getSavingsNumber() {
		return this.savingsNumber;
	}

	/**
	 * override copy constructor creates another account for the same owner
	 * 
	 * @param oldAccount the account with information to copy
	 * @param the        beginning balance of the new account
	 */
	public SavingsAccount(BankAccount oldAccount, double amount) {
		super(oldAccount, amount);
		this.savingsNumber = ((SavingsAccount) oldAccount).getSavingsNumber() + 1;
		this.accountNumber = super.getAccountNumber() + "-" + this.savingsNumber;
	}
	
	/**
	 * override accessor method to account number
	 * 
	 * @return the account number
	 */
	public String getAccountNumber() {
		return this.accountNumber;
	}
	
	/**
	 * allows you to accumulate interest for your savings account
	 */
	public void postInterest() {
		double newBalance = super.getBalance()*(1+this.rate/12);
		super.setBalance(newBalance);
	}

}
