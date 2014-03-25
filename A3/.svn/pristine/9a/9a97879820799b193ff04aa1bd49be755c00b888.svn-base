import java.util.Scanner;

public class Application extends PrimeNumbers{

  public static void main(String[] args) {
    
    System.out.println("Please enter a number ");
    Scanner scan = new Scanner(System.in);
    int n =scan.nextInt();
    
    
    if(isPrime(n)==true){
    	System.out.printf("Its a prime Number");
    }
    
    while(isPrime(n)==false){
    
	    primeFactors(n);	
	    System.out.println("Primefactors");
	    for (Integer integer : primeFactors(n)) {
	      
	    	System.out.println(integer);
	    }
	    break;
    }
  }
} 