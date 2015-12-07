import java.util.Scanner;

public class zad13 {

	public static void main(String[] args) {

		byte[] binary = new byte[64];
		for (int index = 0; index < binary.length; index++) {
			binary[index] = 2;
		}
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		int ostatuk;
		int index = 0;
		if (num < 0) {
			binary[binary.length - 1] = 1;
		}
		while (num != 0) {
			ostatuk = (int) (num % 2);
			num = num / 2;
			ostatuk = (ostatuk < 0) ? -ostatuk : ostatuk;
			binary[index] = (byte) ostatuk;
			index++;
		}
		if (binary[binary.length - 1] == 1) {
			for (int i = index; i < binary.length - 2; i++) {
				binary[i] = 0;
			}
		}
		for (index = binary.length - 1; index >= 0; index--) {
			if (binary[index] != 2) {
				System.out.print(binary[index]);
			}
		}
	}

}
