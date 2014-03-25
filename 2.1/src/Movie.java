/*Movie java*/
/**
 * @author Asfandyar Ashraf Malik
 * @homework_number 2
 * @problem_number 1
 * @creation_date 16 Oct. 2013
 * @last_modified 16 Oct. 2013 
 */

/**   Contains the 3 instances */
public class Movie {

	private String title;
	private int year;
	private double score;
	
	public Movie(String ntitle, int nyear, double nscore){
		this.title = ntitle; 
		this.year= nyear;
		this.score= nscore;
	}
	/** empty constructor  */
	public Movie(){
		this.title = ""; 
		this.year= 0;
		this.score= 0;
	}
	
	public void setTitle(String ntitle){
		this.title= ntitle;
	}
	
	public void setYear(int nyear){
		this.year= nyear;
	}
	
	public void setScore(double nscore){
		this.score= nscore;
	}
	
	public String getTitle(){
		return this.title;
	}
	
	public int getYear(){
		return this.year;
	}
	
	public double getScore(){
		return this.score;
	}
	
	public void print(){
	
		System.out.printf("\n Title : %s  Year : %d Score : %f\n ", this.title, this.year, this.score);
/*		System.out.printf("Title is %s\n", this.title);
		System.out.printf("Score is %f\n", this.score);
		System.out.printf("Year is %d\n", this.year);*/
		
		
	}	
}
