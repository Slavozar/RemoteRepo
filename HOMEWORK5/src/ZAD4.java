import java.util.Scanner;

public class ZAD4 {

	public static void main(String[] args) {							
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] razdeleni = str.split(",");
		int sum1 = 0, sum2 = 0;
		for (int i = 0; i < razdeleni.length; i++) {
			System.out.println(razdeleni[i]);
		}
		for (int i = 0; i < razdeleni[0].length(); i++) {
			sum1 += (int) razdeleni[0].charAt(i);

		}
		// System.out.println(sum1);
		for (int i = 0; i < razdeleni[1].length(); i++) {
			sum2 += (int) razdeleni[1].charAt(i);

		}
		// System.out.println(sum2);
		if (sum1 > sum2) {
			System.out.println(razdeleni[0]);
		} else {
			System.out.println(razdeleni[1]);
		}

	}

}
