import java.util.Scanner;
public class string
{
  public static void main( String [] args)
  {
    Scanner sc = new Scanner(System.in);
    String n = "CSE230";
    for (int i=0;i<n.length();i++)
    {
      System.out.println(i+"-"+n.charAt(i)+"-"+(int)n.charAt(i));
    }
  }
}