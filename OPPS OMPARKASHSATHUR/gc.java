import java.util.Scanner;
public class gc {
    private int count;

              gc(int count){
                this.count=count;
              }

        public void finalize(){
            count-=1;
            System.out.println("decrementingh value of count is:"+count);
        }
    public static void main(String[] args) {
        int count;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter count 1:");
        count=sc.nextInt();
        gc g1=new gc(count);

        System.out.print("enter count 2:");
        count=sc.nextInt();
        gc g2=new gc(count);

        System.out.println("value of count 1 before decrement:"+g1.count);
        g1=null;
        System.gc();

        System.out.println("value of count 2 before decrement:"+g2.count);
        g2=null;
        System.gc();
    }
}
