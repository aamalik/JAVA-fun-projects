/**
 * @author Asfandyar Ashraf Malik
 * @homework_number 2
 * @problem_number 6
 * @creation_date 16 Oct. 2013
 * @last_modified 16 Oct. 2013 
 */

/**  This class implements the LoanConstant class */

public abstract class Loan implements LoanConstants {
	
	private int loanNumber;
	private String customerLastName;
	private int loanAmount;  //should not exceed 100,000
	protected double interestRate;
	private int term;
	
	public Loan(){
		this.loanNumber = 0;
		this.customerLastName = "";
		this.loanAmount = 0;
		this.interestRate = 1.0;
		this.term = 0;
	}
	
	/** Total Amount Owed method  returns the total amount of money */
	public double totalAmountOwed(){
		double n;
		n= this.loanAmount + ((this.loanAmount) * (this.interestRate));
		return n;
	}
	
	/** Implemented the restrictions in the constructor e.g. loanAmount should not exceed maximumLoanAmount. Not sure if its a good practise */
	
	public Loan(int nloanNumber, String ncustomerLastName, int nloanAmount, int nterm){
		this.loanNumber = nloanNumber;
		this.customerLastName = ncustomerLastName;
		
		if(this.loanAmount < maximumLoanAmount){
			this.loanAmount = nloanAmount;
		}
		else{
			System.out.printf("Cannot proceed with the load because exceeds 100,000 limit \n");
		}
		
		if(nterm == 3){
			this.term= mediumterm;
		}
		else if (nterm == 5){
			this.term = longterm;
		}
		
		else {
			nterm= 1;
		}
				
		this.interestRate=0.0;
}
	
	/** Setter and Getter Methods for all attributes of the class Loan */
	
	public void setloanNumber(int nloanNumber){
		this.loanNumber= nloanNumber;
	}
	
	public int getloanNumber(){
		return this.loanNumber;
	}
	
	public void setCustomerLastName(String ncustomerLastName){
		this.customerLastName= ncustomerLastName;
	}
	
	public String getCustomerLastName(){
		return this.customerLastName;
	}
	
	public void setloanAmount(int nloanAmount){
		this.loanAmount= nloanAmount;
	}
	
	public int getloanAmount(){
		return this.loanAmount;
	}
	
	public void setinterestRate(double ninterestRate){
		this.interestRate= ninterestRate;
	}
	
	public double getinterestRate(){
		return this.interestRate;
	}
	
	public void setterm(int nterm){
		this.term= nterm;
	}
	
	public int getterm(){
		return this.term;
	}
	
/** This method toString() just returns all the values as a String*/	
	public String toString(){
		return " Loan number :" + this.loanNumber + "\n Customer Last Name : " + this.customerLastName +
				"\n Total Loan Amount : " + this.loanAmount + "\n Interest Rate : " + this.interestRate +
				"\n Term is : " + this.term;
	}	
}
