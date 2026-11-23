//Question-1

//import java.util.Scanner;
//public class Labno3
//{
//  public static void main(String [] args )
//  {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter the number:");
//    int num = sc.nextInt();
//    for (int i=num;i>=-6;i=i-6)
//    {
//      if (i==-6)
//      {
//        System.out.print(i);
//      }
//      else
//      {
//        System.out.print(i+", ");
//      }
//    }
//  }
//}

//Question-1

//import java.util.Scanner;
//public class Labno3
//{
//  public static void main (String [] args)
//  {
//    Scanner sc = new Scanner (System.in);
//    System.out.println("Enter the number");
//    int num = sc.nextInt();
//    for (int i=1;i<=6;i++)
//    { 
//      int value = num + (i-1)*9;
//      if (i%2==0)
//      {
//        value = - value;
//      }
//      if (i==6)
//      {
//        System.out.println(value);
//      }
//      else 
//      {
//        System.out.print(value+", ");
//      }
//    }
//  }
//} 

//Question-2

//import java.util.Scanner;
//public class Labno3
//{
//  public static void main (String [] args)
//  {
//    Scanner sc = new Scanner (System.in);
//    int sum =0;
//    double avg=0;
//    System.out.println("Enter the Amount");
//    int num = sc.nextInt();
//    for (int i=1;i<=num;i++)
//    {
//      System.out.println("Enter the number:");
//      int num1 = sc.nextInt();
//      sum=sum+num1;
//      avg =(sum/num);
//    }
//    System.out.println("The sum of "+num+" no is: "+sum);
//    System.out.println("The avg is: "+ avg);
//  }
//} 

//Question-3

//import java.util.Scanner;
//public class Labno3
//{
//  public static void main(String [] args)
//  {
//    Scanner sc = new Scanner (System.in);
//    System.out.println("Enter Number of Days: ");
//    int days = sc.nextInt();
//    int units=40;
//    int day=0;
//    for (day=1;day<=days;day++)
//    {
//      if (day%3==0 && day%5==0)
//      {units -=45 ; units +=25;}
//      else if (day%3==0){units -=45;}
//      else if (day%5==0){units +=25;}
//      else {units += 10;}
//      if (units>500){units -= 50;}
//      if (units<0)
//      {
//        System.out.println("Blackout on Day "+day);
//        return;
//      }
//    }
//      System.out.println("Final Power: "+units);
//  }
//}

//Question-5

//import java.util.Scanner;
//public class Labno3
//{
//  public static void main(String [] args)
//  {
//    Scanner sc = new Scanner (System.in);
//    int i;
//    int sum1=0,sum2=0;
//    System.out.println("Enter the value of Y: ");
//    int value = sc.nextInt();
//    for (i=1;i<=value;i++)
//    {
//      if (i%2!=0)
//      {sum1 += i*i;}
//      else 
//      {sum2 -= i*i;}
//    }
//    System.out.println("output: "+(sum1+sum2));
//  }
//}

//Question-6

//import java.util.Scanner;
//public class Labno3
//{
//  public static void main(String [] args)
//  {
//    Scanner sc = new Scanner (System.in);
//    int i=0;
//    System.out.println("Enter the number: ");
//    int num = sc.nextInt();
//    while (num!=0)
//    {
//      num=num/10;
//      i++;
//    }
//    System.out.println("Total digit: "+i);
//  }
//}

//Question-7

//import java.util.Scanner;
//public class Labno3
//{
//  public static void main(String [] args)
//  {
//    Scanner sc = new Scanner (System.in);
//    int i,use;
//    int plants=5;
//    System.out.println("Enter Hour: ");
//    int h = sc.nextInt();
//    System.out.println("Enter Water Units: ");
//    int w = sc.nextInt();
//    for (i=1;i<=h;i++)
//    {
//      if (i%2==0)
//      {use=plants*4;}
//      else 
//      {use=plants*3;}
//      w -= use;
//      if (w<0)
//      {
//        System.out.println("Stopped at Hour: "+i);
//        return;
//      }
//    }
//    System.out.println("All watered ");
//    System.out.println(w+" water unit left ");
//  }
//}
