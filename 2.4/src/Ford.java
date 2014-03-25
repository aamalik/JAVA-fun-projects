/**
 * @author Asfandyar Ashraf Malik
 * @homework_number 2
 * @problem_number 4
 * @creation_date 16 Oct. 2013
 * @last_modified 16 Oct. 2013 
 */


/** Ford class inherits from its parent class Auto. it is a subclass to the super class Auto */

public class Ford extends Auto{
	
	public Ford(){
		this.price=0;
		this.car_maker="";
	}
	
	public void setPrice(double nprice){
		nprice= 20000;
		this.price= nprice;
	}
}
