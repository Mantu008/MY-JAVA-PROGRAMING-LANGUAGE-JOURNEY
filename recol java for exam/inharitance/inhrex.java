class parent{
        public void meth1(){
            System.out.println("i am method of parent class");
        }
}

class child extends parent{
           public void meth2(){
            System.out.println("i am method of chile class");
           }
}

public class inhrex {
public static void main(String[] args) {
    child c=new child();

    c.meth1();
    c.meth2();
}
}
