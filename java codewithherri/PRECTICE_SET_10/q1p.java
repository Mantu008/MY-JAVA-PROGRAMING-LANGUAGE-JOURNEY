class circle{
       public int r;

       circle(){
        System.out.println("i am a non paramater constructor of circle");
       }
       circle(int r){
        System.out.println("i am a constructor with parameter of circle:"+r);
        this.r=r;
       }
       public double area(){
        return Math.PI*this.r*this.r;
       }
}
 class cylender extends circle{
      public int h;

      cylender(){
        System.out.println("i am a constructro of cylender with not any parameter");
      }
      cylender(int r,int h){
        super(r);
        System.out.println("i am a constructor of cylender with parameter:radius "+r+" and hight "+h);
        this.h=h;
      }
      public double volume(){
        return Math.PI*this.r*this.r*this.h;
      }
 }
public class q1p {
    public static void main(String[] args) {
         cylender c=new cylender(5,6);

         System.out.println("the volium of cylender is:"+c.volume());
         System.out.println("the area of circle is:"+c.area());
    }
}
