

class base1{
         base1(){
        System.out.println("i am a constructor of base class");
    }
         base1(int a){
        System.out.println("i am overloded constructor with value of a as:"+a);
    }
}
class drived1 extends base1{
           drived1(){
      //  super(4);
        System.out.println("i am also a constroctor of drived class");
    }
      drived1(int a,int b){
        super(a);
        System.out.println("i am overloded constructor of drived class with value of b as:"+b);
    }
}

class child extends drived1{
         
    child(){
        System.out.println("i am child of overloded constructr");
    }
    child(int a, int b,int c){
             super(a,b);
        System.out.println("i am child overloded constructor with value c as:"+c);     
    }
}


public class constructor_in_inharitance {
    public static void main(String[] args) {

        //  base1 b=new base1();
        // drived1 d=new drived1();
        child cd=new child(3,6,7);
        
        
   }
}
