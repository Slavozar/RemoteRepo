import java.util.Scanner;

public class ZAD6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] duma=str.split(" ");
		for(int i=0;i<duma.length;i++){
			duma[i]=duma[i].replace(duma[i].charAt(0),duma[i].toUpperCase().charAt(0));		
			duma[i]=duma[i].replace(duma[i].substring(1, duma[i].length()), duma[i].toLowerCase().substring(1, duma[i].length()));		
		}			
		for(int i=0;i<duma.length;i++){
			System.out.print(duma[i]+" ");
		}

	}

}
