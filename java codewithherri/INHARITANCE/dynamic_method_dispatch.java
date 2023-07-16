class phone{
    public void on(){
        System.out.println("turn on the phone,,,,");
    }
    public void ring(){
        System.out.println("ringing the phone,,,,");
    }
}
class  smartphone extends phone{
       public void ring(){
        System.out.println("ringing the smartphone,,,");
       }
       public void music(){
        System.out.println("play music ,,,,,,");
       }

    }
      
public class dynamic_method_dispatch {

    public static void main(String[] args) {
        
        // phone obj=new phone();                  //it is allowed
        // smartphone obj2=new smartphone();
        // obj.ring();
        // obj2.ring();


        phone obj3=new smartphone();            //it is allowed(it is called dynamic mathod dispatch)

     //   smartphone obj4=new phone();            //it is not allowed

         
         obj3.ring();
         obj3.on();
         
    //   obj3.music();                        //it is not allowed


    }
}