// The class describes a savings account. It inherits from base class account.
	
public class SavingAccount extends Account{
	
	private double interest;
	
	public SavingAccount(int a, double ninterest){
		super(a);
		this.interest = ninterest;
	}
	
	public void setInterest(double ninterest){ //method which adds interest to the account
		this.interest = ninterest;
	}
	
	public double getInterest(){
		return this.interest;
	}
	
	// a new deposit method which overrides the one in Account 
	public void deposit(double sum){
		double gained_interest_balance = sum + (sum * this.interest);  
		super.deposit(gained_interest_balance); 
	}
	
	// Withdraw method is overridden from the one in Account
	public void withdraw(double sum){
		double lost_interest_balance = sum + (sum * this.interest); //tells us all the money lost 
		super.withdraw(lost_interest_balance); 
	}
	
	// method use to add money from the interest
	public void add_Interest_money (double interest){
		double added_balance = super.getBalance() * interest; 
		super.deposit(added_balance); // deposit the money earned from the interest
	}
	
	public String toString(){
		return "Acc " + this.getAccountNumber() + ":" + "balance = " + this.getBalance() + ", interest = " + this.interest;		
	}
	
}
