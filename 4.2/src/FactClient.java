import java.io.*;
import java.net.*;
import java.util.*;


/**
 * @author Asfandyar Ashraf Malik

 */


public class FactClient {
	public static void main(String args[]) throws UnknownHostException,
			IOException {
		Socket sock = new Socket("localhost", 3210);
		try {
			File file = new File("iso3166.txt");
			Scanner input = new Scanner(file);
			HashMap<String, String> hash = new HashMap<String, String>();
			String temp1;
			String temp2;
			String temp;
			while (input.hasNext()) {
				temp = input.nextLine();
				StringTokenizer t = new StringTokenizer(temp);
				temp1 = t.nextToken();
				t.nextToken();
				t.nextToken();
				temp2 = t.nextToken();	hash.put(temp1, temp2);
			}

			Scanner in = new Scanner(new InputStreamReader(
					sock.getInputStream()));
			PrintWriter os = new PrintWriter(new BufferedWriter(
					new OutputStreamWriter(sock.getOutputStream())), true);
			Scanner sc = new Scanner(System.in);
			String line = null;
			System.out.println("Enter ISO code of the country: ");
			String s = sc.nextLine();
			String country = hash.get(s);
			os.println(country);
			FileWriter fstream = new FileWriter(s + ".html");
			PrintWriter outfile = new PrintWriter(fstream);
			line = in.nextLine();
			while (in.hasNext()) {

				outfile.println(line);
				line = in.nextLine();

			}
			outfile.flush();
		} finally {
			sock.close();
		}
	}
}