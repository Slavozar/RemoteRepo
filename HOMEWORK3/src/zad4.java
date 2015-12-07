import java.util.Scanner;

public class zad4 {

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
		boolean isMirror=true;
		for(int i=0;i<a.length/2;i++)
		{
			if(a[i]!=a[a.length-1-i]){isMirror=false;break;}
		}
		if(isMirror){System.out.println("Масивът е огледален");}
		else {System.out.println("Масивът не е огледален");}
	}

}
