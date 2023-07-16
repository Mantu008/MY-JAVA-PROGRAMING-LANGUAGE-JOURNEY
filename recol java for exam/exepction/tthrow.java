import java.util.Scanner;

class ageexepction extends Exception{
    ageexepction(String msg){
        super(msg);
    }
}
public class tthrow {

    public static int divide(int a,int b) throws ArithmeticException{
              int c=a/b;
              return c;
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter age:");
        int age=sc.nextInt();

        try {

            if(age<18){
                throw new ageexepction("you are not elegible for voting");
            }else{
                System.out.println("vote give sucessufully");
            }
           
        } catch (ageexepction r) {
             r.printStackTrace();
        }


        System.out.println("use throws keyword....");

        System.out.print("enter a:");
        int a=sc.nextInt();
        System.out.print("enter b:");
        int b=sc.nextInt();

        int c=divide(a,b);
        System.out.println("divide is="+c);

       

        System.out.println("end....................");


    }
}
