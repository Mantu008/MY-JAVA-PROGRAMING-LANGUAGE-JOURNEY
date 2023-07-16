
public class tryCatch {
    public static void main(String[] args) {


        System.out.println("starting program...");

        
        int a=68768;
        int b=0;


        
      
        try {
            int c=a/b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.print("we fail to divide ... reasion:-");
            System.out.println(e.getMessage());
        }



        System.out.println("end of the program...");
        
      

    }
}
