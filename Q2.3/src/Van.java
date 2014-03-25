/**It contains all the van information which extends from vehicle
	 * @author Asfandyar Ashraf Malik
*/
public class Van extends Vehicle{

	private double weight;
	
	Van(String nname, String nmodel, int nday, int nmonth, int nyear, double nweight){
		super(nname, nmodel, nday, nmonth, nyear);
		this.weight = nweight;
	}
		
	public double getWeight(){
		return this.weight;
	}
	public void setWeight(double weight){
		this.weight = weight;
	}
	public double computeTax(){
		if (this.weight < 3500)
			return 165;
		else 
			return 190;
	}

}
