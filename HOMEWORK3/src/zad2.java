import java.util.Scanner;

public class zad2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int brEl = 0;
		do {
			System.out.println("Въведете брой елементи: ");
			brEl = sc.nextInt();
		} while (brEl <= 0);
		int[] a = new int[brEl];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
}
		int[] b = new int[a.length];
		for (int j = 0; j < a.length; j++) {
			int i = j;
			b[j] = a[i];
			if (j == a.length / 2) {
				for (i = (a.length / 2) - 1; j < a.length; i--)
 {
					b[j] = a[i];
					j++;
				}
			}
		}
		for (int index = 0; index < b.length; index++) {
			System.out.print(b[index] + " ");
		}
	}
}
				
		
