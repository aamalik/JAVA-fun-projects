
class Dog {

	
	private String breed;
	private String sex;
	private double weight; 
	private int birthdate;
	
	public Dog(){                   // empty constructor to declare arrays of pets
		this.breed = ""; 
		this.sex = "";
		this.weight = 0.0;
		this.birthdate= 0;
		
	}
	public Dog (String b, String n, double a, int i){ //constructor for a Pet
		this.breed = b;
		this.sex = n;
		this.weight = a;
		this.birthdate = i;
	}
	
	/* getter methods */
	public String getBreed(){
		return this.breed;
	}
	public String getSex(){
		return this.sex;
	}
	public double getWeight(){
		return this.weight;
	}
	/* setter methods */
	public void setBreed(String n){
		this.breed  = n;	
	}
	public void setSex(String b){
		this.sex = b;
	}
	public void setWeight(double a){
		this.weight= a;
	}
	
	public void setBirthDate(int a){
		this.birthdate= a;
	}
}


