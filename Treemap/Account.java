package Treemap;



public class Account implements Comparable<Account>{

	private String accountHolderName;
	private int acctNo;
	private double balance;
	
	
	public Account(String accountHolderName, int acctNo, double balance) {
		super();
		this.accountHolderName = accountHolderName;
		this.acctNo = acctNo;
		this.balance = balance;
	}


	public String getAccountHolderName() {
		return accountHolderName;
	}


	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	@Override
	public String toString() {
		return "Account [accountHolderName=" + accountHolderName + ", acctNo=" + acctNo + ", balance=" + balance + "]";
	}


	@Override
	public int compareTo(Account acc) {
		return this.acctNo-acc.acctNo;
	}
	

	

}