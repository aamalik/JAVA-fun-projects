/**It contains all the van information which extends from vehicle
	 * @author Asfandyar Ashraf Malik
*/


import java.util.GregorianCalendar;

public abstract class Vehicle {
	

	//vehicles private members
	private String manufactName;
	private String model;
	private GregorianCalendar regDate;
	
	public Vehicle(){
		this.manufactName = "";
		this.model = "";
		this.regDate = new GregorianCalendar();
	}
	
	public Vehicle(String name, String model, int day, int month, int year){
		GregorianCalendar date = new GregorianCalendar(year,month,day);
	
		this.manufactName = name;
		this.model = model;
		this.regDate = date;
	}
	
	
	public void setManufactName(String name){
		this.manufactName = name;
	}
	
	public void setModel(String model){
		this.model = model;
	}
	
	
	public void setRegDate(int day, int month, int year){
		GregorianCalendar date = new GregorianCalendar(year, month, day);
		this.regDate = date;
	}
	
	
	public String getManufactName(){
		return this.manufactName;
	}
	
	public String getModel(){
		return this.model;
	}
	
	public GregorianCalendar getRegDate(){
		return this.regDate;
		
	}
	
	public abstract double computeTax();

}