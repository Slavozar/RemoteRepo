import java.util.Scanner;

public class zad17 {

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
		boolean flag = true;
		for (int index = 1; index < a.length - 1; index += 2) {
			if ((a[index] < a[index - 1]) || (a[index] < a[index + 1])) {
				flag = false;
				break;
			}
		}
		if ((brEl1 % 2 == 0) && (a[a.length - 1] < a[a.length - 2])) {
			flag = false;
		}
		if (flag) {
			System.out.println("Редицата е зигзагообразна нагоре");
		} else {
			System.out.println("Редицата не е зигзагообразна нагоре");
		}

	}

}
