
public class q3p {
    static int sum(int n){
            if(n==1){
                return 1;
            }else{
                return n+sum(n-1);
            }
        
    }
    public static void main(String[] args) {        
           System.out.println("the sum of first 5 natural number is:"+sum(5)); 
    }
}
