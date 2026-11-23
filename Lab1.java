//Question no.3

//import java.util.Scanner;
//public class Lab1
//{
//  public static void main (String [] args)
//  {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter the redius");
//    int redius = sc.nextInt();
//    double area = Math.PI*redius*redius;
//    System.out.println("The area of the circle is "+area);
//  } 
//}


//Question no.4

//import java.util.Scanner;
//public class Lab1
//{
//  public static void main (String [] args)
//  {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter the number:");
//    int num = sc.nextInt();
//    System.out.println("The last two digit is "+num%100);
//  } 
//}


//Question no.5

//import java.util.Scanner;
//public class Lab1
//{
//  public static void main (String [] args)
//  {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter the amount:");
//    int inch = sc.nextInt();
//    double meter = inch*0.0254;
//    System.out.println("The amount in meter is "+meter);
//  } 
//}

//Question no.6

//import java.util.Scanner;
//public class Lab1
//{
//  public static void main (String [] args)
//  {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter the number:");
//    int num1 = sc.nextInt();
//    int num2 = sc.nextInt();
//    int temp;
//    temp=num1;
//    num1=num2;
//    num2=temp;
//    System.out.println("Now,First Number "+num1);
//    System.out.println("Now,First Number "+num2);
//  } 
//}


//Question no.6(Different)

import java.util.Scanner;
public class Lab1
{
  public static void main (String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    num1=num1-num2;
    num2=num1+num2;
    num1=num2-num1;
    System.out.println("Now,First Number "+num1);
    System.out.println("Now,First Number "+num2);
  } 
}