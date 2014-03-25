
public class Term <S,T> {
		 
		 public S first;
		 public T second;

		 public Term(S first, T second) {
		    super();
		    this.first = first;
		    this.second = second;
		 }

		 public S getFirst() {
		    return first;
		 }

		 public T getSecond() {
		    return second;
		 }

		 public void setFirst(S first) {
		    this.first = first;
		 }

		 public void setSecond(T second) {
		    this.second = second;
		 }
}
