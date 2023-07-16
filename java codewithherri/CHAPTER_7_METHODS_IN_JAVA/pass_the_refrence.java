public class pass_the_refrence {
    static void change(int a){
            a=98;
    }
    static void change2(int [] arr){
        arr[0]=67;
    }
    public static void main(String[] args) {
        
      //  case 1: changing the integer

        int x=45;
        change(x);                  //here we pass copy of x to method:
        System.out.println("the value of x after running change="+x);


      //  case 1: changing the integer

        int [] marks={58,76,34,75,25};
        change2(marks);                    // here we pass refrence of marks to method:
        System.out.println("the value of marks[0] aftter chenging="+marks[0]);



    }
}
