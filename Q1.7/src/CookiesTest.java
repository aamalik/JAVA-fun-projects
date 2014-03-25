import java.util.Scanner;
public class CookiesTest {
	
	public static void main(String[] args){
		
		Cookies myCookieTracking;
		Scanner scan = new Scanner(System.in);
		int id, boxes, w;
		
		myCookieTracking = new Cookies();
		
		System.out.printf("First entry \n");
		System.out.println("Enter a number between 1 and 10.");
		id = scan.nextInt();
		
		boxes = scan.nextInt();
		if (boxes < 0){
			System.out.printf("Enter a number greater than 0. \n");
			id = scan.nextInt();
		}
		myCookieTracking.addEntry(id, boxes);
		
		System.out.print("Second Entry \n");
		System.out.print("Enter a number between 1 and 10. \n");
		id = scan.nextInt();
		boxes = scan.nextInt();
		myCookieTracking.addEntry(id, boxes);
		
		System.out.print("Third Entry \n");
		System.out.print("Enter a number between 1 and 10 \n");
		id = scan.nextInt();
		
		boxes = scan.nextInt();
		myCookieTracking.addEntry(id, boxes);
		
		System.out.printf("Fourth Entry \n");
		System.out.printf("Enter a number between 1 and 10.\n");
		id = scan.nextInt();
		
		boxes = scan.nextInt();
		myCookieTracking.addEntry(id, boxes);
		
		System.out.printf("Fifth Entry \n");
		System.out.printf("Enter a number between 1 and 10. \n");
		id = scan.nextInt();
		
		boxes = scan.nextInt();
		myCookieTracking.addEntry(id, boxes);
		
		System.out.printf("Sixth Entry \n");
	    System.out.printf("Enter a number between 1 and 10. \n");
		id = scan.nextInt();
		
		boxes = scan.nextInt();
		myCookieTracking.addEntry(id, boxes);
		
		System.out.printf("Seven Entry \n");
		System.out.printf("Enter a number between 1 and 10. \n");
		id = scan.nextInt();
		
		boxes = scan.nextInt();
		myCookieTracking.addEntry(id, boxes);
		
		System.out.printf("Eight Entry \n");
		System.out.printf("Enter a number between 1 and 10. \n");
		id = scan.nextInt();
		
		boxes = scan.nextInt();
		myCookieTracking.addEntry(id, boxes);
		
		myCookieTracking.printTracking();
		
		w = myCookieTracking.winner();
		System.out.println("So the winner is :"+ w);
		
	}
}
