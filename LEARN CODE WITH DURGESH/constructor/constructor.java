class student{
    int rno;
    float marks;
    String name;
    student(){
        System.out.println("i am constructor of non argument variable");
        this.name="ashish";
        this.rno=34;
        this.marks=33.5f;
    }
    student(int rno ,float marks,String name){  
        System.out.println("i am a constructor with argument variable");  
        this.name=name;
        this .rno=rno;
        this.marks=marks;  
    }

    public void printdetail(){
        System.out.println(name);
        System.out.println(marks);
        System.out.println( rno);
    }

    public void printdetail(int b){
        System.out.println(name);
        System.out.println(marks);
        System.out.println(rno);
    }
}
public class constructor {
    public static void main(String[] args) {

        student st1=new student(5,87.7f,"mantu");
        st1.printdetail();
           
        student st2=new student();
        System.out.println(st2.name);
        System.out.println(st2.rno);
        System.out.println(st2.marks);

    
         
    }
}
