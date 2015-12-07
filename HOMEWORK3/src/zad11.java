import java.util.Scanner;

public class zad11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[7];
	
		for (int index = 0; index < a.length; index++) {
			a[index] = sc.nextInt();
		
		}int br=0;
		for(int index=0;index<a.length;index++){
			if((a[index]%5==0)&&(a[index]>5)){
				System.out.print(a[index]+" ");
				br++;
			}
		}
		System.out.print( " - "+br+" числа");
		

	}

}
