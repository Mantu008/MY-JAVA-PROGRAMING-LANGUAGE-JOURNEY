class A{
    int a;
    public int getA(){
        return a;
    }
    public void setA(int a){
       this.a=a;
    }
    public int mat1(){
        return a;
    }
    public void mat2(){
        System.out.println("i am mathod 2 of class A");
    }
}
class B extends A{
        public void mat2(){
            System.out.println("i am mathod 2 of class B");
        }
        public void mat3(){
            System.out.println("i am method 3 of class B");
        }
}
public class method_overriding {

    public static void main(String[] args) {
    
        A a= new A();
        a.setA(5);
        System.out.println("the returning value of method a is:"+a.mat1());
        a.mat2();

        B b= new B();
        b.setA(6);
        b.mat2();
        b.mat3();
        System.out.println("the returning value of mathod a using inharitance is:"+b.mat1());

        System.out.println("");

        A c=new B();
        c.setA(8);
        System.out.println(c.mat1());
        c.mat2();
        
    }
}