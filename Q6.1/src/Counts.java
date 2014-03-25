/**
 * @author Asfandyar Ashraf Malik
 * @quiz_number 6
 * @problem_number 1
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.lang.Runnable;
import java.lang.Thread;

public class Counts {
	public static void main(String[] args)throws FileNotFoundException{
		
			
		for(int i=0; i<args.length; i++){
			String filename = args[i];
			Runnable run = new runnable(filename);
			Thread thread1 = new Thread(run);
			thread1.start();
			
		}
	}	
}


