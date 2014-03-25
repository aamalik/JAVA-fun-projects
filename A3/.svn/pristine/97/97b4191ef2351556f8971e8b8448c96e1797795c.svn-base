import java.util.LinkedList;

public class MainClass {

	public static void main(String args[]){
		LinkedList<Term<Integer , Integer>> list = new LinkedList<>();
		
		list.add(new Term<Integer ,Integer>(2,2));
		list.add(new Term<Integer ,Integer>(1,1));
		list.add(new Term<Integer ,Integer>(5,0));
		
		Polynomial p = new Polynomial(list);
		LinkedList<Term<Integer , Integer>> listq = new LinkedList<>();
		
		listq.add(new Term<Integer ,Integer>(2,2));
		listq.add(new Term<Integer ,Integer>(2,0));
		listq.add(new Term<Integer ,Integer>(5,25));
		
		p.multiplyPolynomial(new Polynomial(listq));
		p.print();		
	}
}
