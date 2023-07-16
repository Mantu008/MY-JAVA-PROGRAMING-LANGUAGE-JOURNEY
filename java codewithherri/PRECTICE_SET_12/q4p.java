// package folder.folderl1.folderl2;

class calculator{
    public void calculate(int a,int b){
        System.out.println("addition is:"+ a+b);
    }
}

class sccalculator{
    public void calculate(int a,int b){
        System.out.println("addition is:"+ Math.sin(a+b));
    }
}


class hycalculator{
    public void calculate(int a,int b){
        System.out.println("addition is:"+ a+b);
        System.out.println("addition is:"+ Math.sin(a+b));
    }
}

 class C1 extends q4p{
    void q4p(){
        System.out.println(proint);
        System.out.println(defint);
    }
 }

public class q4p {
    protected int proint=4;
      int defint=38;
    public static void main(String[] args) {
        System.out.println("i am main mathod");
        C1 c=new C1();
    }
}
