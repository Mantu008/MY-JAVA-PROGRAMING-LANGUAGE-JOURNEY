
public class shape {

    String name;
    String fuelcategory;
    int wheler;
    int cost;

    shape(String name,String fuelcategory ,int wheler,int cost){
               this.name=name;
               this.fuelcategory=fuelcategory;
               this.wheler=wheler;
               this.cost=cost;
    }
    public void printdata(){
             System.out.println("name of weachele:"+name);
             System.out.println("fuel category of weachele is:"+fuelcategory);
             System.out.println("whwlwr type:"+wheler);
             System.out.println("cost of the wehacle:"+cost);
    }
    public static void main(String[] args) {
         shape s1=new shape("suzuki","petrol",4,50000);
         s1.printdata();
       
    }
    
}