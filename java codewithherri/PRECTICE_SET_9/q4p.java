class ractangle{
    private int length;
    private int breadth;
   
    public ractangle(){
        length=4;
        breadth=5;
    }
    public int getLength(){
        return length;
    }
    public int getbreadth(){
        return breadth;
    }
}
public class q4p {
    public static void main(String[] args) {
        ractangle rc =new ractangle();
        System.out.println("the length of ractangle is:"+rc.getLength());
        System.out.println("the breadth of ractangle is:"+rc.getbreadth());

    }   
}