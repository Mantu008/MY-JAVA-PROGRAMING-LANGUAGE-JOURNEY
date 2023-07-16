
class person{

    String name;
    int age;

    public void eat(){
        System.out.println(this.name+" is eating");
    }
    public void walk(){
        System.out.println(this.name+" is walking");
    }
}

class devloper extends person{
               
    public void creat(){
        System.out.println("hey my name is: "+ super.name+" and i am creating an aplication");
    }



    
}


public class inharitance {
    public static void main(String[] args) {
        devloper d=new devloper();
        d.name="mantu";
        d.creat();
        d.eat();
        d.walk();

 // we do polimorphism at at run time creating object like below
      
      person d1=new devloper();    
      d1.eat();
      d1.walk();
//    d1.creat();    // this throw error because we creat objet only refrecce to person so only person method will calll in this situation.

// here we creat object to devloper to taking refrence person so that type of object creating is called run time polymorphysim 
    }
}
