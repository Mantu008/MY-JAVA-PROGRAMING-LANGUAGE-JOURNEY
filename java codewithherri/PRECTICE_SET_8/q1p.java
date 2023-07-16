class Employee{
    int id;
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
}
 
   

public class q1p {
    public static void main(String[] args) {
        
        Employee mantu=new Employee();
        mantu.setName("mantu kumar");
        mantu.id=101;
        mantu.salary=55;
        System.out.println("The name of employee is:"+mantu.getName());
        System.out.println("the id of employee is:"+mantu.getId());
        System.out.println("the salary of employee is:"+mantu.getSalary());
    }
}
