import java.util.Scanner;


public class Arithmetic {
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Input 3 numbers");		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();		
		int d= a+b+c;
		int e= a*b*c;
		int f= d/3;
		
		System.out.println(" Sum of all number is " + d);
		System.out.println("Product of all numbers is " + e);
		System.out.println("Average of all numbers is " + f);
		
		if(a>b){
			if(a>c){
				System.out.println("Largest Number is " + a);
			}
			if(b<c){
				System.out.println("Smalles Number is " + b);
			}
			else if(c>b){
				System.out.println("Smallest Number is " + c);
			}
		}
		
		if(b>a){
			if(b>c){
				System.out.println("Largest Number is " + b);
			}
			if(a<c){
				System.out.println("Smalles Number is " + a);
			}
			else if(c<a){
				System.out.println("Smallest Number is " + c);
			}
		}
		
		if(c>a){
			if(c>b){
				System.out.println("Largest Number is " + c);
			}
			if(a<b){
				System.out.println("Smalles Number is " + a);
			}
			else if(b<a){
				System.out.println("Smallest Number is " + b);
			}
		}
		
	}
}
