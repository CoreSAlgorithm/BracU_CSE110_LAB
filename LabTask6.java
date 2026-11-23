//Question-1
//import java.util.Scanner;
//public class LabTask6
//{
//  public static void main (String [] args)
//  {
//    Scanner sc = new Scanner (System.in);
//    String s1 = "9Abe-Coal-69UK-420i";
//    String m = "";
//    for (int i=0; i<s1.length(); i++)
//    {
//      int n = 0;
//      char ch = s1.charAt(i);
//      if (ch == 'A' || ch== 'E' || ch== 'I' || ch== 'O' || ch== 'U')
//      {
//        n += ((int) ch)+32;
//        m += (char) n;
//      }
//      else if (ch == 'a' || ch== 'e' || ch== 'i' || ch== 'o' || ch== 'u')
//      {
//        n += ((int) ch)-32;
//        m += (char) n;
//      }
//      else
//      {
//        m += ch;
//      }
//    }
//    System.out.println("Redeemable Code:" + m);
//  }
//}

//Question-2

//import java.util.Scanner;
//public class LabTask6
//{
//  public static void main (String [] args)
//  {
//    Scanner sc = new Scanner (System.in);
//    System.out.print("String1:");
//    String s1 = sc.nextLine();
//    System.out.print("String2:");
//    String s2 = sc.nextLine();
//    String s3 = "";
//    if (s1.length()>s2.length())
//    {
//      for (int i=0; i<s2.length(); i++)
//      {
//        if(s2.charAt(i)==s1.charAt(i))
//        {
//          s3 += s2.charAt(i);
//        }
//        else
//        {
//          break;
//        }
//      }
//      System.out.print("There is no common prefix between the input strings.");
//    }
//    else
//    {
//      for (int i=0; i<s1.length(); i++)
//      {
//        if(s2.charAt(i)==s1.charAt(i))
//        {
//          s3 += s1.charAt(i);
//        }
//        else
//        {
//          break;
//        }
//      }
//      System.out.print("There is no common prefix between the input strings.");
//    }
//    System.out.print(s3);
//  }
//}

//Qustion-3

//import java.util.Scanner;
//public class LabTask6
//{
//  public static void main (String [] args)
//  {
//    Scanner sc = new Scanner (System.in);
//    System.out.print("Text: ");
//    String s1 = sc.nextLine();
//    System.out.print("StartIndex: ");
//    int st = sc.nextInt();
//    System.out.print("EndIndex: ");
//    int end = sc.nextInt();
//    String s2 = "";
//    for (int i=0;i<s1.length();i++)
//    {
//      if (i >= st && i <= end)
//      {
//        s2 += s1.charAt(i) ;
//      }
//    }
//    System.out.print(s2);
//  }
//}

//Qustion-5

//import java.util.Scanner;
//public class LabTask6
//{
//  public static void main (String [] args)
//  {
//    Scanner sc = new Scanner (System.in);
//    System.out.print("Upside Down: ");
//    String s1 = sc.nextLine();
//    String s2 = "";
//    for (int i=0;i<s1.length();i++)
//    {
//      char ch = s1.charAt(i);
//      if (ch=='^')
//      {
//        System.out.print('v');
//      }
//      else if (ch==3)
//      {
//        System.out.print('e');
//      }
//      else if (ch=='@')
//      {
//        System.out.print('a');
//      }
//      else if (ch=='_')
//      {
//        System.out.print(" ");
//      }
//      else if (ch=='b')
//      {
//        System.out.print('c');
//      }
//      else if (ch=='z')
//      {
//        System.out.print('a');
//      }
//    }
//  }

//Qustion-6

import java.util.Scanner;
public class LabTask6
{
  public static void main (String [] args)
  {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter the Number: ");
    String s1 = sc.nextLine();
    int m = 0;
    for(int i=0;i<s1.length();i++)
    {
      char ch = s1.charAt(i);
      m = m*10 + (ch-'0');
    }
    if (m<0 || m>100)
    {
      System.out.print("Invalid mark");
    }
    else if (m >= 90)
    {
      System.out.print('A');
    }
    else if (m >= 80)
    {
      System.out.print('A'+'-');
    }
    else if (m >= 70)
    {
      System.out.print('B');
    }
    else if (m >= 60)
    {
      System.out.print('C');
    }
    else if (m >= 50)
    {
      System.out.print('D');
    }
    else if(m < 50)
    {
      System.out.print('F');
    }
  }
}