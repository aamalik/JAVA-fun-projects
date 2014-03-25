
public class products {
	private double price;
	private int quantaty_sold;
	
	public void setprice(double nprice){
		this.price=nprice;
	}
	
	public void setquantaty_sold(int nquantaty_sold){
		this.quantaty_sold=nquantaty_sold;
	}
	
	public double getprice(){
		return this.price;
	}
	
	public int getquantaty_sold(){
		return this.quantaty_sold;
	}
	
	public double total_retail_value(double price, int quantaty_sold){
		double a;
		a=price*quantaty_sold;			
		return a;	
	}
}
