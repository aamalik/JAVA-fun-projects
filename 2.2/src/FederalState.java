
//FederalState represented as Singleton
// it can be created by keeping the constructor private

/**
 * @author Asfandyar Ashraf Malik
 * @homework_number 2
 * @problem_number 1
 * @creation_date 16 Oct. 2013
 * @last_modified 16 Oct. 2013 
 */

/** Implemented as singleton  */


/** 
 * Singleton has only one instance
 * The default constructor here should be private so that other classes cannot initialize it;
 * The attribute of the class will be a private static reference to a class object
 * */

public class FederalState {
	private String name;
	private static FederalState instance= null;
	
	public FederalState(){
		this.name= "";
	}
	
	protected void setName(String nname){
		this.name= nname;
	}

	private FederalState(String nname){
		this.name= nname;
	}
	
	public static FederalState getInstance(String str){
	
		instance = new FederalState(str);
		instance.setName(str);
		return instance;
	}
/**  Print all the names of the states  */	
	public void print(){
		System.out.printf("Name of state is %s \n", this.name);	
	}


}

