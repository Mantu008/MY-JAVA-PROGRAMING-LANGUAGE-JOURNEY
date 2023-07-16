class rectangle{
    int l;
    int b;

    public int area(){
        return (l*b);
    }
    public int parimeter(){
        return 2*(l+b);
    }
}
public class q4p {
    public static void main(String[] args) {
       rectangle rc =new rectangle();
       
       rc.l=3;
       rc.b=5;

      int area=rc.area();
      int parimeter=rc.parimeter();

       System.out.println("the area of rectangle is="+area);
       System.out.println("the parimeter of rectangle is="+parimeter);
    }
}
