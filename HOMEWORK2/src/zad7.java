import java.util.Scanner;

public class zad7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=3,j=0;j<n;i++){
			if(i%3==0){System.out.print(i+",");j++;}
		}
		
	}

}
