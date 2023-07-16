import java.util.*;

public class employee2p{
    String name;
    int code;
    int salary;
    
        public void getdatail(String name, int code,int salary){
            this.name=name;
            this.code=code;
            this.salary=salary;
        }

         public void printdatail(){

            if(salary>25000){
            System.out.println("name of the employee is:"+name);
            System.out.println("code of the employee is:"+code);
            System.out.println("salary of the employee is:"+salary);
            }
         }
    public static void main(String[] args) {
  
        employee2p []  arr= new employee2p[5];
       
        

        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.print("enter name:");
            String name=sc.next();
            System.out.print("enter code:");
            int code=sc.nextInt();
            System.out.print("enter salary:");
            int salary=sc.nextInt();
            arr[i]=new employee2p();            
            arr[i].getdatail(name, code, salary);          

        }

        for(int i=0;i<5;i++){
            
            arr[i].printdatail();
            
        }

    


   
        
    }
}
