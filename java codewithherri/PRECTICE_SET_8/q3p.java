 
 class square{
    int side;
    public int area(){
        return side*side;
    }
    public int parimeter(){
        return 4*side;
    }
 }

public class q3p {
    public static void main(String[] args) {

        square sq=new square();
   
         sq.side=5;
         int area=sq.area();
         int parimeter=sq.parimeter();

         System.out.println("the area of the squre="+area);
         System.out.println("the parimeter of the squre="+parimeter);
        
    }
}
