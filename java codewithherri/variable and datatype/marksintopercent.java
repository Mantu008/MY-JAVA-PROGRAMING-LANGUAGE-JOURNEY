/**
 * marksintopercent
 */
import java.util.Scanner;
public class marksintopercent {

    public static void main(String[] args) {

        Scanner sub= new Scanner(System.in);
        System.out.println("sub1 marks:");
        float sub1=sub.nextInt();

        System.out.println("sub2 marks:");
        float sub2=sub.nextInt();

        System.out.println("sub3 marks:");
        float sub3=sub.nextInt();

        System.out.println("sub4 marks:");
        float sub4=sub.nextInt();

        System.out.println("sub5 marks:");
        float sub5=sub.nextInt();

       float result=((sub1+sub2+sub3+sub4+sub5)/500)*100;
       

       System.out.print("The cbse bord percentage of student is:");
       System.out.println(result);
    }
}