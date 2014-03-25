
public class UseBook {
	public static void main(String[] str){
	
		NonFiction nfbook= new NonFiction("Harry Potter");
		Fiction fbook= new Fiction("Potter");

		nfbook.print();
		
		fbook.print();
		
		System.out.printf("Lets set up a new price for non fiction book \n");
		nfbook.setPrice(5.7);
		
		System.out.printf("Lets set up a new price for fiction books \n");
		fbook.setPrice(8.7);
	
		nfbook.print();
		fbook.print();
	}
}