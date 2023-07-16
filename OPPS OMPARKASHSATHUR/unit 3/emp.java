

public class emp {
    String name;
    int id;

    emp(String name,int id){
        this.name=name;
        this.id=id;
    }

    public void print(){
          System.out.println("name is:"+name); 
          System.out.println("id is:"+id);  
    }
    public static void main(String[] args) {

        emp e1=new emp("mantu",101);
        e1.print();
        emp e2=new emp("ashish",102);
       e1.print();

        
    }
}
