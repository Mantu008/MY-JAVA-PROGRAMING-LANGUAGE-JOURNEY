
public class new_colling_methood {
      int logic(int x,int y){
        int z;
        if(x>y){
            z=x+y;
        }else{
            z=(x+y)*5;
        }
        return z;
    }
 public static void main(String[] args) {

    int a=8;
    int b=5;
    int c;
    new_colling_methood obj=new new_colling_methood();
    c=obj.logic(a,b);
    

    int a1=3;
    int b1=5;
    int c1;
    c1=obj.logic(a1,b1);

    System.out.println("the value of c is="+c);
    System.out.println("the value of c1 is="+c1);
    
 }    
}
