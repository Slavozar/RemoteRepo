import java.util.Scanner;

public class zad17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b=0;
		System.out.println("�������� ������� �������� ����");
		char c=sc.next().charAt(0);
		
		
		do{
			System.out.println("�������� ����� [3-20]");
		 b = sc.nextInt();
		}
		while((  b<3)||(b>20)); 
		for(int row=1;row<=b;row++){
			for(int col=1;col<=b;col++)
			{
				if((row==1)||(row==b)||(col==1)||(col==b)){
					System.out.print("*");
					
				}
				else{System.out.print(c);}
			}
		System.out.println();
	}
			
	}

	
}
