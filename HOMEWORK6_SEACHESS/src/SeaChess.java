import java.util.Scanner;

public class SeaChess {
	static void print(char[][] a){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				System.out.print(a[i][j]+"	");
			}
			System.out.println();
		}
	}
	static void slojiIntervali(char[][] a){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				a[i][j]='*';
			}
		}
	}
	static boolean winnerByRow(char[][] duska){
		for(int red=0;red<3;red++){
			if(((duska[red][0]=='X')&&(duska[red][1]=='X')&&(duska[red][2]=='X'))||(duska[red][0]=='0')&&(duska[red][1]=='0')&&(duska[red][2]=='0')){
				return true;
			}
		}
	return false;
	}
	static boolean winnerByCol(char[][] duska){
		for(int col=0;col<3;col++){
			if(((duska[0][col]=='X')&&(duska[1][col]=='X')&&(duska[2][col]=='X'))||(duska[0][col]=='0')&&(duska[1][col]=='0')&&(duska[2][col]=='0')){
				return true;
			}
		}
	return false;
	}
	static boolean winnerByDiag1(char[][] duska){
		boolean flag=true;
		for(int i=0;i<2;i++){
			if((duska[i][i]=='X')||(duska[i][i]=='0')){
				if(duska[i][i]!=duska[i+1][i+1]){
				
					flag=false;
				}
			}
			else{
				flag=false;
			}
		}
		return flag;
	}
	static boolean winnerByDiag2(char[][] duska){
		boolean flag=true;
		int j=2;
		for(int i=0;i<2;i++){
			if((duska[i][j]=='X')||(duska[i][j]=='0')){
				if(duska[i][j]!=duska[i+1][j-1]){
				
					flag=false;
				}
			}
			else{
				flag=false;
			}
			j--;
		}
		return flag;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char[][] duska=new char[3][3];
 	slojiIntervali(duska);
	  int igrach=1;
	  int tries=9;
  do{
	  int x,y;
	  do{
	  System.out.println("Играч "+(igrach%2+1)+" въведете следващ ход:");
	  x=sc.nextInt();
	  y=sc.nextInt();
	  }
	  while((!((x>0)&&(x<=3)&&(y>0)&&(y<=3)))||(duska[x-1][y-1]!='*'));
	  if(igrach%2==1){
		  duska[x-1][y-1]='X';
	  }
	  else{
		  duska[x-1][y-1]='0';
	  }
	  igrach++;
	  print(duska);
	  tries--;
  }
  while((tries!=0)&&(!(winnerByRow(duska)||winnerByCol(duska)||winnerByDiag1(duska)||winnerByDiag2(duska))));
  if(tries!=0){
  System.out.println("Играч "+((igrach%2)+1)+" е победител");
 
	}
  else{
	  System.out.println("Играта е равна");
  }

}
}