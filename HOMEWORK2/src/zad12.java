
public class zad12 {

	public static void main(String[] args) {
		int d1=0,d2=0,d3=0;
for (int i=100;i<1000;i++)
{
	int num=i;
	d3=num%10;
	num=num/10;
	d2=num%10;
	d1=num/10;
	if((d1!=d2)&&(d2!=d3)&&(d3!=d1)){System.out.println(i);}
	
	}
	}

}
