import java.util.Scanner;
public class read
{
  public static void main (String [] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.print("Massage: ");
    String s1 = sc.nextLine();
    System.out.print("Number: ");
    String s2 = sc.nextLine();
    String s3 = s1+""+s2;
    int m = 0;
    for(int i=0;i<s3.length();i++)
    {
      char ch = s3.charAt(i);
      if (ch>='1' && ch<='9')
      {
        m = m*10 + (ch-'0');
      }
    }
    System.out.print("2-Digti pin: "+m);
  }
}