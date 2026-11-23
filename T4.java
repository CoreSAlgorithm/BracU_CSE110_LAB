import java.util.Scanner;
public class T4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of Members: ");
        int member= sc.nextInt();
        for(int i=1; i<=member; i++)
        {
            System.out.print("Exercises for Member-"+i+": ");
            int exer = sc.nextInt();
            if(exer>3) System.out.println("(Can't Do More than 3 exercise)");
            System.out.print("Exercise-1: ");
            double exer1 = sc.nextInt();
            System.out.print("Exercise-2: ");
            double exer2 = sc.nextInt();
            System.out.print("Exercise-3: ");
            double exer3 = sc.nextInt();
            double raw = (exer1+exer2+exer3)/3.0;
            if(exer1>350) exer1*=1.5;
            if(exer2>350) exer2*=1.5;
            if(exer3>350) exer3*=1.5;
            if(exer1<200 && exer2<200 && exer3<200)
            {
                exer1*=0.9;
                exer3*=0.9;
                exer2*=0.9;
            }
            if(raw>400)
            {
                exer1+=50;
                exer3+=50;
                exer2+=50;
            }
            double newraw = (exer1+exer2+exer3)/3.0;
            System.out.println("Average calories earned per day for Member"+i+": "+newraw);
        }
    }
}