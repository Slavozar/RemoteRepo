import java.util.Scanner;

public class ZAD8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		boolean flag=true;
		for(int i=0;i<str.length()/2;i++){
			if(str.charAt(i)!=str.charAt(str.length()-i-1)){
				flag=false;
				break;
			}
		}
		if(flag){
			System.out.println("Да");
		}
		else{
			System.out.println("Не");
		}
	}

}