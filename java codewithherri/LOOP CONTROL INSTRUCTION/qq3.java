import java.util.Scanner;
public class qq3 {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.print("enter n:");
        int num=n.nextInt();

        for( int i=0;i<num;i++){
            System.out.println(2*i+1);
        }
    }
}
