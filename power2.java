import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner h = new Scanner (System.in);
		int a,b;
		a = h.nextInt();
		b = h.nextInt();
		long l=1;
		 while (b > 0)
		  {
		  	l = l*a;
		  	b-=1;
		  }
		  System.out.println(l);
	}
}
