/**;
 * @author Asfandyar Ashraf Malik
 * @homework_number 3
 * @problem_number 4 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.*;
import java.util.*;

public class Copy {
	public static void main(String[] args) throws IOException
    {	
		Scanner scan = new Scanner(System.in);
		System.out.println("First file:");
		String filename1 = scan.next();
		
		System.out.println("Second file:");
		String filename2 = scan.next();
		
		File fileOne = new File(filename1);
		FileInputStream inputStream = new FileInputStream(fileOne);
		File fileTwo = new File(filename2);
		
		if(fileTwo.isFile() ){ // In case its a folder
			FileOutputStream outputStream = new FileOutputStream(fileTwo);		
			int Nbytes;
			byte[] buffer = new byte[1024];
			try{
				while ((Nbytes = inputStream.read(buffer)) > 0){
		 	    	outputStream.write(buffer, 0, Nbytes);
		 	    }
				inputStream.close();
			    outputStream.close();
			}
			catch(FileNotFoundException e){
	    		e.printStackTrace();
	    	}
		}
		
		if(fileTwo.isDirectory() ){
			// In case its a folder
			filename2 = filename2 + "/" + filename1;
			fileTwo = new File(filename2);
			
			FileOutputStream outputStream = new FileOutputStream(fileTwo);
			int Nbytes;
			byte[] buffer = new byte[1024];
			
			try{
				while ((Nbytes = inputStream.read(buffer)) > 0){
		 	    	outputStream.write(buffer, 0, Nbytes);
		 	    }
	
				fileOne.delete();
				inputStream.close();
			    outputStream.close();
			}
			
			catch(FileNotFoundException e){
	    		e.printStackTrace();
	    	}
		}
    }
}