import java.util.Scanner;

public class zad1 {

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
	int min=a[0];
	for (int i =0;i<a.length;i++)
	{
		if(a[i]<min){min=a[i];}
		
	}
	System.out.println("Най-малкият елемент от масива е:  "+min);

	}

	
}
