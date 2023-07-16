
public class q10p {
    static int sum(int n){
          int sum=0;
            for(int i=1;i<=n;i++){
                 sum=sum+i;
            }
            return sum;
        
    }
    public static void main(String[] args) {        
           System.out.println("the sum of first 5 natural number is:"+sum(5)); 
    }
}
