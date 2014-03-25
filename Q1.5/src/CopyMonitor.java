
public class CopyMonitor {

	private boolean toner;
	private boolean exceed100000limit;
	
	public CopyMonitor(){
		this.toner= false;
		this.exceed100000limit=false;
	}
	
	public CopyMonitor(boolean ntoner, boolean nexceedlimit){
		this.toner= ntoner;
		this.exceed100000limit=nexceedlimit;
	}
	
	public void set_toner(boolean t){
		this.toner=t;
	}

	public void set_exceedlimit(boolean t){
		this.exceed100000limit=t;
	}

	public boolean get_toner(){
		return this.toner;
	}

	public boolean get_exceedlimit(){
		return this.exceed100000limit;
	}
	
	public void check_status(){
		if((this.toner==true) && (this.exceed100000limit==true)){
			System.out.printf("Not Needeed");
		}
		else {
			System.out.printf("Needed");			
		}
	}
}
