import java.util.Scanner;

public class MagicSquare {

	public static void main(String[] args){
		System.out.printf("Enter the 9 numbers you wish to add");
		Scanner scan= new Scanner(System.in);
		int i, j;
		int arr[][];
		arr= new int[3][3];
		
		for(i=0; i<3; i++){
			for(j=0; j<3; j++){
				 arr[i][j]= scan.nextInt();
			}
		}
		System.out.println("Thanks for inputting them!");
		
		for(i=0; i<3; i++){
			for(j=0; j<3; j++){
				 System.out.printf(" %d",arr[i][j]);
			}
			System.out.println(" ");
		}
		
		System.out.printf("Now checking if they end up making a magic square \n");
		
		System.out.printf("Checking for rows \n");
		int sum=0;
		i=0;
		for(i=0; i<3; i++){
			for(j=0; j<3;j++){
				sum=sum+arr[i][j];
			}
			 if(sum!=15){
				 sum=0;
			 }
			 else {
				 sum=1;
			 }
		}
		
		System.out.printf("Checking for colums \n");
		int sum1=0;
		i=0;
		for(j=0; j<3; j++){
			for(i=0; i<3;i++){
				sum1=sum1+arr[i][j];
			}
			 if(sum1!=15){
				 sum1=0;
			 }
			 else {
				 sum1=1;
			 }
		}
		
		System.out.printf("Checking for elements in diagonall \n");
		int sum2=0;
		int x = 0;
		i=0;
		for(j=0, i=0; j<3; j++, i++){
			x=x+arr[i][j];
			
			if(x!=15){
				 sum2=0;
			 }
			 else {
				 sum2=1;
			 }
		}
		
		System.out.println("Checking if all the elements are distinct");
		int c, d, num3 = 0;
		int e=0, f=0;
		
		while(e<3){
			while(f<3){
				for(c=0; c<3; c++){
					for(d=0; d<3; d++){
					 if(arr[e][f]== arr[c][d]){
						num3=0;
					 }
					 else {
						num3=1;
					 }
					}
				}
			 f++;
			}
		 e++;
		}	
		
		System.out.print(sum);
		System.out.print(sum1);
		System.out.print(sum2);
		System.out.print(num3);
		
		System.out.printf("Checking if a magic number \n");
		int sum0= sum1+sum2+sum+num3;
		if(sum0==4){
			System.out.printf("Oh baby, its a magic square");
		}
		else{
			System.out.printf("Nope its not");
		}
		
	}
}
