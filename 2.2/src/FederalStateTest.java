/**
 * @author Asfandyar Ashraf Malik
 * @homework_number 2
 * @problem_number 1
 * @creation_date 16 Oct. 2013
 * @last_modified 16 Oct. 2013 
 */

/** Here we test the FederalState create instances of all the 16 states that we have decided to create
 *  Print methods is present in FederalState which prints the information about the states
 */

public class FederalStateTest {

		public static void main(String[] str){
				
				 FederalState instance = FederalState.getInstance("Baden-Wurttemberg");
				 instance.print();
				 
				 FederalState instance1 = FederalState.getInstance("Bavaria");
				 instance1.print();
				 
				 FederalState instance2 = FederalState.getInstance("Berlin");
				 instance2.print();
				 
				 FederalState instance3 = FederalState.getInstance("Brandenburg");
				 instance3.print();
				 
				 FederalState instance4 = FederalState.getInstance("Bremen");
				 instance4.print();
				 
				 FederalState instance5 = FederalState.getInstance("Hamburg");
				 instance5.print();
				 
				 FederalState instance6 = FederalState.getInstance("Hesse");
				 instance6.print();
				 
				 FederalState instance7 = FederalState.getInstance("Lower Saxony");
				 instance7.print();
				 
				 FederalState instance8 = FederalState.getInstance("Mecklenburg-West Pomerania");
				 instance8.print();
				 
				 FederalState instance9 = FederalState.getInstance("North Rhine-Westphalia");
				 instance9.print();
				 
				 FederalState instance10 = FederalState.getInstance("Rhineland-Palatinate");
				 instance10.print();
				 
				 FederalState instance11 = FederalState.getInstance("Saarland");
				 instance11.print();
				 
				 FederalState instance12 = FederalState.getInstance("Saxony");
				 instance12.print();
				 
				 FederalState instance13 = FederalState.getInstance("Saxony-Anhalt");
				 instance13.print();
				 
				 FederalState instance14 = FederalState.getInstance("Schleswig-Holstein");
				 instance14.print();
				 
				 FederalState instance15 = FederalState.getInstance("Thuringia");
				 instance15.print();
		}
}
