import java.util.Scanner;

public class zad15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int brEl = 0;
		do {
			System.out.println("Въведете брой елементи на масивa: ");
			brEl = sc.nextInt();
		} while (brEl <= 0);
		double[] a = new double[brEl];
		for (int index = 0; index < a.length; index++) {
			a[index] = sc.nextDouble();
		}
		double[] b=new double[brEl];
		for (int index = 0; index < b.length; index++) {
		b[index]=(a[index]<0)? -a[index]:a[index];
		}
		double max1=Double.MIN_VALUE,max2=Double.MIN_VALUE,max3=Double.MIN_VALUE;
		int indexMax1=0,indexMax2=0,indexMax3=0;
		for(int index=0;index<b.length;index++){
			if(b[index]>max1){
				max1=b[index];
				indexMax1=index;
			}
		}	
		for(int index=0;index<b.length;index++){
			if(b[index]==max1){
				continue;
			}
			if(b[index]>max2){
				max2=b[index];
				indexMax2=index;
			}
		}
		for(int index=0;index<b.length;index++){
			if((b[index]==max1)||(b[index]==max2)){
				continue;
			}
			if(b[index]>max3){
				max3=b[index];
				indexMax3=index;
			}
		}
		System.out.println(a[indexMax1]+"   "+a[indexMax2]+"   "+a[indexMax3]);
		
		

	}

}
