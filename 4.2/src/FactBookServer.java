import java.net.*;
import java.io.*;
import java.util.*;


/**
 * @author Asfandyar Ashraf Malik
 * This server, whenever recieves the command from the client, it saves the country names and URLS
 * from the config file into the hashmap and searches the map for the country that the client has asked for
 * and opens the URL and reads the page from there and maiprints the data to the client.
 */


public class FactBookServer extends Thread{
	
	private Socket socket;
	private BufferedReader input=null;
	private PrintWriter os = null;
	/**
	 * Constructor 
	 * @param s socket to initialize the server
	 * @throws IOException for IO
	 */
	public FactBookServer(Socket s) throws IOException{
		socket=s;
		input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		os = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())),true);
		start(); //calls run
	}
	/**
	 * Run performs the function as explained above
	 */
	public void run(){
		try {
			
			File file = new File("config.txt");
			HashMap<String, URL> hash = new HashMap<String, URL>();
			Scanner in = new Scanner(file);
			while(in.hasNext()){
				hash.put(in.next(),new URL(in.next()));
			}
			String a=input.readLine();
			System.out.println("Now sendind data for: "+a);
			
			URL url = hash.get(a);
			 URLConnection yc = url.openConnection();
		        Scanner rd = new Scanner(new InputStreamReader(yc.getInputStream()));
		         
		        while (rd.hasNext()) {
		        	String line = rd.nextLine();
			        os.println(line);
		        }

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}