import java.util.LinkedList;


public class Polynomial {
	

	private LinkedList<Term < Integer, Integer> > list;
	
	public Polynomial(LinkedList<Term<Integer, Integer>> arr){
		
		this.list = arr;
	}
	
	public void addPolynomial(Polynomial p1){
		
		for(Term<Integer,Integer> term : p1.getTerms()){
			boolean exist = false;
			for(Term<Integer,Integer> terms : list){
				if(term.getSecond() == terms.getSecond()){
					terms.setFirst(term.getFirst() + terms.getFirst());
					exist = true;
					break;
				}
			}
			if(!exist){
				list.add(term);
			}
		}
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void multiplyPolynomial(Polynomial p){
		int count = p.getTerms().size();
		int counter = 0;
		
		Polynomial [] arr = new Polynomial[count];
		
		
		for(Term <Integer , Integer> term : p.getTerms()){
			LinkedList <Term <Integer , Integer> > temp = new LinkedList();

			for(Term <Integer , Integer> local : list){
				temp.add(new Term<Integer , Integer> (local.getFirst() * term.getFirst() , local.getSecond() + term.getSecond()));
			}
			
			arr[counter] = new Polynomial(temp);
			counter++;
		}
		
		list.clear();
		
		for(Polynomial poly : arr){
			addPolynomial(poly);
		}
	}
	
	public void printDerivative(){
		for(Term<Integer , Integer> term : list){
			int second = term.getSecond();
			if(second == 0){
				continue;
			}
			int first = second * term.getFirst();
			second = second - 1;
			
			System.out.println(first + "*x^" + second);
		}
	}
	
	public LinkedList< Term <Integer , Integer> > getTerms(){
		return list;
	}
	
	public void print(){
		for(Term<Integer, Integer> term : list ){
			System.out.println(term.getFirst()+ "*x^" + term.getSecond());
		}
	}
	
}
