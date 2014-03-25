import java.io.*;
import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class GermanFrenchTranslator implements Translator{
	
	public GermanFrenchTranslator(){
		
		try{
		Scanner scan = new Scanner(new FileInputStream("fr2en.txt"));
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
			System.out.println("Program stopped.");
			System.exit(0);
		}	
	}

	public String translate(String sourceWord){
		return this.translator.get(sourceWord);		
	}
	
	private HashMap<String,String> translator;
}
