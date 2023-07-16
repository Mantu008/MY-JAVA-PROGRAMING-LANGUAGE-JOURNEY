
class student{
    String name;
    int age;
    String city;


    student(){

    }


    student(String name,int age,String city){
              this.name=name;
              this.age=age;
              this.city=city;
    }

   
    public void printdata(){

              System.out.println("the name of the student is:"+name);
              System.out.println("the age of the student is:"+age);
              System.out.println("the city of the student is:"+city);
    }

    public void printdata(int x){

        System.out.println("this is overloded method.............");
        System.out.println(name);
        System.out.println(age);
        System.out.println(city);
    }


    public void info(String name){
                 System.out.println(name);
    }
    public void info(int age){
         System.out.println(age);
    }
    public void info(String name,int age,String city){
           System.out.println(name+" "+age+" "+city);
    }

}
public class exampleofclassobh {

    public static void main(String[] args) {


        student s4=new student();
        s4.info(66);
        s4.info("nitin");
        s4.info("shraya", 21, "mumbai");


        
        System.out.println("...................................");



         student s1=new student("mantu", 20, "gopalganj");
         s1.printdata();
         student s2=new student("hari", 22, "kuchaikot");
         s2.printdata();

         student s3=new student("ashish", 31, "nepal");
         s3.printdata(6);



        


    

    }
    
}