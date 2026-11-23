import java.util.Scanner;
public class Task_3
{
  public static void main(String [] args)
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter The Year");
  int year = sc.nextInt();
  if (year%4 == 0)
  {
    if(year%100 == 0)
    {
      if (year%400 == 0)
      {
        System.out.println("The Year is a Leap Year");
      }
      else
      {
        System.out.println("The Year is not a Leap Year");
      }
    }
    else
    {
       System.out.println("The Year is a Leap Year");
    }
  }
  else
  {
    System.out.println("The Year is not a Leap Year");
  }
 }
}