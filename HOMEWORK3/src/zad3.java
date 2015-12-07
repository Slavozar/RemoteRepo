import java.util.Scanner;

public class zad3 {

	public static void main(String[] args) {
	int[] a=new int[10];
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	for(int i=0;i<2;i++)
	{
		a[i]=num;
		
	}
	for(int i=2;i<a.length;i++)
	{
		a[i]=(a[i-1]+a[i-2]);
	}
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
	
	}

}
