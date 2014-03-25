import java.io.*;
import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class GemanEnglishTranslator implements Translator{
	
  public GemanEnglishTranslator(){
		
		try{
		Scanner scan = new Scanner(new FileInputStream("en2de.txt"));
		HashMap<String,String> trans = new HashMap<String,String>();
		
		while(scan.hasNext()){
			String str = scan.nextLine();
			String [] words = str.split(" -- ");
			DictEntry entry = new DictEntry(words[0], words[1]);
			trans.put(entry.getEnglish(),entry.getGerman());		
		}
		
		this.translator = trans;
		
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println("Stop Program");
			System.exit(0);
		}
		
	}
	public HashMap<String,String> getTranslator(){
		return this.translator;
	}
	public void setTranslator(HashMap<String,String> trans){
		this.translator = trans;
	}
	public String translate(String sourceWord){
			return this.translator.get(sourceWord);
	}
	private HashMap<String,String> translator;
}
