class ractangle{
     int l;
     int b;

     public int getL(){
        return l;
     }
     public void setL(int l){
         this.l=l;
     }

     public int getB(){
        return b;
     }
     public void setB(int b){
         this.b=b;
     }


    //  ractangle(int l,int b){
    //     System.out.println("i am constructor of ractangle");        // using argument
    //       this.l=l;
    //       this.b=b;
    //  }

     public int area(){
        return l*b;
     }
}

class cuboid extends ractangle{
    int h;
    public int getH(){
        return b;
     }
     public void setH(int h){
         this.h=h;
     }

    //  cuboid(int l,int b,int h){                                 // using passing argument
    //     super(l,b);
    //     System.out.println("i am a conmstructor of cuboid");
    //     this.h=h;
    //  }

    public int volume(){
        return l*b*h;
    }

}

public class q2p {
public static void main(String[] args) {
    //  ractangle r=new ractangle(2,7);
    //  cuboid c= new cuboid(4, 5, 6);
    ractangle r=new ractangle();
     cuboid c= new cuboid();

     // set value for ractangle
     r.setL(3);
     r.setB(4);


     //set value for cuboid
     c.setL(8);
     c.setB(6);
     c.setH(2);

     System.out.println("the area of ractangle is:"+r.area());
     System.out.println("the area of ractangle through inharitance:"+c.area());
     System.out.println("the volume of ccuboid is:"+c.volume());

}
}
