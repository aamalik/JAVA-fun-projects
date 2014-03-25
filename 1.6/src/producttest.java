import java.util.Scanner;


public class producttest { 
	
	public static void main(String[] args){
		
	    products[] prod=  new products[5];
	    int i;
	    for(i = 0; i < prod.length; i++){ // populating the array 
	    	prod[i] = new products();
		}
	    
	    System.out.println("Enter quantaty information for all product");
	    Scanner scan = new Scanner(System.in);
		int quantaty1 = scan.nextInt();
		int quantaty2 = scan.nextInt();
		int quantaty3 = scan.nextInt();
		int quantaty4 = scan.nextInt();
		int quantaty5 = scan.nextInt();
		
		
		prod[0].setprice(2.98);
		prod[1].setprice(4.5);
		prod[2].setprice(9.98);
		prod[3].setprice(4.49);
		prod[4].setprice(6.87);
		

		prod[0].setquantaty_sold(quantaty1);
		prod[1].setquantaty_sold(quantaty2);
		prod[2].setquantaty_sold(quantaty3);
		prod[3].setquantaty_sold(quantaty4);
		prod[4].setquantaty_sold(quantaty5);
		
        System.out.printf("Enter the product number bitte ");
        
		int num= scan.nextInt();
		
        switch (num) {
            
        	case 1:  
            	prod[0].total_retail_value(2.98, quantaty1);
            	System.out.printf("Total Gross Pay is " + prod[0].total_retail_value(2.98, quantaty1));
                break;
            
        	case 2:  prod[1].total_retail_value(4.5, quantaty2);
	        	System.out.printf("Total Gross Pay is " + prod[1].total_retail_value(4.5, quantaty2));
	        	break;
            
        	case 3:  prod[2].total_retail_value(9.98, quantaty3);          
	        	System.out.printf("Total Gross Pay is " + prod[2].total_retail_value(9.98, quantaty3));
	        	break;
            
        	case 4:  prod[3].total_retail_value(4.49, quantaty4);
	        	System.out.printf("Total Gross Pay is " + prod[3].total_retail_value(4.49, quantaty4));
	        	break;
	            
        	case 5:  prod[4].total_retail_value(6.87, quantaty5);
	        	System.out.printf("Total Gross Pay is " + prod[4].total_retail_value(6.87, quantaty5));
	        	break;
        }   	
		
	}
}
