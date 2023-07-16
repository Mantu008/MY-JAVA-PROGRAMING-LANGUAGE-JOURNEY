
public class constructor {
    int i;
    String j;
    constructor(int g){
        System.out.println("no argument user define constructor.....");
    }
    public static void main(String[] args) {

        constructor c=new constructor(2);
        c.i=7;
        c.i=88;
        c.j="mantu";
        c.j="ashish";
        System.out.println(c.i+" "+c.j);
    }
}
