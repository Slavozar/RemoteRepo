import java.util.Scanner;

public class zad2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = 0;
		int cols = 0;
		do {
			System.out.println("Въведете брой редове и колони");
			rows = sc.nextInt();
		
		} while ((rows <= 0));
		cols=rows;
		int[][] a = new int[rows][cols];
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[0].length; col++) {
				do {
					a[row][col] = sc.nextInt();
				} while (a[row][col] < 0);
			}
		}
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[0].length; col++) {
				if (row == col) {
					System.out.print(a[row][col] + " ");
				}
			}
		}
		System.out.println();
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[0].length; col++) {
				if ((row + col) == (a.length-1)) {
					System.out.print(a[row][col] + " ");
				}
			}
		}
	}
}
