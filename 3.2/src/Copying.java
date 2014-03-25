/**
 * @author Asfandyar Ashraf Malik
 * @homework_number 3
 * @problem_number 2 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copying {
	
	//Copy all the files from src to dest

	public static void copyFile(File src, File dest){
		String[] content;
		
		if (src.isDirectory()){ //checking if the File is a folder or not
			
			content = src.list();
			int length = content.length;
			int i;
			
			for (i = 0; i < length; i++){
				
				File srcFolder = new File(src,content[i]);
				File destFolder = new File(dest,content[i]);
				
				//Copy all the files
				copyFile(srcFolder,destFolder);
			}
		}
		else{
			
			try{	
				FileInputStream in = new FileInputStream(src);
				FileOutputStream out = new FileOutputStream(dest);
				
				byte[] buffer = new byte[1024];
				 
    	        int len;
    	        
    	        while ((len = in.read(buffer)) > 0){
    	    	   out.write(buffer, 0, len);
    	        }
    	        
    	        in.close();
    	        out.close();
    	        
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	
	}
	
	// Copy all files with extension from src to dest
	public static void copyWithExtension(File src, File dest, String extension){
		String[] content;
		
		if (src.isDirectory()){
			
			if (!dest.exists()){
				dest.mkdir();
			}
			
			content = src.list();  //all the sub directories
			int length = content.length;
			int i;
			
			for (i = 0; i < length; i++){
				File srcFolder = new File(src,content[i]);
				File destFolder = new File(dest,content[i]);
				copyWithExtension(srcFolder,destFolder, extension); //copy all the files with extension
			}
		}
		else{
			// copy a file using byte streams to support all types of files
			try{	
				String name = src.getName();
			
				if (name.endsWith(extension)){ //used endsWith predefined which tells us about the ending of a string
					
					FileInputStream in = new FileInputStream(src);
					FileOutputStream out = new FileOutputStream(dest);
					byte[] buffer = new byte[1024];
					int len;
					
					while ((len = in.read(buffer)) > 0){
						out.write(buffer, 0, len);
					}
					in.close();
					out.close();
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args){
		String src, dest, fileExtension;
		
		if(args.length == 2){
			src = args[0];
			dest = args[1];
			
			File srcFolder = new File(src); //Creating the files
			File destFolder = new File(dest);
		
			if (!srcFolder.exists()){
				System.out.println("Source folder does not exist so exit program.");
				System.exit(0);
			}
			
			else if (!destFolder.exists()){
				System.out.println("Destination folder does no exist so exit program.");
				System.exit(0);	
			}
			else{
				copyFile(srcFolder,destFolder);
			}
		}
		
		else if (args.length == 3){
				src = args[0];
				dest = args[1];
				fileExtension = args[2];
				
				File srcFolder = new File(src); //Files being created
				File destFolder = new File(dest);
				
				copyWithExtension(srcFolder,destFolder, fileExtension);	
				
		}
		else{
			System.out.println("Lesser or Higher parameters");
			System.exit(0);
		}		
	}
}

