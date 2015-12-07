import java.util.Scanner;

public class zad9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int brEl1 = 0;
		do {
			System.out.println("Въведете брой елементи на масив: ");
			brEl1 = sc.nextInt();
		} while (brEl1 <= 0);
		int[] a = new int[brEl1];
		for (int index = 0; index < a.length; index++) {
			a[index] = sc.nextInt();

		}
		int swap = 0;
		for (int index = 0; index < a.length / 2; index++) {
			swap = a[index];
			a[index] = a[a.length - 1 - index];
			a[a.length - 1 - index] = swap;
		}
		for (int index = 0; index < a.length; index++) {
			System.out.print(a[index] + " ");

		}

	}

}
