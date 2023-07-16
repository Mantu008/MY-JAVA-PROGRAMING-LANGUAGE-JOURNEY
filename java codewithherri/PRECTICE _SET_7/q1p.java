
public class q1p {
    static void multi(int n){
        int multiplication=0;
        for(int i=1;i<=10;i++){
            multiplication=i*n;
            System.out.printf("the multiplication table of %d X %d is=",n,i);
            System.out.println(multiplication);
        }
    }
    public static void main(String[] args) {
        multi(5);
    }
}
