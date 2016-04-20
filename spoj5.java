import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner(System.in);
	int f,g;
	int p,n = 0;
	int r[] = new int[1000];
	do
	{
	f = sc.nextInt();
	p = func(f);
	r[n] = p;
	n++;
	}while(f!=0);
	for(int i=0; i<(n-1); i++)
	{
	System.out.println(""+r[i]);
	}
	}
	public static int func(int f)
	{
	int p=0;
	for(int i=f;i>=1;i--)
	{
	p = p+(i*i);
	}
	return p;
	}
}