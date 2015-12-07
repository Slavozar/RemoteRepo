import java.util.Scanner;

public class zad18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int brEl1 = 0;
		do {
			System.out.println("Въведете брой елементи на масив 1: ");
			brEl1 = sc.nextInt();
		} while (brEl1 <= 0);
		int[] a = new int[brEl1];
		for (int index = 0; index < a.length; index++) {
			a[index] = sc.nextInt();}
			int brEl = 0;
		
			do {
				System.out.println("Въведете брой елементи на масив: 2 ");
				brEl = sc.nextInt();
			} while (brEl <= 0);
			int[] b = new int[brEl];
			for (int index1 = 0; index1 < b.length; index1++) {
				b[index1] = sc.nextInt();
			}
			int maxBr=(brEl>brEl1)? brEl:brEl1;
			int minBr=(brEl<brEl1)? brEl:brEl1;
			int[] c=new int[maxBr];	
			int index;
			for(index=0;index<minBr;index++){
				c[index]=(a[index]>b[index])? a[index]:b[index];
			}
			if(maxBr!=minBr){
				if(a.length>b.length){
					for(index=index;index<maxBr;index++){
						c[index]=a[index];
					}
				}
				else{
					for(index=index;index<maxBr;index++){
						c[index]=b[index];
					}
				}
			}
			System.out.println("Масив 1:");
			for(int i=0;i<a.length;i++){
				System.out.print(a[i]+" ");
			}
			System.out.println();
			System.out.println("Масив 2:");
			for(int i=0;i<b.length;i++){
				System.out.print(b[i]+" ");
			}
			System.out.println();
			System.out.println("Резултатен масив:");
			for(int i=0;i<maxBr;i++){
				System.out.print(c[i]+" ");
			
		}
	}

}
