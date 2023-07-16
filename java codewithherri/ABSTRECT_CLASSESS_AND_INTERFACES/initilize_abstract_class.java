abstract class parant{
    parant(){
            System.out.println("i am a constructor of parent--");
       }
       public void sayHello(){
        System.out.println("Hello");

     }
      abstract void great();
      abstract void great2();
}

 class child1 extends parant{
       
    public void great(){
        System.out.println("good morning");
    }
    public void great2(){
        System.out.println("good afternoon");
    }
    public void great3(){                                         // extra mathod
        System.out.println("good night"); 
    }
   
}

 abstract class child2 extends parant{
    public void who(){
        System.out.println("i am mantu");
    }
}

class child3 extends child2{

    public void great(){
        System.out.println("hari");
    }
    public void great2(){
        System.out.println("ashish");
    }
}


public class initilize_abstract_class {
public static void main(String[] args) {
     
    // parant p=new parant();          //it is not possible because we cannot creat objectn using abstract class:
    // child2 c2=new child2();    

    child1 c1=new child1();

    c1.sayHello();
    c1.great();
    c1.great2();
    c1.great3();

    System.out.println("");

    child3 c2=new child3();
    c2.sayHello();
    c2.great();
    c2.great2();

}
    
}