
public class ZAD12 {
	static void print(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
	static int[] createArray(int n){
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=i+1;
		}
		return a;
	}

	public static void main(String[] args) {
		print(createArray(6));
		

	}

}
