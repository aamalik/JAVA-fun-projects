import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
/**
 * @author Asfandyar Ashraf Malik

 */

public class ServerHandler {
	public static void main(String [] args) throws IOException{
		ServerSocket sock = null;
		Socket socket = null;
		int portnum = 3210;
		try {
			 sock = new ServerSocket(portnum);
			}
			catch (IOException e) {
			System.out.println("Could not listen on port: "+portnum+", "+e);
			System.exit(1);
			}
		System.out.println("Server started at port: "+portnum);
		
		while(true){
			socket = sock.accept();
			System.out.println("Connection established"); 
			new FactBookServer(socket);
			
			}
		}
	}

