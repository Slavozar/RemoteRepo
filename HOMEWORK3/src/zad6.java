import java.util.Scanner;

public class zad6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int brEl1 = 0;
		do {
			System.out.println("�������� ���� �������� �� ����� 1: ");
			brEl1 = sc.nextInt();
		} while (brEl1 <= 0);
		int[] a = new int[brEl1];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();

		}
		int brEl2 = 0;
		do {
			System.out.println("�������� ���� �������� �� ����� 2: ");
			brEl2 = sc.nextInt();
		} while (brEl2 <= 0);
		int[] b = new int[brEl2];
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();

		}
		boolean isEq = true;
		if (a.length == b.length) {
			System.out.println("�������� �� � ������� �������");

			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i]) {
					isEq = false;
					break;
				}
			}

		} else {
			isEq = false;
		}

		if (isEq == true) {
			System.out.println("�������� �� ������");
		} else {
			System.out.println("�������� �� �� �������");
		}
	}

}
