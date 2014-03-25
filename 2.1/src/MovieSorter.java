
/**
 * @author Asfandyar Ashraf Malik
 * @homework_number 2
 * @problem_number 1
 * @creation_date 16 Oct. 2013
 * @last_modified 16 Oct. 2013 
 */

/** Here all the sorting algorithms by different ways are defined */

import java.util.Arrays;
import java.util.Comparator;

public class MovieSorter extends MovieServices{
	
	Comparator<Movie> comparator_year = new Comparator<Movie>() {
	        @Override
	        public int compare(Movie first, Movie second) {
	            return Integer.compare(first.getYear(), second.getYear());
	        }
	};
	
	void sortByYear(Movie[] a){
		Arrays.sort(a, comparator_year);
	}
//*********************************************************************
	
/** comparator by score implemented here */
	
	Comparator<Movie> comparator_score = new Comparator<Movie>() {
        @Override
        public int compare(Movie first, Movie second) {
            return Double.compare(first.getScore(), second.getScore());
        }
    };

    void sortByScore(Movie[] a){
    	Arrays.sort(a, comparator_score);
    }
	
  //*********************************************************************

/** comparator by title implemented here */
    
  	Comparator<Movie> comparator_title = new Comparator<Movie>() {
          
          public int compare(Movie first, Movie second) {
              return (first.getTitle()).compareTo(second.getTitle());
          }
      };

      void sortByTitle(Movie[] a){
      	Arrays.sort(a, comparator_title);
      }	
}
