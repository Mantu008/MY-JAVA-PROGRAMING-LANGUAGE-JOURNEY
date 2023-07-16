import java.util.Scanner;

class myexepction extends Exception{
     public String toString(){
        return "i am tostring()";
     }
     public String getMessage(){
        return "i am getMessage()";
     }
}
public class exepctionclass {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a:");
        int a=sc.nextInt();
        System.out.println("starting...");

        if(a<20){

            try {         
                   throw new myexepction();                                                     
                //    throw new ArithmeticException("this is my exepction");                     // throw arthmetic exepction
            } catch (Exception e) {
                 System.out.println(e.getMessage());
                 System.out.println(e.toString());
                 System.out.println(e);
                e.printStackTrace();
            }

        }

        System.out.println("ending....");

    }
}
