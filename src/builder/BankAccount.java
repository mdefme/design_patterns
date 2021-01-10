package builder;

public class BankAccount {
	
	public int accountNumber;
	public String owner;
	public String branch;
	public int revolutUsername;
	public int paypalUsername;
	public double balance;

	public static class Builder{
		private int accountNum;
		private String owner;
		private String branch;
		private double balance;
		private int paypalUsername;
		private int revolutUsername;
		
		public Builder(int accountNum) {
			this.accountNum = accountNum;
		}
		
		public Builder owner(String owner) {
			this.owner=owner;
			return this;
		}
		
		public Builder branch(String branch) {
			this.branch=branch;
			return this;
		}
		
		public Builder balance(double balance) {
			this.balance=balance;
			return this;
		}
		
		public Builder paypalUsername(int paypalUsername) {
			this.paypalUsername=paypalUsername;
			return this;
		}
		
		public Builder revolutUsername(int revolutUsername) {
			this.revolutUsername=revolutUsername;
			return this;
		}
		
		public BankAccount build() {
			BankAccount account = new BankAccount();
			account.accountNumber = this.accountNum;
			account.owner = this.owner;
			account.branch = this.branch;
			account.balance = this.balance;
			account.paypalUsername = this.paypalUsername;
			account.revolutUsername = this.revolutUsername;
			
			return account;
		}
		
	}
	
	public static void main(String[] args) {
		BankAccount account = new BankAccount.Builder(1)
				.owner("Mattia")
				.balance(140)
				.paypalUsername(11)
				.build();
		
		BankAccount otherAccount = new BankAccount.Builder(1)
				.owner("Marko")
				.balance(14)
				.paypalUsername(11)
				.revolutUsername(112)
				.build();
	}
	
}
