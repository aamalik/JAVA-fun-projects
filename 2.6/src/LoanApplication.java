/**
 * @author Asfandyar Ashraf Malik
 * @homework_number 2
 * @problem_number 6
 * @creation_date 16 Oct. 2013
 * @last_modified 16 Oct. 2013 
 */

/**  A test class to check if everything works as intended. */


public class LoanApplication  {
	public static void main(String[] str){
		Loan[] loan = new Loan[4];
	
		loan[0] = new IndividualLoans();
		loan[0].setinterestRate(1.0);
		System.out.println("First : " +loan[0].toString()+ "\n");
		System.out.println("Total Amount Owed  : " + loan[0].totalAmountOwed());
		
		loan[1] = new BusinnesLoan();
		loan[1].setinterestRate(1.1);
		System.out.println("Second : " +loan[1].toString());
		System.out.println("Total Amount Owed  : " + loan[1].totalAmountOwed()+ "\n");
		
		loan[2] = new IndividualLoans(5, "Afridi", 1000, 7.75, 5);
		loan[2].setinterestRate(7.75);
		System.out.println("Third : " + loan[2].toString() );
		System.out.println("Total Amount Owed  : " + loan[2].totalAmountOwed()+ "\n");
		
		loan[3] = new IndividualLoans(7, "Malik", 1000000, 14.75, 3);
		loan[3].setinterestRate(14.75);
		System.out.println("Fourth : " +loan[3].toString());
		System.out.println("Total Amount Owed  : " + loan[3].totalAmountOwed()+ "\n");
	}
}
