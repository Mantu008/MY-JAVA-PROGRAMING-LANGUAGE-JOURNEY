import java.util.Scanner;

class negetiveradiousexepction extends Exception{
    public String getMessage(){
        return "radius cannot be negative";
    }
}
public class throwAndThrows{

    public static int div(int a, int b) throws ArithmeticException{
          int result=a/b;
          return result;
    }

    public static double area(int r) throws negetiveradiousexepction{
        if(r<0){
             throw new negetiveradiousexepction();
        }
        double result = (Math.PI*r*r);
        return result;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("enter a:");
        int a=sc.nextInt();
        System.out.print("enter b:");
        int b=sc.nextInt();


      try{
        int c=div(a, b);
        System.out.println("the division is:"+c);
      }catch(ArithmeticException  e){
        System.out.println("geting exepction 1");
        System.out.println("the exepction is:"+e.getMessage());
      }finally{
          System.out.println("i am finally block of division mathod");
      }

      
      System.out.print("enter r:");
      int r= sc.nextInt();
      try {
        double z=area(r);
        System.out.println("area is:"+z);
        
      } catch (negetiveradiousexepction  e) {
              System.out.println("throw an exepction 2");
              System.out.println("the exepction is:"+e.getMessage());
      }finally{
        System.out.println("i am finally block of area mathod");
      }

   

    }
}
