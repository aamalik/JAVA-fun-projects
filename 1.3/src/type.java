import java.util.Scanner;


public class type {
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Enter A number");		
		int a = scan.nextInt();
		
		if(a%2==0){
			System.out.println("Its an even number"); 
		}
		else 
			System.out.println("Its an odd number"); 
		}
}
