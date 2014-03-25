import java.util.Scanner;


public class employetest{
	public static void main(String[] args){
	
	    employee[] EMP=  new employee[3];
	    int i;
	    for(i = 0; i < EMP.length; i++){ // populating the array 
			EMP[i] = new employee();
		}
	    
	    System.out.println("Enter information for the first employee");
	    Scanner scan = new Scanner(System.in);
		int hours1 = scan.nextInt();
		int hourly_rate1 = scan.nextInt();
		
		EMP[0].sethours(hours1);
		EMP[0].sethourly_rate(hourly_rate1);
		EMP[0].gross_pay(hours1, hourly_rate1);
		System.out.printf("Total Gross Pay is = " + EMP[0].gross_pay(hours1, hourly_rate1));
		
		System.out.println("Enter information for the second employee");
		int hours2 = scan.nextInt();
		int hourly_rate2 = scan.nextInt();
		EMP[1].sethours(hours2);
		EMP[1].sethourly_rate(hourly_rate2);
		EMP[1].gross_pay(hours2, hourly_rate2);
		System.out.printf("Total Gross Pay is %f" + EMP[1].gross_pay(hours2, hourly_rate2));
		
		System.out.println("Enter information for the third employee");
	    int hours3 = scan.nextInt();
		int hourly_rate3 = scan.nextInt();
		EMP[2].sethours(hours3);
		EMP[2].sethourly_rate(hourly_rate3);
		EMP[2].gross_pay(hours3, hourly_rate3);
		System.out.printf("Total Gross Pay is %f" + EMP[2].gross_pay(hours3, hourly_rate3));
		
	}
}
