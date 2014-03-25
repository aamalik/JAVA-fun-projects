/**
 * @author Asfandyar Ashraf Malik
 * @quiz_number 6
 * @problem_number 3
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.lang.Runnable;
import java.lang.Thread;

public class Find {
	public static void main(String[] args)throws FileNotFoundException{
		
			
		for(int i=1; i<args.length; i++){
			String filename = args[i];
			Runnable run = new runnable(filename, args[0]);
			Thread thread1 = new Thread(run);
			thread1.start();	
		}
	}	
}


