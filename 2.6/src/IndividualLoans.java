/**
 * @author Asfandyar Ashraf Malik
 * @homework_number 2
 * @problem_number 5
 * @creation_date 16 Oct. 2013
 * @last_modified 16 Oct. 2013 
 */

/**  I implemented IndividualLoans as a seperate class here. */

public class IndividualLoans extends Loan{
	
	public IndividualLoans(int loanNumber, String customerLastName, int loanAmount, double interestRate, int term){
		super(loanNumber, customerLastName, loanAmount, term);
		this.interestRate = 0.0; 
	}
	
	/** No need to implement anything in this Constructor. Can be implemented but no incentive to do this  */		
	public IndividualLoans(){		
	}
	
}
