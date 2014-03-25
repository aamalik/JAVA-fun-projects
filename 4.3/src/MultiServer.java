//MiniServer.java - server that echos what it receives
import java.io.*;
import java.net.*;
/**
 * This server will have an array of itself that will be used to echo the data to every
 * client. This is done by a for loop that will iterate through the array of servers
 * and print whatever is received from any of the client to all the clients.
 * 
 * @author Asfandyar
 */
public class MultiServer extends Thread{

private Socket sock=null;
private BufferedReader input=null;
 private PrintStream os = null;	
private MultiServer[] threads = new MultiServer[2];

	public MultiServer(Socket s,MultiServer[] m) throws IOException{
		threads=m;
		sock=s;
		System.out.println("Connection established.");
		start();
	}
	
 public void run(){ 
		try {

			input = new BufferedReader(new InputStreamReader(sock.getInputStream())); 
			os = new PrintStream(sock.getOutputStream());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		os.println("Enter id: "); 
String line;
try {
	String id=input.readLine().trim();
	line = input.readLine();

	while (line != null) {
		System.out.println(line);
		for(int i=0;i<2;i++){ 

			threads[i].os.println(id+": "+line);
		}
		os.flush();
		line = input.readLine();
}} catch (IOException e) {
System.err.println("IO Exception");
}

} 
}