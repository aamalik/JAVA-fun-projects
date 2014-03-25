
public class PetDog extends Dog {

	private String owner;
	private String address;
	
	public String getOwner(){
		return this.owner;
	}
	public String getAddress(){
		return this.address;
	}
	
	public void setOwner(String nowner){
		this.owner= nowner;
	}

	public void setAddress(String naddress){
		this.address= naddress;
	}
	
	public PetDog(String nowner, String naddress, String nbreed, String nsex, double nweight, int nbirthdate){
		super(nbreed, nsex, nweight, nbirthdate);
		this.owner= nowner;
		this.address= naddress;
	}
}
