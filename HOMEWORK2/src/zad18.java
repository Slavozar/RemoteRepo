import java.util.Scanner;

public class zad18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=0,m=0;
		do{
			System.out.println("Въведете n [1-9]");
		 n = sc.nextInt();
			System.out.println("Въведете m [1-9]");
			 m = sc.nextInt();
		 
		}
		while((  n<1)||(n>9)||(  n<1)||(n>9)); 
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				System.out.print(i+"*"+j+"="+i*j);
				System.out.println();
				
			}
		
		}

	}

}

