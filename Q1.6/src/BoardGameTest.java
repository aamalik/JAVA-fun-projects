import java.util.Scanner;

public class BoardGameTest {
	public static void main(String[] args){

		Scanner in = new Scanner (System.in);
		Board B1, B2;
		int i,j; 
		B1 = new Board(4); //new board initialized
		B2 = new Board(4);	
		
		System.out.printf("Places all elements in the matrix with this symbol");
		B1.placeSymbol('A');
		B1.printBoard();
		
		System.out.printf("Alternates between elements in the matrix with this number \n");
		B2.alternatePlaceSymbol('K','F');
		B2.printBoard();
		
		System.out.println("Which symbol do you want to place:");
		String str =  in.nextLine(); 
        //convert a string into character. Method valid because string consists of one char only
		char newsymbol = str.charAt(0); 
		
		System.out.println("Enter rows and colum where you want the element to be");
		i = in.nextInt();
		j = in.nextInt();
		
		while(i < 0 || j < 0 || i > B1.getDimension() || j > B1.getDimension()){
			System.out.println("Out of bounds");
			System.out.println("Input row and columns again please !");
			i = in.nextInt();
			j = in.nextInt();	
		}
		
		B1.placeOneSymbol(newsymbol, i, j);					
		B1.printBoard();
	}

}
