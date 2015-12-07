import java.util.Scanner;

public class ZAD2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		int maxLength;
		String swap = new String(str1);
		String nachalo1 = str1.substring(0, 5);
		String nachalo2 = str2.substring(0, 5);
		str1 = str1.replace(nachalo1, nachalo2);
		System.out.println(str1);
		str2 = str2.replace(nachalo2, nachalo1);
		System.out.println(str2);
		maxLength = (str1.length() > str2.length()) ? str1.length() : str2.length();
		System.out.println("Максималната дължина е: "+maxLength);

	}

}
