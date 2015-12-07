import java.util.Scanner;

public class ZAD7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] duma=str.split(" ");
		int maxLength=0;
		for(int i=0;i<duma.length;i++){
			if(duma[i].length()>maxLength){
				maxLength=duma[i].length();
			}
		}
		System.out.println("Броя думи е: "+duma.length+"  , "+ "най-дългата дума е с "+maxLength+" символа");
		}

}
