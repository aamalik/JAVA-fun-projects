import java.util.Scanner;


public class petDriver {
	
	public static void main(String[] args){
		petobject[] PET = new petobject[2];
		
	//	petobject("German-Shepherd", 10, "Spidy");
		
		int i;
		
		for(i = 0; i < PET.length; i++){ // populating the array 
			PET[i] = new petobject();
		}
		
		System.out.println("Enter some information for this Pet bitte");
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter First age");
		int age1= scan.nextInt();
		
		System.out.println("Enter First name");
		String name1= scan.next();
		
		System.out.println("Enter First breed");
		String breed1= scan.next(); 
		
		System.out.println("Enter Second age");
		int age2= scan.nextInt();
		
		System.out.println("Enter Second name");
		String name2= scan.next();
		
		System.out.println("Enter Second breed");
		String breed2= scan.next();
		
		PET[0].set_breed(breed1);
		PET[0].set_name(name1);
		PET[0].set_age(age1);
		
		PET[1].set_breed(breed2);
		PET[1].set_name(name2);
		PET[1].set_age(age2);
		
		System.out.println("First pet breed is:" + PET[0].get_breed() + "its age is :" + PET[0].get_age() + "and its name is : " + PET[0].get_name()) ;
		System.out.println("First pet breed is:" + PET[1].get_breed() + "its age is :" + PET[1].get_age() + "and its name is : " + PET[1].get_name()) ;	

	}
	
}
