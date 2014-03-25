import java.util.Arrays;
//package org.kodejava.example.commons.lang;
//import org.apache.commons.lang.ArrayUtils;
import java.util.List;
import java.util.Scanner;

public class Duplicate{
	
	public static void removeElement(String[] a, int del) {
	    System.arraycopy(a,del+1,a,del,a.length-1-del);
	}
	
	public static void main(String[] args)
	{
				
		System.out.print("Please enter a string \n");
	//	Scanner scan= new Scanner(System.in);
	//	String sentence = scan.nextLine();
		
		String sentence = "Bashir is a good boy and he is a awesome";
		sentence = sentence.trim();
		
		String[] words = sentence.split(" ");
		int duplicate_num = 0;
		for(int i = 0; i < words.length; i++)
		{
			for(int j = i+1; j < words.length; j++)
			{
			//	System.out.println("This is being checked with( " + words[i] +" )here( " + words[j] +" )and times is " + duplicate_num);
				if(words[i].equals(words[j]))
				{
					duplicate_num ++;
					
				}
			}
		}
		System.out.println("So the number of duplicate numbers are " + duplicate_num);
	}
}


