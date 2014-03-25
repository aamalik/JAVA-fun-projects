/**
 * @author Asfandyar Ashraf Malik
 * @homework_number 3
 * @problem_number 1 */

import java.io.*;

public class Frequency {
	public static void main(String[] args) throws IOException {
		
	    File in = new File("inputFile.txt");
	    FileReader file_reader1 = new FileReader(in);
	    int[] count = new int[26];
	    
	    int ch = file_reader1.read();
	    int Ncharacters = 1;
	    
	    while(ch!=-1){
	    	ch = file_reader1.read();
	    	Ncharacters++;
	    }
	    
	    char[] charArray = new char[Ncharacters];
	    FileReader file_reader2 = new FileReader(in);
	    int cha = file_reader2.read();
	    int i = 0;
	    
	    while(cha!=-1){
	    	if(Character.isLetter(((char)cha)) ){
		    	charArray[i] = Character.toLowerCase(((char)cha));
		    	cha = file_reader2.read();
		    	++i;
	    	}
	    	else cha = file_reader2.read();
	    }

	    for(int k=0; k<charArray.length; k++){
	    	
	    	switch(charArray[k] ){
	    	case 'a':
	    		count[0]= count[0] + 1;
	    		break;
	    	case 'b':
	    		count[1] = count[1] + 1;
	    		break;
	    	case 'c':
	    		count[2] = count[2] + 1;
	    		break;
	    	case 'd':
	    		count[3] = count[3] + 1;
	    		break;
	    	case 'e':
	    		count[4] = count[4] + 1;
	    		break;
	    	case 'f':
	    		count[5] = count[5] + 1;
	    		break;
	    	case 'g':
	    		count[6] = count[6] + 1;
	    		break;
	    	case 'h':
	    		count[7] = count[7] + 1;
	    		break;
	    	case 'i':
	    		count[8] = count[8] + 1;
	    		break;
	    	case 'j':
	    		count[9] = count[9] + 1;
	    		break;
	    	case 'k':
	    		count[10] = count[10] + 1;
	    		break;
	    	case 'l':
	    		count[11] = count[11] + 1;
	    		break;
	    	case 'm':
	    		count[12] = count[12] + 1;
	    		break;
	    	case 'n':
	    		count[13] = count[13] + 1;
	    		break;
	    	case 'o':
	    		count[14] = count[14] + 1;
	    		break;
	    	case 'p':
	    		count[15] = count[15] + 1;
	    		break;
	    	case 'q':
	    		count[16]= count[16] + 1;
	    		break;
	    	case 'r':
	    		count[17]= count[17] + 1;
	    		break;
	    	case 's':
	    		count[18]= count[18] + 1;
	    		break;
	    	case 't':
	    		count[19]= count[19] + 1;
	    		break;
	    	case 'u':
	    		count[20]= count[20] + 1;
	    		break;
	    	case 'v':
	    		count[21]= count[21] + 1;
	    		break;
	    	case 'w':
	    		count[22]= count[22] + 1;
	    		break;
	    	case 'x':
	    		count[23]= count[23] + 1;
	    		break;
	    	case 'y':
	    		count[24]= count[24] + 1;
	    		break;
	    	case 'z':
	    		count[25]= count[25] + 1;
	    		break;
	    	}
	    }
	    
	    char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
	    
	    System.out.println("Letters and their frequencies are as follows:");
	    
	    for(int k=0; k<26; k++){
	    	System.out.println(letters[k] + ":" + count[k]);
	    }
	    file_reader1.close();
	    file_reader2.close();
	}
}
