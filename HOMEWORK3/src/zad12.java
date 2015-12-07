import java.util.Scanner;

public class zad12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[7];
		int swap=0;
	
		for (int index = 0; index < a.length; index++) {
			a[index] = sc.nextInt();
		
		}
		swap=a[0];
		a[0]=a[1];
		a[1]=swap;
		a[3]=a[3]+a[2];
		a[2]=a[3]-a[2];
		a[3]=a[3]-a[2];
		a[5]=a[5]*a[4];
		a[4]=a[5]/a[4];
		a[5]=a[5]/a[4];
		for (int index = 0; index < a.length; index++) {
		System.out.print(a[index]+" ");
		
		}
		

	}

}
