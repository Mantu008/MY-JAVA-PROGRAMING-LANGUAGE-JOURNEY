
public class constructor {

    int id;
    String name;

        constructor(){
            System.out.println("this is non parametrize constructor");
        }
        constructor(int id,String name){

           System.out.println("this is  parametrize constructor");

           this.id=id;
           this.name=name;

        }
        constructor(String naem,int id){

             System.out.println("this is  parametrize constructor");

              this.id=id;
              this.name=name;

        }

        public void detail(){
            System.out.println("name is:"+name);
            System.out.println("id is:"+id);
        }
  public static void main(String[] args) {

    constructor s1=new constructor();
    constructor s2=new constructor(10,"mantu");
    constructor s3=new constructor("ashish",101);

    s1.detail();;
    s2.detail();
    s3.detail();
    
    
  }  
}