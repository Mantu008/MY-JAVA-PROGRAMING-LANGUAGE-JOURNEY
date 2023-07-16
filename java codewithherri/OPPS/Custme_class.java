class Employee{
    int id;                              //attributs 1  mantu;
    String name;                        //attributs 2 ashish;
    int salary;

    public void printdetail(){
        System.out.println("the employee id is:"+id);
        System.out.println("the employee name is:"+name);
        System.out.println("the employee salary is:"+salary);


    }

    public int getSalary(){
        return salary;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}
public class Custme_class {
    public static void main(String[] args) {
        System.out.println("this is my costum class");
        Employee mantu=new Employee();      //instantiating a new employee object
        Employee ashish=new Employee();

        //setting attributs for mantu:

        mantu.id=12;
        mantu.name="mantu kumar morya";
        mantu.salary=44;

        //setting attributs for ashish:

        ashish.id=13;
        ashish.name="Ashish kumar singh";
        ashish.salary=34;

        System.out.println("Employe name:"+mantu.name);
        System.out.println("Employe id:"+mantu.id);
        System.out.println("employee salary="+mantu.salary);

        System.out.println("Employe name:"+ashish.name);
        System.out.println("Employe id:"+ashish.id);
        System.out.println("employee salary="+ashish.salary);



        System.out.println("print detail using methood");
        mantu.printdetail();
        ashish.printdetail();



        System.out.println("print detail with class methood");

       int  salary=mantu.getSalary();
       int id=mantu.getId();
       String name=mantu.getName();

       System.out.println("salary of 1st employee is:"+salary);
       System.out.println("the id of 1st employee is:"+id);
       System.out.println("the name of 1st employee is:"+name);


       int  salary1=ashish.getSalary();
       int id1=ashish.getId();
       String name1=ashish.getName();
    
       System.out.println("salary of 2nd employee is:"+salary1);
       System.out.println("the id of 2nd employee is:"+id1);
       System.out.println("the name of 2nd employee is:"+name1);

    }
    
}
