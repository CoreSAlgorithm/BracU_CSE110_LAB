//import java.util.Arrays;
//import java.util.Scanner;
//public class Art {
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of a array:");
//        int size = sc.nextInt();
//        int [] arr1 = new int [size];
//        for (int i=0; i<size; i++)
//        {
//          System.out.println("Enter the element");
//          int elem = sc.nextInt();
//          arr1 [i] = elem;
//        }
//        System.out.println(Arrays.toString(arr1));
//    }
//}

import java.util.Arrays;
import java.util.Scanner;
public class Art {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr [] = {23,43,45,65,67};
//        for (int i=0 ;i<arr.length; i++)
//        {
//          System.out.println(arr[i]);
//        }
          for (int i=arr.length-1 ;i>=0; i--)
          {
            System.out.println(arr[i]);
          }
    }
}

