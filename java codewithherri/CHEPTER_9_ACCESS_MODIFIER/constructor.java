
class MyEmployee{
    private int id;
    private String name;
    private int salary;

    public MyEmployee(){                             //first way to creat constructor
          id=67;
          name="ashish kumar singh";
          salary=40;
    }
 
    public MyEmployee(String name,int id,int salary){           //second way to creat constructor'
        this.id=id;
        this.name=name;
        this.salary=salary;
    }


    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getId(){
        return id;
    }
    public  void setId(int id){
               this.id= id;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary=salary;
   }
}

public class constructor {
    public static void main(String[] args) {
          MyEmployee mantu=new MyEmployee("mantu kumar morya",12,10);
          MyEmployee ashish=new MyEmployee();
          
          System.out.println("the name of first employee is:"+mantu.getName());
          System.out.println("the id of first employee is:"+mantu.getId());
          System.out.println("salary of first employee is:"+mantu.getSalary());

          System.out.println("the name of second employee is:"+ashish.getName());
          System.out.println("the id of second employee is:"+ashish.getId());
          System.out.println("the salary of second employee is:"+ashish.getSalary());
       
    }
}
