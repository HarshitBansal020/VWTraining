package LinkedL;


public class Account {
	private int accountno;
	private int accountbalance;
	private String accountname;
	
	
	public int getAccountno() {
		return accountno;
	}
	
	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}
	
	public int getAccountbalance() {
		return accountbalance;
	}
	
	public void setAccountbalance(int accountbalance) {
		this.accountbalance = accountbalance;
	}
	
	public String getAccountname() {
		return accountname;
	}
	
	public void setAccountname(String accountname) {
		this.accountname = accountname;
	}
	
	public Account(int accountno, int accountbalance, String accountname) {
		super();
		this.accountno = accountno;
		this.accountbalance = accountbalance;
		this.accountname = accountname;
	}
	
	@Override
	public String toString() {
		return "Account [accountname=" + accountname + ", accountno=" + accountno + ", accountbalance=" + accountbalance + "]";
	}

}
