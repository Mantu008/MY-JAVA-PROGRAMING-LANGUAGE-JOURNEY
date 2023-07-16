class circle{
    float r;
    float pi;

    public float area(){
         return pi*r*r;
    }
    public float parimeter(){
        return 2*pi*r;
    }
}
public class q6p {
    public static void main(String[] args) {
       
        circle cr=new circle();

        cr.r=5.7f;
        cr.pi=3.14f;

        float area=cr.area();
        float parimeter=cr.parimeter();

        System.out.println("the area of circle is="+area);
        System.out.println("the parimeter of circle is="+parimeter);
            
        }
    }

