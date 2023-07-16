import java.util.Scanner;
public class qq2 {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.print("enter n:");
        int n=num.nextInt();
         
        int i=1;
        do{
            System.out.println(i);
            i++;
        }while(i<=n);
    }
}
