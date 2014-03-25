import java.io.File;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Directory {

	public static void main(String[] args){
				
		Scanner in= new Scanner(System.in);
		String str = in.nextLine();
		File current =  new File("."); //gives the current directory
		System.out.println(current.getAbsolutePath());
		int check=0;
		
		for(int j=0; j< current.list().length; j++){
			if(current.list()[j].equals(str)){
				check = 1; 
			}
		}
		
		if(check == 1){
			File newfile =  new File(current,str); 
			File[] listOfFiles = newfile.listFiles();
		
		int i;
  	  	System.out.println("Listing for directory:" + newfile);
		
  	  		for (i = 0; i < listOfFiles.length; i++){
		    	
		    	  if (listOfFiles[i].isFile()) {
			        System.out.printf("File        : " + listOfFiles[i].getName() + "         " + listOfFiles[i].length() + "        " + listOfFiles[i].lastModified());
			        
			        if(listOfFiles[i].canRead() && listOfFiles[i].canWrite()){
			        	System.out.printf("      rw");
			        }
			        else if(listOfFiles[i].canRead()&& !(listOfFiles[i].canWrite())){
			        	System.out.printf("     r-");
			        }
			        else if(!(listOfFiles[i].canRead())&& (listOfFiles[i].canWrite())){
			        	System.out.printf("     -w");
			        }
			        else if(!(listOfFiles[i].canRead())&& !(listOfFiles[i].canWrite())){
			        	System.out.printf("     --");
			        }
			        else {
			        	System.out.printf("     w");
			        }
			        System.out.println("\n");
			      } 
			      
			      else if (listOfFiles[i].isDirectory()) {
			    	  System.out.printf("Directory   : " + listOfFiles[i].getName());
			      
			        if(listOfFiles[i].canRead() && listOfFiles[i].canWrite()){
			        	System.out.printf("     rw");
			        }
			        else if(listOfFiles[i].canRead()){
			        	System.out.printf("     r");
			        }
			        else {
			        	System.out.printf("    w");
			        }
			        System.out.println("\n");
			      }
		    }
  	  		
		}
		else {
	  			System.out.println(" Error ");
		}
	}
}