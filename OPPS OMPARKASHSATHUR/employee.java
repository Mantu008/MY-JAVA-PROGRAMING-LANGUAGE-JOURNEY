
public class employee {
    String name;
    int code;
    int salary;
    
         employee(String name,int code,int salary){
    
            this.name=name;
            this.code=code;
            this.salary=salary;
         }

         public void printdatail(){

            if(salary>25000){
            System.out.println("name of the employee is:"+name);
            System.out.println("code of the employee is:"+code);
            System.out.println("salary of the employee is:"+salary);
            }else{
                System.out.println("your salary is not enought.....");
            }
         }
    public static void main(String[] args) {

        employee e1=new employee("mantu",100 , 40000);
        e1.printdatail();
        employee e2=new employee("ashish",101 , 35000);
        e2.printdatail();
        employee e3=new employee("hari",103, 50000);
        e3.printdatail();
        employee e4=new employee("yuvraj",104 , 22000);
        e4.printdatail();
        employee e5=new employee("vikram",105 , 15000);
        e5.printdatail();
        
    }
}
