
abstract class bikestr{
    public void horn(){
        System.out.println("pi..pi..pi..pi");
    }
    abstract public void speed();
    abstract public void gair();
}

class bike extends bikestr{
     public void speed(){
      System.out.println("sprrd is 100 KMPH");
    }
    public void gair(){
           System.out.println("gair of bike is 5");
    }

    public void oil(){
        System.out.println("oil type is [patrol]");
    }
}



 interface carstrone{
     public void sped();
     public void  roof();
     public void  mode();
}

interface carstrtwo{

    public void ac();
    public void camara();
    public void  location();

}



class car implements carstrone,carstrtwo{
     
    public void sped(){
        System.out.println("speed is 200 KMPH");
    }
    public void roof(){
        System.out.println("open the roof of car");
    }

    public void mode(){
        System.out.println("at that time the car is in sport mode");
    }

    public void ac(){
        System.out.println("turn on the ac");
    }
    public void camara(){
        System.out.println("start back camara for parking");
    }
    public void  location(){
        System.out.println("turn on the location");
    }

}

public class abstractclassandinterface {
   
    public static void main(String[] args) {
         bike b=new bike();

         b.speed();
         b.gair();
         b.oil();
         b.horn();


         car c=new car();

         c.sped();
         c.roof();
         c.mode();
         c.ac();
         c.camara();
         c.location();
    }
    
}