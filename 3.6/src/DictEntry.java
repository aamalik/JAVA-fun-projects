import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DictEntry {
	private String english;
	private String german;
	
	public DictEntry(){
			this.english = "";
			this.german = "";
	}
		public DictEntry(String english, String german) {
		this.english = english;
		this.german = german;
	}
	
	public String getEnglish() {
		return english;
	}
	
	public void setEnglish(String english) {
		this.english = english;
	}
	
	public String getGerman() {
		return german;
	}
	
	public void setGerman(String german) {
		this.german = german;
	}
}
