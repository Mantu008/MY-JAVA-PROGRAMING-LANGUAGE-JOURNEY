class monkey{
    void jump(){
          System.out.println("jump");
    }
    void bite(){
        System.out.println("bite");
    }
}
interface BasicAnimal{
      void eat();
      void sleep();
}
class human extends monkey implements BasicAnimal{
     public void eat(){
          System.out.println("eating");
     }
     public void sleep(){
        System.out.println("sleeping");
     }
     public void speak(){
        System.out.println("speaking");
     }
}
public class q3p {
    public static void main(String[] args) {
       human h=new human();

       h.jump();
       h.bite();
       h.eat();
       h.sleep();
       h.speak();

       System.out.println("");

       System.out.println("using polimorpisism to refrance monkey");

       monkey m=new human();        // using polymorphisim to refrance monkey
       m.bite();
       m.jump();
  //   m.sleep();                   // this is illigaal


        System.out.println("");
        System.out.println("polimorphism to refrance BasicAnimal");

        BasicAnimal b=new human();
        b.sleep();
        b.eat();
    //    b.speak();            //this is illigal
    //    b.jump();             //this is illigal

    }
}
