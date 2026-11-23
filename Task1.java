import java.util.Scanner;
public class Task1
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner ( System.in);
    System.out.println("Enter The num1:");
    int num1 = sc.nextInt();
    System.out.println("Enter The num2:");
    int num2 = sc.nextInt();
    int num = num1+num2;
    System.out.println(num);
  }
}