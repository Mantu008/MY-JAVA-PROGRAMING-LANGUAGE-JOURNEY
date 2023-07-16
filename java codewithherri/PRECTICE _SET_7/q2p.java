
public class q2p {
    static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=i;j>0;j--){
                System.out.print("*");
                 System.out.print(" ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {

        pattern(4);
    }
}
