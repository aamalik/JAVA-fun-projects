/**
 	 * @author Asfandyar Ashraf Malik
*/
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.GregorianCalendar;


public class VehicleExciseDuty {
	
	public static void main(String[]args){
		
		int p,q,i = 0;
		double weight,engineCapac,emission,tax;
		
		Vehicle[] v = new Vehicle[6];
		String name, model, str_date,type,token[] = new String[3];
		
		InvoicingSystem[] inv = new InvoicingSystem[6];
		
		Date date = new Date();
		GregorianCalendar date1 = new GregorianCalendar(), when = new GregorianCalendar(2001,03,01);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter manufacturer name");
		name = in.nextLine();
		
		System.out.println("Enter model:");
		model = in.nextLine();
		p = 1;
	do{
		p = 1; 
		System.out.println("Enter registration date ");
		str_date = in.nextLine(); 
		
		try{	
			date = sdf.parse(str_date);
			
			
			if (!sdf.format(date).equals(str_date)){
				System.out.println(" Error");
				p = 0;
				System.exit(0);
			}
			try{
				date1.setTime(date);
			}
			catch(Exception e){
				System.out.println("Error");
				p = 0;
				System.exit(0);
			}
							
			do{
				q = 1; 
				System.out.println("Enter vehicle type");
				type = in.nextLine();
				token = str_date.split("/");
				
				if(type.equals("van")){
					System.out.println("Enter Weight:");
					weight = in.nextDouble();
					
					v[i] = new Van(name,model,Integer.parseInt(token[0]),Integer.parseInt(token[1]),Integer.parseInt(token[2]),weight);
					tax = v[i].computeTax();
					inv[i] = new InvoicingSystem(name, model,Integer.parseInt(token[0]),Integer.parseInt(token[1]),Integer.parseInt(token[2]),tax);
					inv[i].printInvoice();				
					i++;
				}
				if(type.equals("car")){
					if (date1.before(when)){
						System.out.println("Enter Engine capacity :");
						engineCapac = in.nextDouble();
						v[i] = new Car(name,model,Integer.parseInt(token[0]),Integer.parseInt(token[1]),Integer.parseInt(token[2]),0,engineCapac);
					}
					else{
						System.out.println("Enter Co2 emission");
						emission = in.nextDouble();					
						v[i] = new Car(name,model,Integer.parseInt(token[0]),Integer.parseInt(token[1]),Integer.parseInt(token[2]),emission,0);
				
					}
					tax = v[i].computeTax();
					inv[i] = new InvoicingSystem(name, model,Integer.parseInt(token[0]),Integer.parseInt(token[1]),Integer.parseInt(token[2]),tax);
					inv[i].printInvoice();
					i++;
				}
				if(type.equals("motorcycle")){
					System.out.println("Enter Engine capacity");
					engineCapac = in.nextDouble();
					
					v[i] = new Motorcycle(name,model,Integer.parseInt(token[0]),Integer.parseInt(token[1]),Integer.parseInt(token[2]),engineCapac);
					tax = v[i].computeTax();
					inv[i] = new InvoicingSystem(name, model,Integer.parseInt(token[0]),Integer.parseInt(token[1]),Integer.parseInt(token[2]),tax);
					inv[i].printInvoice();
					i++;	
				}
				
			}
			while(q == 0);
			
		}
		catch(ParseException e){
			System.out.println("Error, do it again");
			p = 0;
		}

		}
		while(p == 0);
	}
}