import java.util.Scanner;

class maxretriesexepction extends Exception{
    public String getMessage() {

            return "max  retries is 5.........";
        
    }
}
public class q5p {

         public static void bound() throws maxretriesexepction{
                       throw new maxretriesexepction();                
         }
    public static void main(String[] args) {
        int marks []=new int [7];
        Scanner sc= new Scanner(System.in);
        boolean b= true;
        
        marks[0]=56;
        marks[1]=78;
        marks[2]=34;
        marks[3]=88;
        marks[4]=73;
        marks[5]=94;
        marks[6]=63;
  
        int i=1;
        while(b && i<=5){                
            System.out.print("enter marks index:");
            int n=sc.nextInt();      
            try {
                System.out.println("marks according to index is:"+marks[n]);
                b=false;
                
            } catch (Exception e) {
              System.out.println("invalid index....");
              System.out.println("the exepction is:"+e.getMessage());
              i++;
            } 
            if(i>5){
                   try {
                          bound();
                   } catch (maxretriesexepction e) {
                     System.out.println(e.getMessage());
                   }
            }
               

           
        }
    }
}
