import java.util.Scanner;

public class ZAD5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		int index=-1,space=0;
		for(int i=0;i<str1.length();i++){
			index=str2.indexOf(str1.charAt(i));
			if (index!=-1){
				space=i;
				break;
			}		
		}
		for(int i=0;i<str2.length();i++){
			if(i==index){
				System.out.println(str1);
				continue;
			}
			for(int j=0;j<space;j++){
				System.out.print(" ");
			}
			System.out.print(str2.charAt(i));
			System.out.println();
		}
		
		
		
		
		
		
		

	}

}
