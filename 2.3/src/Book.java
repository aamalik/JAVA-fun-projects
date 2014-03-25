/**
 * @author Asfandyar Ashraf Malik
 * @homework_number 2
 * @problem_number 3
 * @creation_date 16 Oct. 2013
 * @last_modified 16 Oct. 2013 
 */

/** A class Book which consists of title of book as string or the price of Book as double */

abstract public class Book {
	private String title;
	protected double price;

	/** Constructor with one parameter */
	public Book (String ntitle){
		this.title= ntitle;
		this.price= 0.0;
	}
	
	public String getTitle(){
		return this.title;
	}
	
	public double getPrice(){
		return this.price;
	}
	
	/** Prints the information about the books. Information is prints is title and price of book */
	public void print(){
		System.out.printf("The price for the book %s is %f \n" , this.title, this.price);
	}
	
	abstract public void setPrice(double nprice);
	
}
