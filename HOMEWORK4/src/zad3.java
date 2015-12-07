
public class zad3 {

	public static void main(String[] args) {
		int[][] array={{1,2,3,4,5},
				{1,2,3,4,5},
				{1,2,3,4,5},
				{1,2,3,4,5},
				{1,2,3,4,5},
				{1,2,3,4,5},
				};
		int sum=0;
		double avg=0;
		for(int row=0;row<array.length;row++){
			for(int col=0;col<array[0].length;col++){
				sum+=array[row][col];
				
			}
		}
		avg=sum/((array.length)*(array[0].length));
		System.out.println("Sum is : "+sum);
		System.out.println("Average is : "+avg);
		
		

	}

}
