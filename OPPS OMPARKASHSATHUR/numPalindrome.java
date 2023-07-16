import java.util.Scanner;
public class numPalindrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter number:");
        int num=sc.nextInt();
    
        int rev=0;
        int temp=num;
        int rem;

        while(temp!=0){
           rem=temp%10;
           rev=rev*10+rem;
           temp=temp/10;  
        }
        System.out.println("the reverce of given number is:"+rev);

        if(rev==num){
            System.out.println("given number is palindrome");
        }else{
            System.out.println("given number is not palindrome");
        }

    }
}
