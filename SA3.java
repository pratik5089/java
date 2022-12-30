import java.io.*;
public class Sa3
{
 public static void main(String[] arg)throws IOException
{
 int A[]=new int[]{9,5,6,3,2,4,8};
 int i;
 int sum=0;
 for(i=0;i<A.length;i++)
 {
  sum=sum+A[i];
 }
 System.out.println("Sum of Array alements is"+sum);
}
}
