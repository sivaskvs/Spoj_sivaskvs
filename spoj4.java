import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	BigInteger bi1, bi2, bi3,bi4;  
	BigInteger[] series = new BigInteger[10];
	BigInteger[] series1 = new BigInteger[10];
	bi4 = new BigInteger("2");
	Scanner sc = new Scanner(System.in);
	for(int i =0;i<10;i++)
	{
	bi1 = sc.nextBigInteger();
	bi2 = sc.nextBigInteger();
	bi3 = bi2.add(BigInteger.ZERO);
	bi1 = bi1.divide(bi4); 
	bi2 = bi2.divide(bi4); 
	bi1 = bi1.subtract(bi2);
	bi2 = bi1.add(bi3);
	series[i] =  bi1.add(BigInteger.ZERO);
	series1[i] = bi2.add(BigInteger.ZERO);
	}
	for(int i =0;i<10;i++)
	{
	System.out.println( "" + series1[i]);
	System.out.println( "" + series[i]);
	}
	}
}
