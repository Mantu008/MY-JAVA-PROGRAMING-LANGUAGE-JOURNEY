class NegetiveRediusExepction extends Exception{

    public String getMessage(){
       return "NegetiveRediusExepction";
    }

    public String tostString(){
        return "NegetiveRediusExepction";
    }
}
public class throwThrows {

    public static double area(double r)throws NegetiveRediusExepction{

        if(r<0){
            throw new NegetiveRediusExepction();
        }
           double ans=Math.PI*r*r;
           return ans;

    }

    public static int div(int a,int b)throws ArithmeticException{

        if(b==0){
            throw new ArithmeticException();
        }
        
        int c=a/b;
        return c;
 }


    public static void main(String[] args) {


        try {
            double x=area(-2);
            System.out.println("area of circle is:"+x);
        } catch (NegetiveRediusExepction e) {
            // TODO: handle exception

            System.out.println("genereted exepction is:"+e);
        }


        try {
            int c=div(3, 0);
            System.out.println(c);
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("genereted exepction is:"+e);
        }
        
    }
}
