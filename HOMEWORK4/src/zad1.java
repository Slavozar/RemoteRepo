
public class zad1 {

	public static void main(String[] args) {
	int[][] array={{1,2,3,4,5},
							{-1211,2,3,4,5},
							{1,2,3,4,5},
							{1,2,3,4,16515},
							{1,2,3,4,5},
							{1,2,3,4,5},
							};
	int max=Integer.MIN_VALUE;
	int min=Integer.MAX_VALUE;
	for(int row=0;row<array.length;row++){
		for(int col=0;col<array[0].length;col++){
			if(array[row][col]>max){
				max=array[row][col];
			}	
			if(array[row][col]<min){
				min=array[row][col];
			}
			
		}
	}
	System.out.println("Maximal value is: "+max);
	System.out.println("Minimal  value is: "+min);
	

	}

}
