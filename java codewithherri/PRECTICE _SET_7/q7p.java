public class q7p {
    static void pattern(int n){
        if(n>0){ 
            for(int i=n;i>0;i--){
                System.out.print("* ");
            }
           
            System.out.println("");
            pattern(n-1);
        } 
    }
    public static void main(String[] args) {
                  pattern(5);
    }
}
