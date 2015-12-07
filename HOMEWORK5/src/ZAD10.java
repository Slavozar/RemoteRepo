import java.util.Scanner;

public class ZAD10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	     String str=sc.nextLine();
	     for(int i=0;i<str.length();i++){
	    	 str=str.replace(str.charAt(i),(char)((int)str.charAt(i)+5));
	     }
	     System.out.println(str);
	}

}
