/**
 * @author Asfandyar Ashraf Malik
 * @homework_number 2
 * @problem_number 4
 * @creation_date 16 Oct. 2013
 * @last_modified 16 Oct. 2013 
 */

/** abstract class which consists of 2 fields car_maker and price  */

abstract public class Auto {
	
	protected String car_maker;
	protected double price;
/** Just an empty constructor */	
	public Auto(){
		this.car_maker= "";
		this.price = 0;
	}
	
	
/** Setter and getter Methods */
	
	public void setCar_maker(String ncar_maker){
		this.car_maker= ncar_maker;
	}
	
	abstract public void setPrice(double nprice);
	
	public double getPrice(){
		return this.price;
	}

	public String getCar_maker(){
		return this.car_maker;
	}
	
}
