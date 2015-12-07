import java.util.Arrays;
import java.util.Scanner;

public class ZAD9_ver2 {
	static int[] extractNumbers(String a){
		int[] array=new  int[(a.length()/2)+1]; 					//Максималния брой числа в стринг е (бр. на елементите в стринга
		int index=0;																// делено на 2) +1
		boolean nextNegative=false;
		for(int i=0;i<a.length();i++){
			
			if(((a.charAt(i)>='0')&&(a.charAt(i)<='9'))){             			//Ако е от 0 до 9 го трупа в масива
				array[index]=(array[index]*10+(a.charAt(i)-'0'));
				continue;
			}else{																								//Ако е "- " предстои отрицателно число
				if(a.charAt(i)=='-'){
				nextNegative=true;
				
				}else{																										//Ако е буква=> проверява дали натрупаното 
																																//число трябва да е отрицателно
			array[index]=(nextNegative)?-array[index]:array[index];
			nextNegative=false;
				}
			}
			if(array[index]!=0){index++;}												//за да нямаме нулеви елементи (да ги намалим)
			}	
		return array;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int[] a=extractNumbers(str);
		int sum=0;
		for(int i =0;i<a.length;i++){
			if(a[i]!=0){
				System.out.println(a[i]);
			}
			sum+=a[i];
		}
		System.out.println("Sum is: "+sum);

	
	
		}

}
