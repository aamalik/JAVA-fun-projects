import java.util.*;
import java.io.*;


public class runnable extends Thread{
	
	String fileName;
	String found;
	runnable(String file, String foundd){	
		this.fileName = file;
		this.found = foundd;
	}
	
	public void run(){
		try{
			Scanner scan;
			
			File file = new File(fileName);
			scan = new Scanner(file);
			int num = 0;
			
			while(scan.hasNext()){
				String line = scan.nextLine();
				StringTokenizer token = new StringTokenizer(line," "); // space as delimeter so we find the number of words
				
				if(line.indexOf(found) != -1)
	            	System.out.println(line);
	        	}	        	//this is amount of words in the file			
			
			System.out.println( fileName + " : " + num);	
			scan.close();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}
}
