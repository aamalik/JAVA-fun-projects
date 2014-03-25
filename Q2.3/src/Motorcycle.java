
/**It contains all the motorcycle which extends from vehicle
	 * @author Asfandyar Ashraf Malik
*/

public class Motorcycle extends Vehicle{
	
		Motorcycle(String nname, String nmodel, int nday, int nmonth, int nyear, double nengineCapac){
		super(nname, nmodel, nday, nmonth, nyear);
		this.engineCapac = nengineCapac;
	}
		
	private double engineCapac;	
	public void setEngineCapac(double nengineCapac){
		this.engineCapac = nengineCapac;
	}
	
	public double getEngineCapac(){
		return this.engineCapac;
	}
	
	public double computeTax(){
		if (this.engineCapac <= 150)
			return 15.0;
		else if(151 <= this.engineCapac && this.engineCapac <= 400)
				return 30.0;
		else if(401 <= this.engineCapac && this.engineCapac <= 600)
					return 45.0;
		else return 60.0;
	}

}
