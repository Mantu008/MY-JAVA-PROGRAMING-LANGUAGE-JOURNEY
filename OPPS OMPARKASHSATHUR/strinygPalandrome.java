import java.util.Scanner;
public class strinygPalandrome {

    public static void main(String[] args) {
      
        Scanner sc =new Scanner(System.in);
        System.out.print("enter string:");
        String str1=sc.nextLine();
        
         String str2="";
        for(int i=str1.length()-1;i>=0;i--){
              str2=str2+str1.charAt(i);
        }

        System.out.println("the reverce of given string is:"+str2);

        if(str1.equals(str2)){
            System.out.println(str1+":is palandrome string");
        }else{
            System.out.println(str1+":is not palindrome string");
        }
          
          
        
    }
}