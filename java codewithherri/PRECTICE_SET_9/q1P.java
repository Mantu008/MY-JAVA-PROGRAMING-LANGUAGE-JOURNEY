
class cylinder{
    private int hight;
    private int radius;

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
}
public class q1P {
    public static void main(String[] args) {
       cylinder cl=new cylinder();
        cl.setHight(10);
        cl.setRadius(13);
        System.out.println("the hight of cylinder is:"+cl.getHight());
        System.out.println("the radius of cylender is:"+cl.getRadius());
    }
}
