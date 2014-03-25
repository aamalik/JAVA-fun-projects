import java.io.*;

public class AddCheckDigit {
	public static void main(String[] args){
		 
		PrintWriter pw = null;
		try {
		    File out = new File("account_out.txt");
		    FileWriter fw = new FileWriter(out, true);

		    File IN = new File("account_in.txt");	    
		    FileReader reader = new FileReader(IN); 
		    BufferedReader inputBuffer = new BufferedReader(reader);

		    for(int i=0; i<5; i++){
		    	 int AccountNumber = Integer.parseInt(readLine);
		    	 String readLine = inputBuffer.readLine();
		    	 fw.write(readLine);
		    	 fw.write('-');
		    	 fw.write(String.valueOf(AccountNumber%7));
		    	 fw.append('\n');
		    }
		     pw = new PrintWriter(fw);		     
		}
		catch (IOException e) {
		     e.printStackTrace();
		 }
		finally {
		     if (pw != null) {
		    	 pw.close();
		     }
		}
	}
}