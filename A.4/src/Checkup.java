
public class Checkup {
	
	private int patientNumber;
	private int systolic;
	private int diastolic;
	private int LDL;
	private int HDL;
	
	public void setPatientNumber(int npatientNumber){
		this.patientNumber= npatientNumber;
	}	
	public int getPatientNumber(){
		return this.patientNumber;
	}
	
	public void setSystolic(int nsystolic){
		this.systolic= nsystolic;
	}	
	public int getSystolic(){
		return this.systolic;
	}
	
	public void setDiastolic(int ndiastolic){
		this.diastolic= ndiastolic;
	}	
	public int getDiastolic(){
		return this.diastolic;
	}
	
	public void setLDL(int nLDL){
		this.LDL= nLDL;
	}	
	public int getLDL(){
		return this.LDL;
	}
	
	public void setHDL(int nHDL){
		this.HDL= nHDL;
	}	
	public int getHDL(){
		return this.HDL;
	}
	
	public int computeRatio(){
		int div = this.LDL / this.HDL;
	//	System.out.println(" " + div);
		return div;
	}
	
	public void explainRatio(){
		
		if(computeRatio() < 3.5){
			System.out.println("This is a good ratio ");
		}
		else{
			System.out.println("Nicht ein good ratio ");
		}
	}		
	
}
