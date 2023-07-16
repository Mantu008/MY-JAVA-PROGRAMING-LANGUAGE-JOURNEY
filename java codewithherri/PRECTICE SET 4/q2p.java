
import java.util.Scanner;
public class q2p {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);

        System.out.print("enter oops marks:");
        int marks=n.nextInt();

        System.out.print("enter linear algebra marks:");
        int marks1=n.nextInt();

        System.out.print("enter engenerring diagram marks:");
        int marks2=n.nextInt();
        
        int totel=marks+marks1+marks2;
        float output=(totel/3.0f);

        if(output>=40 && marks>=33 && marks1>=33 && marks2>=33)
        {
            System.out.println("you are passed in each subject");
        }else{
            System.out.println("you are fail");
        }
    }
}
