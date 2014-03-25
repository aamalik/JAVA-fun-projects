
public class petobject {
	
	private String breed;
	private int age;
	private String name; 
	
	public String get_breed(){
		return this.breed;
		
	}
	public int get_age(){
		return this.age;
	}
	
	public String get_name(){
		return this.name;
	}
	
	public void set_breed(String nbreed){
		this.breed=nbreed;
	}
	
	public void set_age(int nage){
		this.age=nage;
	}
	
	public void set_name(String nname){
		this.name=nname;
	}
	
	public petobject(){
		this.breed="";
		this.age=0;
		this.name="";	
	}
	
	public petobject(String nbreed, int nage, String nname){
		this.breed=nbreed;
		this.age=nage;
		this.name=nname;
	}
	

}
