/**
 * @author Asfandyar Ashraf Malik
 * @homework_number 2
 * @problem_number 3
 * @creation_date 16 Oct. 2013
 * @last_modified 16 Oct. 2013 
 */

/** Creates an array of Books. Some instances of the book are Fiction and some other are NonFiction 
 */

public class BookArray {
	public static void main(String[] str){
		//ignore the stupid names I have give to all of these Books 
		Book[] arr =  new Book[10];
		arr[0]= new Fiction("Socerer Stone");
		arr[1]= new Fiction("Chamber of Secrets");
		arr[2]= new NonFiction("Godzilla");
		arr[3]= new Fiction("Ugly Ducklings");
		arr[4]= new NonFiction("Arsenal");
		arr[5]= new NonFiction("Coco corina");
		arr[6]= new Fiction("Pyar hum se kya karo");
		arr[7]= new NonFiction("Lord of the Rings");
		arr[8]= new NonFiction("Bindas Doctor");
		arr[9]= new Fiction("Beauty and the bean stock");
				
		int i;
		for(i=0; i < 10; i++){
			System.out.println("Title of this movie is " + arr[i].getTitle());
		}
	}
}
