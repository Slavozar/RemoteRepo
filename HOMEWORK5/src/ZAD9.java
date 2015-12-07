import java.util.Scanner;

public class ZAD9 {
	static boolean isNegative(String a, String vStringB) {
		int index = vStringB.indexOf(a);
	/*if(index ==0){
			return false;
		}*/
		if (vStringB.charAt(index - 1) == '-') {
			return true;
		}
		return false;
	}

	static int stringToInt(String a, boolean negative) {
		int num = 0;
		char[] array = a.toCharArray();
		for (int i = 0; i < array.length; i++) {
			num = num * 10 + ((int) array[i] - 48);
		}
		num = (negative) ? -num : num;
		return num;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] razdeleni = str.split("[^0-9]");
		int sum = 0;
		for (int i = 0; i < razdeleni.length; i++) {
			if (!(razdeleni[i].equals(""))) {
				if (isNegative(razdeleni[i], str)) {
					System.out.println("-" + razdeleni[i]);
				} else {
					System.out.println(razdeleni[i]);
				}
				sum += stringToInt(razdeleni[i], isNegative(razdeleni[i], str));
			}
		}
		System.out.println("Sum is: " + sum);
	}
}
