import java.util.Scanner;

public class zad13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		do{
			System.out.println("Въведете число [2-27]");
		 sum = sc.nextInt();
		}
		while((  sum<2)||(sum>27)); 
		
		for(int i=100;i<1000;i++)
		{
			int d1=0,d2=0,d3=0;
			int num=i;
			d3=num%10;
			num=num/10;
			d2=num%10;
			d1=num/10;
			if((d1+d2+d3)==sum){System.out.println(i);}
			
			
			
		}
	}

}
