import java.util.Scanner;

public class zad14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=0;
		do{
			System.out.println("Въведете число [10-200]");
		 num = sc.nextInt();
		}
		while((  num<10)||(num>200)); 
		
	for(int i=num;i>0;i--)
	{
		if(i%7==0){System.out.println(i);}
	}
	}

}
