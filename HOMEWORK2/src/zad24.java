import java.util.Scanner;

public class zad24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1=0;
		do{
			System.out.println("Въведете число [10-30 000]");
		 num1 = sc.nextInt();
		}
		while((  num1<10)||(num1>30_000)); 
		

	}

}
