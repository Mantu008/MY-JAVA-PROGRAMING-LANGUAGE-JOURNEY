
import java.awt.*;

public class MyFrame {

    // MyFrame(String s){
    //      super(s);
    //      setSize(400,400);
    //      setVisible(true);
    // }

     Frame f;

     MyFrame(String s){
          f=new Frame(s);
          f.setSize(400, 400);
          f.setVisible(true);
     }

public static void main(String[] args) {
    new MyFrame("mantu");
    new MyFrame("hari");
}
    
}