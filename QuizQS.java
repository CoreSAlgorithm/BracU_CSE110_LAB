import java.util.Scanner;
public class QuizQS
{
  public static void main (String [] args)
  {
    Scanner sc =new Scanner (System.in);
    System.out.println("Enter Total Data (in GB):");
    double bill = sc.nextInt();
    if ((0<bill)&&(bill<=50))
      System.out.println("Total Internet Bill For: "+bill+" GB: TK "+ (bill*2.00));
    else if ((bill>=51)&&(bill<=100))
      System.out.println("Total Internet Bill For: "+bill+" GB: TK "+ ((50*2.00)+((bill-50)*3.5)));
    else if ((bill>=101)&&(bill<=200))
      System.out.println("Total Internet Bill For: "+bill+" GB: TK "+ ((50*2.00)+(50*3.50)+((bill-100)*5.00)));
    else if (bill>200)
      System.out.println("Total Internet Bill For: "+bill+" GB: TK "+ ((50*2.00)+(50*3.50)+(100*5.00)+((bill-200)*7.00)));
  }
}