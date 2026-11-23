//import java.util.Scanner;
//public class xm
//{
//  public static void main (String [] args)
//  {
//    Scanner sc = new Scanner(System.in);
//    System.out.print ("Start: ");
//    int start = sc.nextInt();
//    System.out.print ("End: ");
//    int end = sc.nextInt();
//    int digit = 0;
//    if (end<3)
//    {
//      System.out.print ("Too far off ");
//    }
//    else 
//    {
//      for (int i=start;i<=end;i++)
//      {
//        System.out.print (i+" ");
//        digit++;
//      }
//      if ((start-end)%digit==0)
//      {
//        System.out.print ("Congratulation");
//      }
//      else
//      {
//        System.out.print ("Close");
//      }
//    }
//  }
//}

import java.util.Scanner;

public class xm {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Start: ");
        int start = sc.nextInt();

        System.out.print("End: ");
        int end = sc.nextInt();

        int min = Math.min(start, end);
        int max = Math.max(start, end);

        int compositeCount = 0;
        String compositeList = "";

        // composite number check
        for (int i = min; i <= max; i++) {
            if (isComposite(i)) {
                compositeList += i + " ";
                compositeCount++;
            }
        }

        // ??? ???? composite ?? ????
        if (compositeCount == 0) {
            System.out.println("Too far off.");
            return;
        }

        // composite list print
        System.out.println(compositeList.trim());

        int diff = Math.abs(end - start);

        if (diff % compositeCount == 0) {
            System.out.println("Congratulations! The treasure is yours.");
        } else {
            System.out.println("Close! But not quite.");
        }

        sc.close();
    }
}
