public class q5p {
    static int fibo(int n){
      if(n==1){
        return 0;
      }else if(n==2){
        return 1;
      }else{
        return fibo(n-1)+fibo(n-2);
      }
    }
    public static void main(String[] args) {
        int result=fibo(8);
         System.out.println( "nth number of fibonachiseries is:"+result);
    }
}
