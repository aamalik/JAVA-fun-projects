
public class CurrencyDenominations {
	private int currency;
	
	public void setCurrency(int nminutes){
		this.currency= nminutes;
	}
	
	public int getCurrency(){
		return this.currency;
	}
	
	public static void denominations(int currency){
		int twenties, tens, fifes, ones;
		
		twenties =	currency / 20;
		int remtwenties = currency % 20;
		
		tens =	remtwenties  / 10;
		int remtens = remtwenties % 10;
		
		fifes =	remtens / 5;
		int remfifes = remtens % 5;
		
		ones = remfifes;
		
		System.out.println("20s:" + twenties + "  10s:" + tens + "  5s:" + fifes + "  1s:" + ones);
	}
	
	public static void main(String[] args){
		
		int currency = 106;
		denominations(currency);
		
		
	}
	
	
	
}