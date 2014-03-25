
import java.util.Scanner;

public class DictConsole {
	private Translator translator;
	
	public Translator getTranslator() {
		return translator;
	}
	public void setTranslator(Translator translator) {
		this.translator = translator;
	}

	public static void main(String[] args) {
	
		String word,translation;
		Scanner scan = new Scanner(System.in);
		DictConsole dict = new DictConsole();
	
		
		System.out.println("Ehich dictionary you need 1) German to English 2) German to English");
		String choice = scan.nextLine();
		
		if (choice.equals("1")){
			Translator de2en = new GemanEnglishTranslator();
			dict.setTranslator(de2en);
		
			while(true){
				System.out.println("Check translation: ");
				
				word = scan.nextLine();
				translation = de2en.translate(word);
				
				if(translation == null)
					System.out.println("Error. Please do it again.");
				else
					System.out.println(translation);
			}
		}
		else{
			Translator fr2en = new GermanFrenchTranslator();
			dict.setTranslator(fr2en);
			
			while(true){
				System.out.println("Enter a word ");
				
				word = scan.nextLine();
				translation = fr2en.translate(word);
					System.out.println(translation);			
			}
		}			
	}	
}
