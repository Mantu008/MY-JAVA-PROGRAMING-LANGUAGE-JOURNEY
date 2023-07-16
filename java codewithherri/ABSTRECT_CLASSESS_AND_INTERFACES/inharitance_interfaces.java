interface father{
    void math1();
    void math2();
}

interface child extends father{
    void math3();
    void math4();
}

class sample implements child{
    public void math3(){
        System.out.println("hey i am  mantu of math3()");
    }
    public void math4(){
        System.out.println("hey i am  ashish of math4()");
    }
    public void math1(){
        System.out.println("hey i am  hari of math1()");
    }
    public void math2(){
        System.out.println("hey i am  yuvraj of math2()");
    }
    public void math6(){
        System.out.println("i am extra properties of child class");
    }
}
public class inharitance_interfaces {
    public static void main(String[] args) {
        sample s=new sample();
        s.math1();
        s.math2();
        s.math3();
        s.math4();
        s.math6();
    }
}
