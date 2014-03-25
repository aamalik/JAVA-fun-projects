/**It contains all the van information which extends from vehicle
	 * @author Asfandyar Ashraf Malik
*/

import java.util.GregorianCalendar;
public class Car extends Vehicle{
	private double emission; 
	private double engineCapac; 
	
	Car(String nname, String nmodel, int nday, int nmonth, int nyear, double nemission,double nengineCapac){
		super(nname, nmodel, nday, nmonth, nyear);
		this.emission = nemission;
		this.engineCapac = nengineCapac; 
	}
	
	public void setEmission(double nemission){
		this.emission = nemission;
	}
	public void setEngineCapac(double ncapac){
		this.engineCapac = ncapac;
	}
	
	public double getEmission(){
		return this.emission;
	}
	
	public double getEngineCapac(){
		return this.engineCapac;
	}
	
	public double computeTax(){
		GregorianCalendar when = new GregorianCalendar(2001,03,01);
		GregorianCalendar crtDate = this.getRegDate();
		if (crtDate.before(when)){
			if (this.engineCapac <= 1550.0)
				return 110;
			else
				return 165;
		}
		else{
			if (this.emission <= 100)
				return 65.0;
			else if (101 <= this.emission && this.emission <= 120)
					return 75.0;
     		else if(121 <= this.emission && this.emission <= 150)
						return 105.0;
			else if(151 <= this.emission && this.emission <= 165)
							return 125.0;
			else if(166 <= this.emission && this.emission <= 185)
								return 145.0;
			else return 160.0;
		
		}		
	}

}
