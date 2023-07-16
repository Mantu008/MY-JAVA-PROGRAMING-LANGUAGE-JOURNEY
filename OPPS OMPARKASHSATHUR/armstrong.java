import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        
       Scanner sc=new Scanner(System.in);
       System.out.print("enter num:");
       int n=sc.nextInt();

       int t1=n;
       int length=0;

       while(t1!=0){
        length=length+1;
        t1=t1/10;
       }

       int t2=n;
       int rem;
       int arm=0;

       while(t2!=0){      
        int mul=1;
           rem=t2%10;
           for(int i=0;i<length;i++){
                mul=mul*rem;
           }
           arm=arm+mul;
           t2=t2/10;
       }

       if(arm==n){
              System.out.println("number is armstrong......");
       }else{
        System.out.println("number is not armstrong...");
       }
       

    }
}
