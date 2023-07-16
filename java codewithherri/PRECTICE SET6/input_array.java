import java.util.Scanner;
public class input_array {
    public static void main(String[] args) {
        int s=8;
         Scanner n=new Scanner(System.in);
          int [] arr=new int[8];
         for(int i=0;i<s;i++){   
             System.out.printf("enter arr[%d]=",i);
             arr[i]=n.nextInt();
         }
         System.out.print("the input array is:");
         for(int i=0;i<s;i++)
         {
            System.out.print(arr[i]);
            System.out.print(" ");
         }
    }
}
