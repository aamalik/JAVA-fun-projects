public class Decimal{
	
	static final double NUMBER = 1349.9431;
	
	public static void main(String args[]){
		
		
		double decimal2 = Math.round(NUMBER* 100.0) / 100.0;
		double decimal3 = Math.round(NUMBER* 1000.0) / 1000.0;
		double decimal1 = Math.round(NUMBER* 10.0) / 10.0;
		
		System.out.println("1 Decimal Number is: "+ decimal1);
		System.out.println("2 Decimal Number is: "+ decimal2);
		System.out.println("3 Decimal Number is: "+ decimal3);
		
	/*	I am not sure whether it was mandatory to use both div and modulo. If
	 * then the solution is good with only the div but if you insist on using 
	 * both then look at this commented code
	   
	    double bhai = Math.round(NUMBER);
	    int num= (int)(bhai);
	    
	    int a = num; 
		
		int decimal1 = num % 10;
		num = num /10;
		int decimal2 = num % 10;
		num = num / 10;
		int decimal3 = num % 10;
				
		System.out.println("1 Decimal Number is: "+ a + "."+decimal1+""+decimal2+""+decimal3);
		System.out.println("2 Decimal Number is: "+ a + "."+decimal1+""+decimal2);
		System.out.println("3 Decimal Number is: "+ a + "."+decimal1);*/
	}
}


