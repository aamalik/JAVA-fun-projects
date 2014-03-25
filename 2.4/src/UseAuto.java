/**
 * @author Asfandyar Ashraf Malik
 * @homework_number 2
 * @problem_number 4
 * @creation_date 16 Oct. 2013
 * @last_modified 16 Oct. 2013 
 */

/** This is a test function. Here we create array to Auto and the 2 elements in array denote to 
 * two different classes which further inherit from the super class Auto */


public class UseAuto {
	public static void main(String[] str){
		Auto[] auto= new Auto[2];
		
		auto[0]= new Ford();
		auto[1]= new Chevy();
		
		auto[0].setPrice(20000);
		auto[0].setCar_maker("Ford Company");

		auto[1].setPrice(22000);
		auto[1].setCar_maker("Chevy Company");
		
		System.out.println("So the price of Ford is :" + auto[0].getPrice());
		System.out.println("So the Carmaker is :" + auto[0].getCar_maker());
		
		System.out.println("So the price of Chevy is :" + auto[1].getPrice());
		System.out.println("So the Carmaker is :" + auto[1].getCar_maker());
		
	}
}
