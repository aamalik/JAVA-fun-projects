import java.util.*;

public class DonorDriver {
	public static void main(String[] args){
	
		Donor don= new Donor("Asfandyar", "high");

		System.out.println("The name is :" + don.getName());
		System.out.println("The rating is :" + don.getRatings());
		
		don.setName("Bachi");
		don.setRatings("low");
		
		System.out.println("The new name is :" + don.getName());
		System.out.println("The new rating is :" + don.getRatings());
		
	}
}
