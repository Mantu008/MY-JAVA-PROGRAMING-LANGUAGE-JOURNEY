abstract class pen{
    abstract void write();
    abstract void refil();
}
class me extends pen{
    void write(){
        System.out.println("you are writing from this pen");
    }
    void refil(){
        System.out.println("you are refiling the pen");
    }
    void changenib(){
        System.out.println("changing the nib");
    }
}
public class q1_2p {

    public static void main(String[] args) {

        me m=new me();
        m.write();
        m.refil();
        m.changenib();
    }
}