import java.util.Scanner;
public class q6p {
    public static void main(String[] args) {
       Scanner n=new Scanner(System.in);
       System.out.print("enter your choice:");
       String choice=n.nextLine(); 

       if(choice.endsWith(".com")){
        System.out.println("this is commertial website");
       }
       else if(choice.endsWith(".org")){
        System.out.println("this is organizational website");
       }
       else if(choice.endsWith(".in")){
        System.out.println("this is indian website");
       }

    }
}
