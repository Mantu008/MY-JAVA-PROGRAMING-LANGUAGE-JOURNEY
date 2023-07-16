class loweragelimit extends Exception{
    loweragelimit(){
         super("this age is invalid");
       }
}
public class throw_throws {

   

    public static void meth1(int age) throws loweragelimit{

        if(age<18){
            throw new loweragelimit();
        }else{
            System.out.println("the age of the girl is:"+age);
        }
    }

    public static void meth2(int a,int b) throws ArithmeticException,NullPointerException{
               System.out.println(a/b);   
    }
    public static void main(String[] args) {
           int age=12;
           int a=8;
           int b=0;

            try {
                meth1(age);
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e);
            }

            try {
                meth2(a, b);
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e);
            }

    
    }
}
