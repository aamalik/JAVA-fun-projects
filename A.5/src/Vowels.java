import java.util.*;
import java.util.Scanner;


public class Vowels {
	public static void main(String[] args){
		char isVowel;
		Scanner scan = new Scanner(System.in);
		isVowel = scan.next().charAt(0);
		
		if((isVowel == 'a') || (isVowel == 'e') || (isVowel =='i') ||(isVowel == 'o') || (isVowel == 'u')){
			System.out.println("Yes it is a vowel");
		}
		else{
			System.out.println("Nein");
		}
	}
}
