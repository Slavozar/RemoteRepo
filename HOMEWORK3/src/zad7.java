import java.util.Scanner;

public class zad7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int brEl=0;
		do{
		System.out.println("Въведете брой елементи: ");
		brEl=sc.nextInt();
		}
		while(brEl<=0);
		int[] a=new int [brEl];
		for (int i =0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		int[] b=new int[brEl];
		b[0]=a[0];
		b[a.length-1]=a[a.length-1];
		for(int i=1;i<a.length-1;i++)
		{
			b[i]=a[i-1]+a[i+1];
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}

}
