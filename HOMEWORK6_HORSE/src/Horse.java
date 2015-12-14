import java.util.Scanner;

public class Horse {
	static void slojiIntervali(char[][] a){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				a[i][j]='0';
			}
		}
	}
	static void print(char[][] a){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	static void slojiTochki(char[][] duska, int x0,int y0){
		if((!((x0>=0&&x0<duska.length)&&(y0>=0&&y0<duska[0].length)))||(duska[x0][y0]=='*')){
			return;
		}
		slojiTochka(duska,x0,y0);
		
		slojiTochki(duska,x0+2,y0+1);
		slojiTochki(duska,x0+2,y0-1);
		slojiTochki(duska,x0+1,y0+2);
		slojiTochki(duska,x0+1,y0-2);
		
		slojiTochki(duska,x0-2,y0+1);
		slojiTochki(duska,x0-2,y0-1);
		slojiTochki(duska,x0-1,y0+2);
		slojiTochki(duska,x0-1,y0-2);
		
	}
	static void slojiTochka(char[][] duska, int x,int y){
		if(((x>=0&&x<duska.length)&&(y>=0&&y<duska[0].length))&&(duska[x][y]!='*')){
			duska[x][y]='*';
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Въведете брой редове: ");
		int rows=sc.nextInt();
		System.out.println("Въведете брой колони: ");
		int cols=sc.nextInt();
		char[][] duska=new char[rows][cols];
		int x,y;
		do{
		System.out.println("Въведете начална позиция");
		x=sc.nextInt();
		y=sc.nextInt();
		}
		while(!((x>=0&&x<duska[0].length)&&(x>=0&&x<duska.length)));
		slojiIntervali(duska);
		slojiTochki(duska,x,y);
		print(duska);
	}

}
