
class Cookies{
		
	private int idNumber[];
	private int boxesSold[];
	
	public Cookies(){ 
		int array1[] = new int[10];
		int array2[] = new int[10];
		
		this.idNumber = array1;
		this.boxesSold = array2;
	
		for(int i = 0; i < 10; i++){
			this.idNumber[i] = 0;
			this.boxesSold[i] = 0; 
		}
	}
	
	public void addEntry(int nidNumber, int nboxes){ 		
		int i, j;

		j = 0; 
		for(i = 0; i < 9; i++)
			if(this.idNumber[i] == nidNumber){
				j = 1;
				break;
			}
		
		if(j == 0){
			i = 0;
			while(this.idNumber[i] != 0){
				i++;
			}	
			this.idNumber[i] = nidNumber;
			this.boxesSold[i] = nboxes;	
		}
		else{
			for(i = 0; i < 10; i++){
				if(this.idNumber[i] == nidNumber)
					this.boxesSold[i] =this.boxesSold[i]+ nboxes;
			}
		}
	}
	
	public int winner(){
		int win=0, max=0,i;
		
		for(i = 0; i < 10; i++)
			if(this.boxesSold[i] >= max){
				max = this.boxesSold[i];
				win= this.idNumber[i]; 
			}
		return win;
	}
	
	public void printTracking(){
		int i;
		for(i = 0; i < 10; i++)
			System.out.println(this.idNumber[i]+ " " + this.boxesSold[i]);
	}
	
}