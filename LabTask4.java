//Question-1

//import java.util.Scanner;
//public class LabTask4
//{
//  public static void main (String [] args)
//  {
//    Scanner sc = new Scanner (System.in);
//    int totalwins=0;
//    System.out.println("Enter the warriors number: ");
//    int num = sc.nextInt();
//    for (int i=1;i<=num;i++)
//    {
//      for (int j=1;j<=num;j++)
//      {
//        if (i!=j && i%j==0)
//        {
//          System.out.println(i+" beats "+j);
//          totalwins++;
//        } 
//      }
//    }
//    System.out.println("Total wins: "+totalwins);
//  }
//}

//Question-2

//import java.util.Scanner;
//public class LabTask4
//{
//  public static void main (String [] args)
//  {
//    Scanner sc = new Scanner (System.in);
//    int i =0;
//    System.out.println("Enter the Students number: ");
//    int n = sc.nextInt();
//    System.out.println("Enter the Mission number: ");
//    int m = sc.nextInt();
//    for (i=1;i<=n;i++)
//    {
//      double sum =0;
//      System.out.println("Score of Student "+i+": ");
//        for (int j=1;j<=n;j++)
//      {
//        System.out.println("Sub "+j);
//        double sub = sc.nextDouble();
//        sum = sum+sub;
//      }
//        double avg = sum / m;
//        System.out.println("Average point of student "+i+": "+avg);
//    }
//  }
//}

//Question-3

//import java.util.Scanner;
//public class LabTask4
//{
//  public static void main (String [] args)
//  {
//    Scanner sc = new Scanner (System.in);
//    System.out.println("Enter number of pairs: ");
//    int p = sc.nextInt();
//    for (int i=1;i<=p;i++)
//    {
//      System.out.println("Pair "+i);
//      System.out.println("Enter first number: ");
//      int num1 = sc.nextInt();
//      System.out.println("Enter second number: ");
//      int num2 = sc.nextInt();
//      int gcd;
//      if (num1<=0 || num2<=0)
//      {
//        gcd = 0;
//      }
//      else 
//      {
//        while (num2!=0)
//        {
//          int r = num1%num2;
//          num1=num2;
//          num2=r;
//        }
//        gcd=num1;
//      }
//      System.out.println("Pair "+i+" GCD = "+gcd);
//    }
//  }
//}

//Question-4

import java.util.Scanner;
public class LabTask4
{
  public static void main (String [] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter number of pairs: ");
    int p = sc.nextInt();
  }
}