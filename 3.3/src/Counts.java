/**
 * @author Asfandyar Ashraf Malik
 * @homework_number 3
 * @problem_number 3
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
import java.io.*;

public class Counts {
	
	public static int[] count(String filename){
		int arr[] = new int[3];

		try{
			Scanner scan;
			scan = new Scanner(new FileInputStream(filename));
			
			while(scan.hasNext()){
				arr[0] = arr[0] + 1;  //this is number of lines in the file
				String line = scan.nextLine();
				
				StringTokenizer token = new StringTokenizer(line," "); // space as delimeter so we find the number of words
				arr[1] = arr[1] + token.countTokens();	//this is amount of words in the file
				
				arr[2] = arr[2] + line.length();  //this is amount of characters in the file				
			}
			
			scan.close();
			return arr;
		}
		catch(FileNotFoundException e){
			System.out.println("Error.");
			return arr;
		}
	}
	
	public static int NumDifWords(String filename){  	//this file returns the number of different 
		ArrayList<String> words = new ArrayList<String>();
		
		try{
			Scanner scan = new Scanner(new FileInputStream(filename));
		
			while(scan.hasNext()){
				String str = scan.nextLine();
				StringTokenizer token = new StringTokenizer(str," ");
				
				while(token.hasMoreTokens()){
					String word = token.nextToken();
				
					if (!words.contains(word))
						words.add(word);
				}
			}

			scan.close();
			return words.size();
			
		}
		catch(FileNotFoundException e){
			System.out.println("Error");
			return 0;
		}
	}
		
	public static void main(String[] args){
		
		int arr[] = new int[3];
		
		String filename = args[0];
		int NumWord= 0;
		
		arr = count(filename);
		NumWord = NumDifWords(filename);
		
		System.out.println("The file test.txt contains:");
		System.out.println(arr[2]+ " charactrs (" + " n different characters )");
		System.out.println(arr[1]+ " words ("+ NumWord +" different words )");
		System.out.println(arr[0]+ " lines" );
	}
}


