//Qs-1

//import java.util.Arrays;
//import java.util.Scanner;
//public class Hometask07
//{
//  public static void main( String [] args)
//  {
//    Scanner sc = new Scanner(System.in);
//    System.out.print("The number of arrays:");
//    int n = sc.nextInt();
//    int[] arr = new int[n];
//    for (int i=0; i<n; i++)
//    {
//      System.out.print("Enter the Number:");
//      int num = sc.nextInt();
//      arr[i] = num;
//    }
//    System.out.println("Original array:");
//    for (int i=0; i<arr.length; i++)
//    {
//      System.out.print(arr[i]+" ");
//    }
//    System.out.println("\nAfter modifying:");
//    for (int i=0; i<arr.length; i++)
//    {
//      if (arr[i] > 0)
//      {
//        arr[i] = 1;
//      }
//      else if (arr[i] < 0)
//      {
//        arr[i] = 0;
//      }
//      else if (arr[i] == 0 )
//      {
//        arr[i] = 0;
//      }
//    }    
//    for (int i=0; i<arr.length; i++)
//    {
//      System.out.print(arr[i]+" ");
//    }
//  }
//}

//QS-2

//import java.util.Arrays;
//import java.util.Scanner;
//public class Hometask07
//{
//  public static void main( String [] args)
//  {
//    Scanner sc = new Scanner(System.in);
//    System.out.print("The number of arrays:");
//    int n = sc.nextInt();
//    int[] arr = new int[n];
//    for (int i=0; i<n; i++)
//    {
//      System.out.print("Enter the Number:");
//      int num = sc.nextInt();
//      arr[i] = num;
//    }
//    System.out.println(Arrays.toString(arr));
//    System.out.print("Enter the Number:");
//    int num1 = sc.nextInt();
//    for (int i=0; i<arr.length; i++)
//    {
//      if (arr[i] == num1)
//      {
//        System.out.print(arr[i]+" is at index "+i);
//        return;
//      }
//    }
//    System.out.print("Element not found");
//  }
//}

//Qs-3

//import java.util.Arrays;
//import java.util.Scanner;
//public class Hometask07
//{
//  public static void main( String [] args)
//  {
//    Scanner sc = new Scanner(System.in);
//    System.out.print("The length of arrays:");
//    int n = sc.nextInt();
//    double[] arr = new double[n];
//    double sum = 0;
//    double max = 0;
//    double min = 0;
//    int minin = 0;
//    int maxin = 0;
//    for (int i=0; i<n; i++)
//    {
//      System.out.print("Enter the Number:");
//      double num = sc.nextDouble();
//      arr[i] = num;
//      sum += arr[i];
//      if (i == 0)
//      {
//        min = arr[i];
//        max = arr[i];
//        minin = 0;
//        maxin = 0;
//      }
//      else
//      {
//        if (arr[i] > max)
//        {
//          max = arr[i];
//          maxin = i;
//        }
//        if(arr[i] < min)
//        {
//          min = arr[i];
//          minin = i;
//        }
//      }
//    }
//    double avg = sum/n;
//    System.out.println("Maximum element " + max + " found at index " + maxin);
//    System.out.println("Minimum element " + min + " found at index " + minin);
//    System.out.println("Summation: " + sum);
//    System.out.println("Average: " + avg);
//  }
//}

//Qs-4

//import java.util.Arrays;
//import java.util.Scanner;
//public class Hometask07
//{
//  public static void main( String [] args)
//  {
//    Scanner sc = new Scanner(System.in);
//    System.out.print("The length of array 1:");
//    int n1 = sc.nextInt();
//    int[] arr1 = new int[n1];
//    for (int i=0; i<n1; i++)
//    {
//      System.out.print("Enter the Number:");
//      int num1 = sc.nextInt();
//      arr1[i] = num1;
//    }
//    System.out.print("The length of array 2:");
//    int n2 = sc.nextInt();
//    int[] arr2 = new int[n2];    
//    for (int i=0; i<n2; i++)
//    {
//      System.out.print("Enter the Number:");
//      int num2 = sc.nextInt();
//      arr2[i] = num2;
//    }
//    for (int i=0; i<arr2.length; i++)
//    {
//      int count = 0;
//      for (int j=0; j<arr1.length; j++)
//      {
//        if (arr2[i] == arr1[j])
//        {
//          count++;
//          break;
//        }
//      }
//      if (count == 0)
//      {
//        System.out.print("Array 2 is not a subset of Array 1.");
//        return;
//      }
//    }
//    System.out.print("Array 2 is a subset of Array 1.");
//  }
//}

//Qs-5

import java.util.Arrays;
import java.util.Scanner;
public class Hometask07
{
  public static void main( String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int[] marks = {85,90,75,44,99};
    String[] names = {"Bob","Alice","Max","Marry","Rosy"};
    for (int i=0; i<marks.length; i++)
    {
      for (int j=0; j<marks.length-1-i; j++)
      {
        if (marks[j]>marks[j+1])
        {
          int temp = marks[j];
          marks[j] = marks[j+1];
          marks[j+1] = temp;
          String tempst = names[j];
          names[j] = names[j+1];
          names[j+1] = tempst;
        }
      }
    }
    System.out.println("Sorted Array:");
    for (int i=0; i<marks.length; i++)
    {
      System.out.print(marks[i]+" ");
    }
    System.out.println();
    for (int i = 0; i < names.length; i++)
    {
      System.out.print(names[i] + " ");
    }
  }
}