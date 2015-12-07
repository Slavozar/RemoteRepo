import java.util.Scanner;

public class zad19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1=0;
		do{
			System.out.println("Въведете число [10-99]");
		 num1 = sc.nextInt();
		}
		while((  num1<10)||(num1>99)); 
		while(num1!=1)
		{
			if((num1&1)==1){System.out.print(3*num1+1+" ");num1=3*num1+1;}
			else{System.out.print(num1/2+" ");num1=num1/2;}
			
		}
		}

	}


