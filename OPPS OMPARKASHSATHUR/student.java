import java.util.Scanner;

public class student {

    String name;
    int age;
    String city;

    public void getdata(String name,int age,String city){
        this.name=name;
        this.age=age;
        this.city=city;

    }
     public void printdata(){

        if(age>=18){
        System.out.println("name of the student is:"+name);
        System.out.println("age of the student is:"+age);
        System.out.println("city of the student is:"+city);
        }

     }
 public static void main(String[] args) {
    
    student [] s=new student[5];
     Scanner sc=new Scanner(System.in);
     for(int i=0;i<5;i++){
        System.out.print("enter name:");
        String name=sc.next();
        System.out.print("enter age:");
        int age=sc.nextInt();
        System.out.print("enter city:");
        String city=sc.next();
        s[i]=new student();
        s[i].getdata(name, age, city);
     }

     System.out.println("---------------------------------------");

     for(int i=0;i<5;i++){

        s[i].printdata();

     }

 }    
}