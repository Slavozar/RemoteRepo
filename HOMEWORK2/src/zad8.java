import java.util.Scanner;

public class zad8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	
			int j = n - 1, br = 0;
			do {

				for (int k = 1; k <= n; k++) {
					System.out.print(j);
					
					
				}
				j = j + 2;
				br++;
				System.out.println();
			} while (br < n);
		}
	}
