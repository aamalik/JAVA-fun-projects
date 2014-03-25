
import java.io.*;
import java.net.*;
import java.util.*;

/** 
 * @author Asfandyar Ashraf Malik
  */

public class MultiClient implements Runnable {


  private static Socket socket = null;
  private static PrintStream out = null;
  private static DataInputStream in = null;
  private static Scanner inputLine = null;
  private static boolean closed = false;
  
  public static void main(String[] args) {

    int portNumber = 3210;
    String host = "localhost";

    try {
      socket = new Socket(host, portNumber); //Initializing Variables
      inputLine = new Scanner(System.in);
      out = new PrintStream(socket.getOutputStream());
      in = new DataInputStream(socket.getInputStream());
    } catch (UnknownHostException e) {
      System.err.println("Unable to connect to host!");
    } catch (IOException e) {
      System.err.println("Error");
    }
    
      try {

        new Thread(new MultiClient()).start();
        while (!closed) { 
          out.println(inputLine.nextLine().trim());
        }

        out.close();
        in.close();
        socket.close();
      } catch (IOException e) {
        System.err.println("IOException:  " + e);
      }
    
  }

public void run() { // this will be called by.start() in the new thread above

    String line;
    try {
      while ((line = in.readLine()) != null) {
        System.out.println(line);
      }
      closed = true;
    } catch (IOException e) {
      System.err.println("IO exception");
    }
  }
}