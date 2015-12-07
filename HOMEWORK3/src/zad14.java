
public class zad14 {

	public static void main(String[] args) {
	double[] a={1,4.52,5,6,4,7,0.99,6,1,7,2.99,-2.99};
	double[] newA=new double[a.length];
	int j=0;
	for(int i=0;i<a.length;i++){
	
		if((a[i]>=-2.99)&&(a[i]<=2.99)){
			newA[j]=a[i];
			j++;
		}
	}
	for(int i=0;i<j;i++){
		System.out.print(newA[i]+";  ");
	}
	}

}
