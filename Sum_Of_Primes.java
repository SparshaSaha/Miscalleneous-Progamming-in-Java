/*
The program is to print any given number (>2) as a sum of two prime numbers
Time complexity = O(nlog( log(n) ) )

Example:

9990

Answer:
17 9973

*/


import java.util.*;
import java.lang.*;
import java.io.*;
class Sum_Of_Primes
 {
	public static void main (String[] args)
	 {
	     Scanner sc=new Scanner(System.in);
	     Map<Integer,Integer> map=new HashMap<Integer,Integer>();

          System.out.println("Enter a number");
	         int m=sc.nextInt();

	         //Sieve of Erathrones to calculate primes
	    boolean a[]=new boolean[m+1];
		for(int i=2;i<=m;i++)
		{
		    if(a[i]==false){
		        map.put(i,1);
		    for(int j=2;j*i<=m;j++)
		    {
		        a[j*i]=true;
		    }

		    }
		}

    //End of sieve
System.out.println("The pairs are: ");

		for(int i=3;i<=m;i++)
		{
		    if(map.get(i)!=null && map.get(i)==1)
		    {
		        if(map.get(m-i)!=null && map.get(m-i)==1)
		        {
              map.put(i,0);
		            System.out.println(i+" "+(m-i));
		        }
		    }
		}
	 }
}
