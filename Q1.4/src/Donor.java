
public class Donor {

		private String name;
		private String rating;
		
		public Donor(){
			this.name= "";
			this. rating= "";
		}
		
		public Donor(String nname, String nrating){
			this.name= nname;
			this. rating= nrating;
		}
		
		public void setName(String nname){
			this.name= nname;
		}
		public void setRatings(String nrating){
			this.rating= nrating;
		}
		public String getName(){
			return this.name;
		}
		public String getRatings(){
			return this.rating;
		}

}
