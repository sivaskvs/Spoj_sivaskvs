import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner(System.in);
	float f,g;
	int p,n = 0;
	int r[] = new int[10000];
	do
	{
	f = sc.nextFloat();
	p = func(f);
	r[n] = p;
	n++;
	}while(f!=0.00);
	for(int i=0; i<(n-1); i++)
	{
	System.out.println(""+r[i]+" card(s)");
	}
	}
	public static int func(float f)
	{
	float p=0.00f;
	for(int i=2;i<10000;i++)
	{
		p = p+(float)(1/((float)i));
	if(p > f)
			{
			return (i-1);
			}		
	}
	return 0;
	}
}