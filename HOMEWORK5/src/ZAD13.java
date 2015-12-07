
public class ZAD13 {
	static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	static int[] zalepi(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		for (int i = 0; i < c.length; i++) {
			if (i < a.length) {
				c[i] = a[i];
			} else {
				c[i] = b[i - a.length];
			}
		}
		return c;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		int[] b = { 0, 0, 7 };
		print(zalepi(a, b));

	}

}
