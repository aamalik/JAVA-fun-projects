/**
 * @author Asfandyar Ashraf Malik
 * @quiz_number 6
 * @problem_number 1
 */


import java.util.*;
import java.io.*;


public class runnable extends Thread{
	
	String fileName;
	
	runnable(String file){	
		this.fileName = file;	
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
				num = num + token.countTokens();	//this is amount of words in the file			
			}
			
			System.out.println( fileName + " : " + num);	
			scan.close();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}
}
