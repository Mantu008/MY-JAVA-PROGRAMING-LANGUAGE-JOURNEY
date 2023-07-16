class  sphare{
    private int radius;

    public int  getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius=radius;
    }
    public double surfacearea(){
        return 4*Math.PI*radius*radius;
    }
    public double volume(){
        return 1.33*Math.PI*(radius*radius*radius);
    }

}
public class q5 {
    public static void main(String[] args) {
        sphare sp=new sphare();
        sp.setRadius(9);
        System.out.println("the radius of cylender is:"+sp.getRadius()); 
        System.out.println("the surface area of cylender is:"+sp.surfacearea()); 
        System.out.println("the volume of cylender is:"+sp.volume());
    }
}
