
public class zad8 {

	public static void main(String[] args) {
		int[] a = { 1, 1, 16, 6, 6, 6, -1,-1,-1,-1,-1,-1,-1,-1,4, 8, 4, 21, 0,0,0,0,0,0,8 };
		int maxLength = 0;
		int br = 1;
		int element=a[0];
		for (int index = 1; index < a.length; index++) {
			if ((a[index] == a[index - 1])) {
				br++;
				if(maxLength<br){maxLength = br;
				element=a[index];}
				
			} else {
				br = 1;
			}
		}
		System.out.println(maxLength+" пъти "+element);

	}

}
