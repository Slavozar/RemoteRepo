import java.util.Scanner;

public class zad10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean flag=true;
		for(int i=2;i<(n/2+1);i++)
		{
			if(n%i==0){flag=false; break;}
		}
		if(flag){System.out.println("Числото е просто");}
		else {System.out.println("Числото не е просто");}
		

	}

}
