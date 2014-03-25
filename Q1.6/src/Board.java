
class Board{
	
	public Board(int size){ 
		char[][] arr = new char[size][size];
		this.Table = arr;
	}
	
	public void placeSymbol(char symbol){
		int i,j;
		
		for(i = 0; i < Table.length; i++){
			for(j = 0; j < Table.length; j++)
				this.Table[i][j] = symbol;
		}	
	}
	
	public void alternatePlaceSymbol(char symbol1, char symbol2){
		int i,j;
		
		for(i = 0; i < this.Table.length; i++){
			for(j = 0; j < this.Table.length; j++){
				if((i+j)%2!=0){
					this.Table[i][j] = symbol1;		
				}
				else {
					this.Table[i][j] = symbol2;	
				}
			}
		}
	}

	public int getDimension(){ //cool method to tell the dimensions of a table
		return this.Table[0].length;
	}
	
	public void printBoard(){
		int i,j;
		
		for(i = 0; i < this.Table.length; i++){
			for(j = 0; j < this.Table.length; j++){
					System.out.print(this.Table[i][j]);
					System.out.print(" ");
			}		
			System.out.print("\n");
		}
	}
	
	
	public void placeOneSymbol(char symbol, int i, int j){ 
			this.Table[i][j] = symbol;		
	}
	
	private char[][] Table;
}
