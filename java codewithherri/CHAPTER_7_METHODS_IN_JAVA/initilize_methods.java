
public class initilize_methods {
    static int logic(int x,int y){
        int z;

        if(x>y){
            z=x+y;
        }else{
            z=(x+y)*5;
        }
            x=787;                                //here changing the value of x:
            System.out.println("updated value of x is:"+x);
        return z;
   
    }
 public static void main(String[] args) {

    int a=8;
    int b=5;
    int c;
    c=logic(a,b);
    System.out.println(a+" "+b);                  //here value of a is not change after change the value of x because here x is copy of a;;


    int a1=3;
    int b1=5;
    int c1;
    c1=logic(a1,b1);
    System.out.println(a1+" "+b1);


    System.out.println("the value of c is="+c);
    System.out.println("the value of c1 is="+c1);
    System.out.println(a1);

 }    
}
