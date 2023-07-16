

class parent{

    parent(){
        System.out.println("go");
    }
       
    public void  hobby(){
        System.out.println("hocky");
    }
    public void eat(){
        System.out.println("eating");
    }
    public void sleep(){
        System.out.println("sleeping");
    }

}
class child extends parent{



    public void  hobby(){
        System.out.print("Override hobby is:");
        System.out.println("cricket");
    }
    public void read(){
        System.out.println("reading");
    }
    public void game(){
        System.out.println("paying game");
    }


}
public class overriding {
public static void main(String[] args) {
      
    child c=new child();

    c.hobby();                     // here the hobby of child is override , that is called mathod overriding:
    c.sleep();
    c.eat();
    c.game();
    c.read();

}
    
}