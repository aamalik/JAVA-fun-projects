  
   import java.net.*;
   import javax.swing.JTextArea;
   import java.io.*;
   import java.util.*;
   public class FileServer {
   
      static final int PORT = 3210;
   /**
    * @author Asfandyar Ashraf Malik
    * 
    */
      
      private JTextArea disp;
      static File FileDirectory; 
      static ServerSocket socket; 
      static Socket connect;
      BufferedReader in;
      PrintWriter out;
        


	public static void main(String[] args) {
      
       
         
         if (args.length == 0) {
            System.out.println("No file or directory provided to make the local files available!");
            System.exit(1);
         }
         
            
         FileDirectory = new File(args[0]); 
         if (!FileDirectory.exists() || ! FileDirectory.isDirectory()) { // here check if the directory exists, if not write error and exit
            System.out.println("Invalid directory as command line argument");
            System.exit(1);
         }
               
         try {
            socket = new ServerSocket(PORT); // here creating a server at defined PORT
            System.out.println("Server started at port number " + PORT);
            while (true) {
               connect = socket.accept(); //waiting for clients
               new ClientManager(FileDirectory,connect); // creating instance of ClientManager, it is where all connection will be hamdled
            }
            
         }
         catch (Exception e) {
        	 System.out.println("Server shut down unexpectedly.");
            System.exit(1);
         }
        
      }
  
private static class ClientManager extends Thread {


  File directory;      
  Socket connection;   
  BufferedReader in;
  PrintWriter out;
  /**
   * 
   * @param dir File directory that is made available to the client
   * @param conn socket passed to the manager
   */
  
 public ClientManager(File dir, Socket conn) {
     directory = dir;
     connection = conn;
     start(); // this will call run method
  }
  
/**
 * This function will send the list of files available on the server to the client
 * Exception is thrown if the directory is not found
 */
  void sendIndex() throws IOException {
     String[] List = directory.list();
     for (int i = 0; i < List.length; i++){
     out.println(List[i]);
     }
     out.flush();
     out.close();
  }
  /**
   * This function sends the file to the client when the client sends the command similar to get<file>
   * @param fileName name of the file that the client asks for
   * @throws Exception exception is thrown if the file is not found
   */

  void sendFile(String fileName) throws IOException {
     File file = new File(directory,fileName);
     if ( (! file.exists()) || file.isDirectory() ) {
        out.println("error"); // sending error to the client if client asks for invalid file
     }
     else {
        out.println("ok"); // if the file is found on the server, "ok" is sent to the client and filecopying begins
      Scanner in = new Scanner(file);
      while(in.hasNextLine()){
    	  String line = in.nextLine();
    	  out.println(line);
      }
      in.close();
     }
     
     out.flush(); 
     out.close();
  }
  
/**
 * This is the main function that will read command from the client and do the desired actions
 */
  public void run() { // this method is called by the start() in the constructor
     String command = null;
     try {
    	in = new BufferedReader(new InputStreamReader(connection.getInputStream()));// initializing IO
        out = new PrintWriter( connection.getOutputStream() );
        command= in.readLine(); // reading from the client
        if (command.equals("index")) { // checking if the command was index
           sendIndex();
        }
        else if (command.startsWith("get")){ // checking if the command was get<file>
    	String file = (command.substring(4)).substring(0,(command.substring(4)).length()-1); //extracting the name of the file
        sendFile(file); // calling the sendfile function
        }
        else {
           out.println("unknown command");
           out.flush();
        }
     }
     catch (Exception e) {
        System.err.println("ERROR");
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
     
   
   }