
public class Time {
	private int minutes;
	
	public void setminutes(int nminutes){
		this.minutes= nminutes;
	}
	
	public int getminutes(){
		return this.minutes;
	}
	
	public static void convert(int minutes){
		int hours, newminutes;
		hours =	minutes / 60;
		newminutes = minutes%60;
		System.out.println(hours + " " + newminutes);
	}
	
	public static void main(String[] args){
		
		int minutes = 197;
		convert(minutes);
		
		
	}
	
	
	
}