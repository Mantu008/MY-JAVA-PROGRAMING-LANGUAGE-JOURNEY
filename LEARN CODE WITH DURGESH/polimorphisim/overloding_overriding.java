import java.time.Period;

class parent{
      public void hobby(){
        System.out.println("my hobby is playing hocky");
       }

       public void eat(){
              System.out.println("i am eating now");
       }
}
class child extends parent{
       public void hobby(){
              System.out.println("overriding hoby is playing cricket");
       }
       public void read(){
              System.out.println("i am reading now");
       }
}

public class overloding_overriding {
    public static void main(String[] args) {
         parent p= new parent();
         p.hobby();
         p.eat();

         System.out.println("");

         parent  p1=new child();
         p1.hobby();                           // here i am override mathod hobby();
         p1.eat();
       
           


    }
}
