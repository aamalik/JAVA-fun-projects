import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class CopyFile
{
    public static void main(String[] args)
    {	
 
    	FileInputStream inStream = null;
    	FileOutputStream outStream = null;
  
    	try{
    	    File input =new File("/home/asfandyar/workspace/Quiz4-4/" + args[0]);
    	    File output =new File(args[1]);
 
    	    inStream = new FileInputStream(input);
    	    outStream = new FileOutputStream(output);
 
    	    byte[] buffer = new byte[1024];
 
    	    int length;
    	   
    	    while ((length = inStream.read(buffer)) > 0){
    	    	outStream.write(buffer, 0, length);
    	    }

    	    inStream.close();
    	    outStream.close();
    	    System.out.println("The file is copied successfully");

    	}catch(IOException e){
    		e.printStackTrace();
    	}
    }
}