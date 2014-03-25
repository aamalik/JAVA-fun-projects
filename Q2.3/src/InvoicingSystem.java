/**It contains all the information of vehicle and the amount of tax to be paid
	 * @author Asfandyar Ashraf Malik
*/

import java.util.Calendar;
import java.util.GregorianCalendar;

public class InvoicingSystem{
	
	public InvoicingSystem(String nmanufactName, String nmodel, int nday, int nmonth, int nyear, double ntax){
		GregorianCalendar Date = new GregorianCalendar(nyear,nmonth,nday);
		
		this.manufactName = nmanufactName;
		this.model = nmodel;
		this.regDate = Date;
		this.tax = ntax;
	}

	public void printInvoice(){
		System.out.println(this.manufactName);
		System.out.println(this.model);
		System.out.println(this.regDate.get(Calendar.DATE)+this.regDate.get(Calendar.MONTH)+ this.regDate.get(Calendar.YEAR));
		System.out.println("Tax" + this.tax);
	}
	
	private String manufactName;
	private String model;
	private GregorianCalendar regDate;
	private double tax;
	
}
