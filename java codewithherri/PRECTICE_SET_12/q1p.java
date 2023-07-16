package calc;

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

public class q1p {
    public static void main(String[] args) {
        System.out.println("i am main mathod");
    }
}
