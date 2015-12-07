import java.util.Scanner;

public class ZAD3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] razdeleni=str.split(",");
		for(int i=0;i<razdeleni.length;i++){
			System.out.println(razdeleni[i]);
		}
		int minLength=(razdeleni[0].length()>razdeleni[1].length())? razdeleni[1].length():razdeleni[0].length();
		if(razdeleni[0].length()>razdeleni[1].length()){
			System.out.println("Първият низ е с по-голяма дължина");
		}
		else{
			if(razdeleni[0].length()==razdeleni[1].length()){
				System.out.println("Двата низа с равни дължини");
			}
			else{
				System.out.println("Вторият низ е с по-голяма дължина");				
			}
		}
		for(int i=0;i<minLength;i++){
			if(razdeleni[0].charAt(i)!=razdeleni[1].charAt(i)){
				System.out.println(i+1+" "+razdeleni[0].charAt(i)+"-"+razdeleni[1].charAt(i));
			}
		}
		
	}

}
