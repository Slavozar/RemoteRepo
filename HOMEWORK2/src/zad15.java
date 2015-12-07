import java.util.Scanner;

public class zad15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num=0;
		
		System.out.println("Въведете число");
		num = sc.nextInt();
	
		
		int sum = 0;
		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				sum += i;

			}
		} else {
			for (int i = num; i <= 1; i++) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
