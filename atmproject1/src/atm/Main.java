package atm;

public class Main {
	
	private double balance;
	private double depositamount;
	private double withdrawamount;
	public Main() {
		super();
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getDepositamount() {
		return depositamount;
	}
	public void setDepositamount(double depositamount) {
		this.depositamount = depositamount;
	}
	public double getWithdrawamount() {
		return withdrawamount;
	}
	public void setWithdrawamount(double withdrawamount) {
		this.withdrawamount = withdrawamount;
	}
	@Override
	public String toString() {
		return "Main [balance=" + balance + ", depositamount=" + depositamount + ", withdrawamount=" + withdrawamount
				+ "]";
	}
	
	

}
