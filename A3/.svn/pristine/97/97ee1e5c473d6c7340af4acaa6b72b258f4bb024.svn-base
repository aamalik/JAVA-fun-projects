// It is derived class from class Account.

public class CurrentAccount extends Account{
	
	private double overdraftlimit; //overdraft limit
	private boolean ifinOverdraft; //to check if it is overdraft limit or not
	
	public CurrentAccount(int a, double noverdraftlimit) {
		super(a);
		this.overdraftlimit = noverdraftlimit;
		this.ifinOverdraft = false; 	
	}
	
	
	public void setOlimit(double noverdraftlimit){
		this.overdraftlimit = noverdraftlimit;
	}
	
	public double getOlimit(){
		return this.overdraftlimit;
	}
	
	// override withdraw
	public void withdraw(double sum){
		double old_balance = super.getBalance();
		if (old_balance - sum < this.overdraftlimit){ 
			super.withdraw(sum);
			this.ifinOverdraft= true;
		}	
		else
			super.withdraw(sum);
	}
	
	public String toString(){
		if (this.ifinOverdraft == true ){
			return "Acc " + this.getAccountNumber() + ":" + "balance = " + this.getBalance() + " overdraft limit = " + this.overdraftlimit + ". The account is in overdraft.";		
		}
		else{
			return "Acc " + this.getAccountNumber() + ":" + "balance = " + this.getBalance() + " overdraft limit = " + this.overdraftlimit + ". The account is not in overdraft.";
		}
	}
}
