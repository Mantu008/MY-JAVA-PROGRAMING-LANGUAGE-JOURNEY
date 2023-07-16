

class base{
    public int x;
    
    public int getX(){
        return x;
    }
    public void setX(int x){
        System.out.println("i am in base class and setting x now");
             this.x=x;
    }
    public void printMe(){
        System.out.println("i am a constructor");
    }
}

class drived extends base{
       
    public int y;

    public int getY(){
        return y;
    }
    public void setY(int y){
        System.out.println("i am in drived class and i setting y now");
        this.y=y;
    }
    public void add(){
        System.out.println("the addition of x and y is:"+ (x+y));
    }


}
public class Declare_Inharitance {
    public static void main(String[] args) {
        
        // creating object of base class
        base b=new base();
        b.setX(5);
        System.out.println("the value of x in base class="+b.getX());

       //creating object of drived class
       drived d=new drived();
       d.setX(69);
       System.out.println("the value of x in derived class="+d.getX());

       d.setY(77);
       System.out.println("the value of y in drived class="+d.getY());
       d.add();


    }
}
