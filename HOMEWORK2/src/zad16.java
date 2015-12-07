import java.util.Scanner;

public class zad16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=0,m=0;
		do{
			System.out.println("Въведете n [10-5555]");
		 n = sc.nextInt();
			System.out.println("Въведете m [10-5555]");
			 m = sc.nextInt();
		 
		}
		while((  n<10)||(n>5555)||(  n<10)||(n>5555)); 
		if (n<m){
			for(int i=m;i>=n;i--)
			{
				if(i%50==0){System.out.println(i);}
				
			}
		}
		else{
			if(n==m){System.out.println("Въведените числа са равни");}
			else{
				for(int i=n;i>=m;i--)
				{
					if(i%50==0){System.out.println(i);}
					
				}
				
			}
		}
	}

}
