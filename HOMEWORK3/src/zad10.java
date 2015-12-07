import java.util.Scanner;

public class zad10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] a = new double[7];
		double avg = 0;
		for (int index = 0; index < a.length; index++) {
			a[index] = sc.nextInt();
			avg += a[index];
		}
		avg = avg / 7;
		

		System.out.println("Средната стойност е " +avg);
		double[] b=new double[7];
		for (int index = 0; index < a.length; index++) {
			b[index] = a[index] - avg;
			b[index]= (b[index]<0)? -b[index]: b[index];
		}
		double min=b[0];
		int nr=0;
	for(int index=1;index<a.length;index++){
		if(b[index]<min){
			min=b[index];
			nr=index;
		}
	}
	
	
	System.out.println("Най-близкото число до ср. стойност е :"+a[nr]);

	}

}
