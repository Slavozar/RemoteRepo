import java.util.Scanner;

public class zad5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a < b) {
			for (int i = a; i <= b; i++) {
				System.out.println(i);
			}
		} else {
			if (a == b) {
				System.out.println("������� �� �����");
			} else {
				for (int i = b; i <= a; i++) {

					System.out.println(i);

				}
			}
		}
	}
}
