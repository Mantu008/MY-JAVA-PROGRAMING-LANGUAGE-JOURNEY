import java.util.*;

public class x {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        int sub = a - b;
        int multi = a * b;
        float div = a / b;
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(multi);
        System.out.println(div);
    }
}