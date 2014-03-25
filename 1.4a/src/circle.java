import java.util.Scanner;
import java.lang.Math;


public class circle {
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter the radius");		
		int radius = scan.nextInt();		
		
		System.out.printf("The Cirumference of the Cirle is %f and its Diameter is %d and area is %f", 
				2*radius*Math.PI, 2*radius, Math.PI *radius*radius); 	

	}
}