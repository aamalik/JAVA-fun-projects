/**
 * @author Asfandyar Ashraf Malik
 * @homework_number 2
 * @problem_number 5
 * @creation_date 16 Oct. 2013
 * @last_modified 16 Oct. 2013 
 */

/**  Implemented BusinnesLoans as a seperate class. */

public class BusinnesLoan extends Loan{
	public BusinnesLoan(int loanNumber, String customerLastName, int loanAmount, double interestRate, int term){
		super(loanNumber, customerLastName, loanAmount, term);
		this.interestRate = 1.0; 
	}
	
/** No need to implement anything in this Constructor  */
	
	public BusinnesLoan(){
	}
}
