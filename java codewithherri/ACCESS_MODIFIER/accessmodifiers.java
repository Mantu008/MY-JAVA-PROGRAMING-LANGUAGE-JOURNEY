

class c1{
    public int x=8;
    private int y=67;
    protected int z=45;
    int a=6;

    public void math1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
 
public class accessmodifiers {
    public static void main(String[] args) {
        c1 C1=new c1();
        System.out.println("using class we can acess");
        C1.math1();

        System.out.println("using package we can acess");
        System.out.println(C1.x);
        // System.out.println(C1.y);                 // throw an error because variable y is private
        System.out.println(C1.z);
        System.out.println(C1.a);

    }
}
