/**
 * @author Asfandyar Ashraf Malik
 * @homework_number 2
 * @problem_number 5
 * @creation_date 16 Oct. 2013
 * @last_modified 16 Oct. 2013 
 */

/**  A test class to check if everything works as intended. */


public class DemoTurners {
	public static void main(String[] str){
		Turner[] turner= new Turner[3];
		
		turner[0] = new Leaf();
		turner[0].turn();
		
		turner[1] = new Page();
		turner[1].turn();
		
		turner[2] = new Pancake();
		turner[2].turn();
		
	}
}
