import java.util.Scanner;

public class zad9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum=0;
		if(a<b){
			for(int i=a;i<=b;i++)
			{
				if(i%3==0){System.out.print("skip3,");continue;}
				else{System.out.print(i*i+","); sum+=(i*i);}
				if(sum>200) {break;}
			}
		}
		else {if(a>b)
			{
			for(int i=a;i>=b;i--)
			{
				if(i%3==0){System.out.print("skip3,");continue;}
				else{System.out.print(i*i+",");sum+=(i*i);}
				if(sum>200) {break;}
			}
			}
		else {System.out.println("Числата са равни");}
		}
	}

}
