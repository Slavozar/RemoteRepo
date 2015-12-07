import java.util.Scanner;

public class zad11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int row=1;row<=n;row++)
		{
		
		System.out.println();
			for(int col=1; col<=(2*n-1);col++)
			{
				if(col<=n-row){System.out.print(" ");}
				else {
					if((col>n-row)&&(col<n+row)){System.out.print("*");}
					
				}
	}

	}}}
