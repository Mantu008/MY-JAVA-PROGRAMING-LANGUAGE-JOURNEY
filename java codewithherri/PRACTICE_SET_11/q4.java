
 abstract class TeliPhon{
     abstract void ring();
     abstract void light();
     abstract void disconnect();

}
 
class SmartTeliphone extends TeliPhon{
    void ring(){
        System.out.println("ringing......");
      }
      void  light(){
            System.out.println("lighting....");
       }
       void disconnect(){
        System.out.println("Disconnect....");
       }
       void calling(){
        System.out.println("calling....");
       }
}
public class q4 {
    public static void main(String[] args) {

    TeliPhon t= new SmartTeliphone();

    t.ring();
    t.light();
    t.disconnect();
//  t.calling();                 //this is illigal
    

    }
}
