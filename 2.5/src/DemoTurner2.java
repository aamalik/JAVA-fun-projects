/**
 * @author Asfandyar Ashraf Malik
 * @homework_number 2
 * @problem_number 5
 * @creation_date 16 Oct. 2013
 * @last_modified 16 Oct. 2013 
 */

/**  A test class to check if everything works as intended. */


public class DemoTurner2 {
	public static void main(String[] str){
		Turner[] turner =  new Turner[5];
		
		turner[0] = new Leaf();
		turner[0].turn();
		
		turner[1] = new Page();
		turner[1].turn();
		
		turner[2] = new Pancake();
		turner[2].turn();

		turner[3] = new Mobile();
		turner[3].turn();
		
		turner[4] = new Car();
		turner[4].turn();
	}

}
