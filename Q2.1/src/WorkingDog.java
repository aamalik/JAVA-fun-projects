
public class WorkingDog extends Dog {

	private String occupation;
	private String address;
	private String businnesname;
	
	public String getOccupation(){
		return this.occupation;
	}
	public String getAddress(){
		return this.address;
	}
	
	public String getBussinesname(){
		return this.businnesname;
	}
	
	public void setBussinesname(String nbusinnesname){
		this.businnesname= nbusinnesname;
	}
	
	public void setOccupation(String noccupation){
		this.occupation= noccupation;
	}

	public void setAddress(String naddress){
		this.address= naddress;
	}
	
	public WorkingDog(String noccupation, String nbusinnesname, String naddress, String nbreed, String nsex, double nweight, int nbirthdate){
		super(nbreed, nsex, nweight, nbirthdate);
		this.occupation= noccupation;
		this.address= naddress;
		this.businnesname= nbusinnesname;
	}
}
