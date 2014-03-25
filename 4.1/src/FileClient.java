
import java.io.*;
import java.net.*;
import javax.swing.JTextArea;


public class FileClient extends Thread{
   
	  static private Socket connection=null;       
      static private PrintWriter outgoing=null;     
      static private BufferedReader incoming=null;  
      static String command=null;
	
	public FileClient(JTextArea disp, String request, Socket socket) {
		this.disp = disp;
		this.command = request;
		this.connection = socket;
		start();
	}
	
	private static JTextArea disp;
    static final int PORT = 3210;
   
   
   
   public static void main(String[] args) {
   
    
      
      command = args[0];
      
      try {
         connection = new Socket("localhost", PORT );
         incoming = new BufferedReader(new InputStreamReader(connection.getInputStream())); //initializing the reader and the writer
         outgoing = new PrintWriter( connection.getOutputStream() );
         outgoing.println(command); //sending the command to server
         outgoing.flush();
      }
      catch (Exception e) {
         System.out.println("Can't make connection with the server");
         System.exit(1);
      }
      
      try {
         if (command.equals("index")) { // do this if the command was "index"
      
            System.out.println("List of files available on the server:");
            while (true) {
               String filename = incoming.readLine();
               disp.append(filename + "\n");
               if (filename == null)
                   break;
               System.out.println("   " + filename); // writing the list of files to the computer
            }
         }
         else { //here the command was get<file>
            String message = incoming.readLine();
			System.out.println("Server: "+message);
            if (! message.equals("ok")) {
               System.err.println("Specified file not found on server.");
               disp.append("...file received\n");
               System.exit(1);
            }
            
            PrintWriter fileOut; //writing the contents received from the server to a file with same name  
            fileOut = new PrintWriter( new FileWriter((args[0].substring(4)).substring(0,(args[0].substring(4)).length()-1) ));
            disp.append(incoming + "\n");
            
            while (true) {
                String line = incoming.readLine();
                if (line == null)
                    break;
                fileOut.println(line);
            }
            if (fileOut.checkError()) {
               System.err.println("Error occurred while copying the file from the server.");
            }
         }
      }
      catch (Exception e) {
    	  System.err.println("Error Occured");
      }
      finally {
         try {
            connection.close();
         }
         catch (IOException e) {
         }
      }
      
   }
}