//QS1-User input hole

//import java.util.Scanner;
//public class HometaskFlowchart
//{
//  public static void main (String [] args)
//  {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter the number:");
//    int num = sc.nextInt();
//    String s=Integer.toString(num);
//    if (s.length()>=2)
//    {
//      System.out.println("The first two digit is "+s.substring(0,2));
//    }
//    else 
//    {
//      System.out.println("Number has less than 2 digits!");
//    }
//  } 
//}

//QS-1 Normal hole


//public class HometaskFlowchart
//{
//  public static void main (String [] args)
//  {
//    int num = 2354;
//    String firstTwo= Integer.toString(num).substring(0,2);
//    System.out.println("First two number:"+firstTwo);
//  } 
//}


//QS1 easy way 

import java.util.Scanner;
public class HometaskFlowchart
{
  public static void main (String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:");
    int num = sc.nextInt();
    System.out.println("First two number:"+num/100);
  } 
}