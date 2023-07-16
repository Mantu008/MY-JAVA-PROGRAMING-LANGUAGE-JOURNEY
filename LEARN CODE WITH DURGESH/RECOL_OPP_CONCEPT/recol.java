
class person{

    person(int x){
        System.out.println("i am parametrise constructor");
    }

    person(){
        System.out.println("i am non parametrise constructor");
    }
    String name;
    int age;

    person(String name,int age){
        System.out.println("i am also a parameterise constructorr");
          this.name=name;
          this.age=age;
    }

    public void eat(){
        System.out.println(this.name+" is eating");
    }


    public void walk(){
        System.out.println(this.name+" is walking");
    }
    


    public void walk(int b){
        System.out.println(name+" is walking "+b+" steaps");
    }

    }
public class recol {

    public static void main(String[] args) {
        
       person p=new person();
       p.name="mantu";
       p.age=56;

       System.out.println("name of first person is:"+p.name);
       System.out.println("age of first person is:"+p.age);
       p.eat();
       p.walk();
       p.walk(40);

       


       System.out.println("__________________________________________");
        

       person p1=new person();
       p1.name="ashish";
       p1.age=90;

       System.out.println("name of second person is:"+p1.name);
       System.out.println("age of second person is:"+p1.age);
       p1.eat();
       p1.walk();
       p1.walk(67);



       System.out.println("___________________________");



       person p2=new person("vikram", 16);

       System.out.println("name of second person is:"+p2.name);
       System.out.println("age of second person is:"+p2.age);
       p2.eat();
       p2.walk();
       p2.walk(45);

       
       
    }
}
