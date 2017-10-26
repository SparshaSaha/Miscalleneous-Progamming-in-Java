/*
Google's first tweet consisted of "I'm 01100110 01100101 01100101 01101100 01101001 01101110 01100111 00100000 01101100 01110101 01100011 01101011 01111001 00001010"

This was a cryptic code....The decoding of this code has been done in this program using java!
*/



import java.util.*;
class GooglesFirstTweet
{
  public static void main(String args[])
  {
    String tweet="I'm 01100110 01100101 01100101 01101100 01101001 01101110 01100111 00100000 01101100 01110101 01100011 01101011 01111001 00001010";
    String code_part=tweet.substring(4,tweet.length());
    String z[]=code_part.split(" ");
    String ult="I'm ";

    for(int i=0;i<z.length;i++)
    {
      char f=(char)get_Sum(z[i]);
      ult+=f;

    }

    System.out.println(ult);
  }

  public static int get_Sum(String z)
  {
    int sum=0;
    for(int i=0;i<z.length();i++)
    {
      int integer=Integer.parseInt(z.charAt(i)+"");
      if(integer==1)
      {
        sum+=(int)Math.pow(2,7-i);
      }
    }
    return sum;
  }
}
