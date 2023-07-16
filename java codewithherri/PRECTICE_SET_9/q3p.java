class cylinder{
    private int hight;
    private int radius;
  
     public cylinder(int hight,int radius){
         this.radius=radius;
         this.hight=hight;
     } 

    public int getHight(){
        return hight;
    }
    public void setHight(int hight){
        this.hight=hight;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius=radius;
    }
    public double surfacearea(){
        return 2*Math.PI*radius*radius+ 2*Math.PI*radius*hight;
    }
    public double volume(){
        return Math.PI*radius*radius*hight;
    }
}
public class q3p {
    public static void main(String[] args) {
        cylinder cl=new cylinder(12,9);
        System.out.println("the hight of cylinder is:"+cl.getHight());
        System.out.println("the radius of cylender is:"+cl.getRadius()); 
        System.out.println("the surface area of cylender is:"+cl.surfacearea()); 
        System.out.println("the volume of cylender is:"+cl.volume());
    }
}
