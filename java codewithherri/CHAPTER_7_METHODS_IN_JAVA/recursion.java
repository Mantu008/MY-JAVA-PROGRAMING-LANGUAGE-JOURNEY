public class recursion {
    static int fact(int n){
        int fact=1;
        if(n==0||n==1){
            return 1;
        }else{
            return n*fact(n-1);
        }
    }
    static int fact_ittrative(int n){
        if(n==0||n==1){
            return 1;
        }else{
            int product=1;
            for(int i=1;i<=n;i++){
                product *=i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
        System.out.println("the factorial of 5 is="+fact(5));
        System.out.println("the factorial of 4 is="+fact_ittrative(4));
        
    }
}
