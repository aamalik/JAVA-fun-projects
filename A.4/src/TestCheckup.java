import java.util.*;
import java.util.Scanner;

public class TestCheckup {
	
	public static void getData(Checkup checkup){

		Scanner scan = new Scanner(System.in);
		int p = 0,h=0,s=0,d=0;
		
		System.out.printf("Can you please input PatientNumber please");
		p = scan.nextInt();
		checkup.setPatientNumber(p);
		
		System.out.printf("Can you please input HDL");
		h = scan.nextInt();
		checkup.setHDL(h);
		
		System.out.printf("Can you please input Systolic");
		s = scan.nextInt();
		checkup.setSystolic(s);
		
		System.out.printf("Can you please input Diastolic");
		d = scan.nextInt();
		checkup.setDiastolic(d);
	}
	
public static void showValues(Checkup checkup){
		
		checkup.getPatientNumber();
		checkup.getHDL();
		checkup.getSystolic();
		checkup.getDiastolic();
		
		System.out.println("Patient Number" + checkup.getPatientNumber() + "HDL" + checkup.getHDL() + "Systolic"
		+ checkup.getSystolic() + "Diastolic" + checkup.getDiastolic());
	}

	public static void main(String[] args){
		
		Checkup checkup1 = new Checkup();
		Checkup checkup2 = new Checkup();
		Checkup checkup3 = new Checkup();
		Checkup checkup4 = new Checkup();
		
		getData(checkup1);
	//	getData(checkup2);
	//	getData(checkup3);
	//	getData(checkup4);
		
		showValues(checkup1);
		showValues(checkup2);
		showValues(checkup3);
		showValues(checkup4);
	}	
}
