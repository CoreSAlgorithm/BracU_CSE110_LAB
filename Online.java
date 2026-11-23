//Right Angle Triangle:

//import java.util.Scanner;
//public class Online
//{
//  public static void main (String[] args)
//  {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter the number:");
//    int n=sc.nextInt();
//    for (int i=1;i<=n;i++)
//    {
//      for (int j=1;j<=i;j++)
//      {
//        System.out.print("*");
//      } 
//      System.out.println("");
//    }
//  }
//}

//Squre Majhe Faka

//import java.util.Scanner;
//public class Online
//{
//  public static void main (String[] args)
//  {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter the number:");
//    int n=sc.nextInt();
//    for (int i=1;i<=n;i++)
//    {
//      for (int j=1;j<=n;j++)
//      {
//        if (i==1 || i==n || j==1 || j==n)
//        {
//          System.out.print("*");
//        }
//        else 
//        {
//          System.out.print(" ");
//        }
//      } 
//      System.out.println();
//    }
//  }
//}

//ulta right angle

//import java.util.Scanner;
//public class Online
//{
//  public static void main (String[] args)
//  {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter the number:");
//    int n=sc.nextInt();
//    for (int i=1;i<=n;i++)
//    {
//      for(int k=1;k<=n-i;k++)
//      {
//        System.out.print(" ");
//      }
//        for (int j=1;j<=i;j++)
//        {
//          System.out.print("*");
//        }
//       System.out.println();
//    }
//  }
//}

//normal triangle

//import java.util.Scanner;
//public class Online
//{
//  public static void main (String[] args)
//  {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter the number:");
//    int n=sc.nextInt();
//    for (int i=1;i<=n;i++)
//    {
//      for(int k=1;k<=n-i;k++)
//      {
//        System.out.print(" ");
//      }
//        for (int j=1;j<=i*2-1;j++)
//        {
//          System.out.print("*");
//        }
//       System.out.println();
//    }
//  }
//}

//normal triangle faka

//import java.util.Scanner;
//public class Online
//{
//  public static void main (String[] args)
//  {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter the number:");
//    int n=sc.nextInt();
//    for (int i=1;i<=n;i++)
//    {
//      for(int k=1;k<=n-i;k++)
//      {
//        System.out.print(" ");
//      }
//        for (int j=1;j<=i*2-1;j++)
//        {
//          if (i==1 || i==n || j==1 || j==i*2-1)
//          {
//            System.out.print("*");
//          }
//          else {System.out.print(" ");}
//        }
//       System.out.println();
//    }
//  }
//}

//diamond shape

import java.util.Scanner;
public class Online
{
  public static void main (String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:");
    int n=sc.nextInt();
    for (int i=1;i<=n;i++)
    {
      for(int k=1;k<=n-i;k++)
      {
        System.out.print(" ");
      }
        for (int j=1;j<i*2;j++)
        {
          if (i==1 || j==1 || j==i*2-1)        //maje dag anar jonnoh(i==1 || i==n || j==1 || j==i*2-1)            
          {
            System.out.print("*");
          }
          else 
          {
            System.out.print(" ");
          }
        }
       System.out.println();
    }                            
        for (int i=n;i>=1;i--)                //    sm code just ulta hbe
    {
      for(int k=1;k<=n-i;k++)   
      {
        System.out.print(" ");
      }
        for (int j=1;j<i*2;j++)
        {
          if (i==1 || j==1 || j==i*2-1)          //   uporer conditon er motoi         
          {
            System.out.print("*");
          }
          else 
          {
            System.out.print(" ");
          }
        }
       System.out.println();
    }
  }
}

//X er code

//import java.util.Scanner;
//public class Online
//{
//  public static void main (String[] args)
//  {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter the number:");
//    int n=sc.nextInt();
//            for (int i=n;i>=1;i--)
//    {
//      for(int k=1;k<=n-i;k++)   
//      {
//        System.out.print(" ");
//      }
//        for (int j=1;j<i*2;j++)
//        {
//          if (i==1 || j==1 || j==i*2-1)      
//          {
//            System.out.print("*");
//          }
//          else 
//          {
//            System.out.print(" ");
//          }
//        }
//       System.out.println();
//    }
//    for (int i=1;i<=n;i++)
//    {
//      for(int k=1;k<=n-i;k++)
//      {
//        System.out.print(" ");
//      }
//        for (int j=1;j<i*2;j++)
//        {
//          if (i==1 || j==1 || j==i*2-1)        
//          {
//            System.out.print("*");
//          }
//          else 
//          {
//            System.out.print(" ");
//          }
//        }
//       System.out.println();
//    }                            
//  }
//}