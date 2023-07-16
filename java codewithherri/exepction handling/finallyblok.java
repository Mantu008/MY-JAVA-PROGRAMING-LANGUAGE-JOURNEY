
public class finallyblok {
    public static int great(){
        try {
            int a=50;
            int b=10;
            int c=a/b;
            return c;
           
        } catch (Exception e) {
            System.out.println(e);
        }finally{
            System.out.println("this is end of this function...");
        }
        return -1;
    }

    public static void main(String[] args) {
      
        int x=great();
        System.out.println("div is:"+x);


        System.out.println("");

        int s=10;
        int t=2;
        while(true){
            try {
                System.out.println("div of s/t is:"+s/t);
            } catch (Exception e) {
                  System.out.println("exepction found..");
                  System.out.println("the  exepction is:"+e.getMessage());
                  break;                                                        //first print finnaly block than break..
            }finally{ 
                   System.out.println("finally i am run....");
            }
            t--;
        }

        System.out.println("");



        try{
            System.out.println(4/0);                                          //try without catch .and yes this is walid java program...
        }finally{
            System.out.println("finally without catch.....");
        }



        

    }
}