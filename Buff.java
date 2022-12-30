import java.io.*;
public class Buff
{ 
 public static void main(String[] arg) throws IOException
{
 int roll_no;
 String name;
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 System.out.println("Enter the Roll_no");
 roll_no=Integer.parseInt(br.readLine());
 
 System.out.println("Enter the Name");
 name=br.readLine();
 
 System.out.println("Roll Number:"+roll_no);
 System.out.println("Name:"+name);
}
}
