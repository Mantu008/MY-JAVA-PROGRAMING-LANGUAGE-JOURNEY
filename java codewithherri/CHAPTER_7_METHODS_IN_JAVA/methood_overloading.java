public class methood_overloading {
    static void foo(){
        System.out.println("hey mantu how are you");
    }
    static void foo(int a){
        System.out.println("hey good morning "+ a + " bro");
    } 
    static void foo(int a,int b){                                   //parameter is not actual (a,b,c,etc.)
        System.out.println("hey goog morning "+ a + " bro");
        System.out.println("hey good afternoon "+ b + " bro");
    }
    public static void main(String[] args) {
        foo();
        foo(7000);
        foo(5000,6000);        //argument is actual value (2,4,7,etc.)
    }
}
