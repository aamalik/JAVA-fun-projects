import java.io.FileNotFoundException;
import java.io.IOError;

public class GoTooFar {

	public static void main(String[] args){
		int subscript = 0;
		int[] arr1 = {7,8,9,6,5};
		
		try{
			for(int i = 0; i<arr1.length; i++){
				System.out.println(arr1[i] + " ");
				subscript ++ ;
			}
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Now you have gone too far ");
		}
	
	}
}	
