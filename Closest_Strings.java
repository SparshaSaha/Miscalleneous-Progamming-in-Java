/*

This program takes a dictionary and two separate strings.
Then it computes the least distance between the two in terms of index

Example:
the quick brown fox quick
quick fox

the output is 1 (4-3)

*/

import java.util.*;
import java.lang.*;
import java.io.*;
class Closest_Strings
 {
	public static void main (String[] args)
	 {
	     Scanner sc=new Scanner(System.in);
       System.out.println("Enter number of elements in dictionary");
	         int n=sc.nextInt();
	         Map<String,ArrayList<Integer>> map=new HashMap<String,ArrayList<Integer>>();
           System.out.println("Enter element of dictionary");
	         for(int i=0;i<n;i++)
	         {
	             String z=sc.next();
	             if(map.get(z)!=null)
	             {
	                 ArrayList<Integer> x=map.get(z);
	                 x.add(i);
	                 map.put(z,x);
	             }
	             else
	             {
	                 ArrayList<Integer> x=new ArrayList<Integer>();
	                 x.add(i);
	                 map.put(z,x);
	             }
	         }
           System.out.println("Enter two strings to compare");
	         String s1=sc.next();
	         String s2=sc.next();

	         ArrayList<Integer> l1=map.get(s1);
	         ArrayList<Integer> l2=map.get(s2);
	         int diff=9999;

	         for(int i=0;i<l1.size();i++)
	         {
	             int s=l1.get(i);
	             for(int j=0;j<l2.size();j++)
	             {
	                 if(Math.abs(s-l2.get(j))<diff)
	                 diff=Math.abs(s-l2.get(j));
	             }
	         }

	         System.out.println(diff);

	     }
}
