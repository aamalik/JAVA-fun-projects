import java.net.*;
import java.io.*;
/**
 * This program is the handler for the Multi Server. It has an array for the threads
 * of the server. Which will help to deal with more than one clients and echo the message
 * written by any client to all the clients.ss
 * 
 * @author Asfandyar Malik
 */

public class ServerHandler {
	public static void main(String [] args) throws IOException{
		ServerSocket sock = null;
		Socket socket = null;
		final MultiServer[] m = new MultiServer[2];
	
			int portnum = 3210; // defining the port number that will be used to create a server
			try {
				 sock = new ServerSocket(portnum);
				}
				catch (IOException e) {
				System.out.println("Could not listen on port: "+portnum);
				System.exit(1);
				}
			System.out.println("Server started at port: "+portnum);
			
			int count = 0;
			while(true){
				
				if(count==2){  // keeping track on the number of clients that can connect to the server
								// this program only allows two clients to connect, not more
					System.out.println("Cannot connect more than two clients");
					break;
				}
				socket = sock.accept();
				m[count]= new MultiServer(socket,m); // creating the server thread and updating the array in the server class
				count++; // increasing the count
				
			}
	}
}
