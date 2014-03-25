/**
 * @author Asfandyar Ashraf Malik
 * @homework_number 2
 * @problem_number 4
 * @creation_date 16 Oct. 2013
 * @last_modified 16 Oct. 2013 
 */


/** Chevy class inherits from its parent class Auto. it is a subclass */

public class Chevy extends Auto{
	
	public Chevy(){
		this.price=0;
		this.car_maker="";
	}
	
	public void setPrice(double nprice){
		nprice= 22000;
		this.price= nprice;
	}
}
