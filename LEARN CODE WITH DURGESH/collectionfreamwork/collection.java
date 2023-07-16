import java.util.*;

public class collection {
public static void main(String[] args) {
    
// type safe collection  ..................

   ArrayList<String>name=new ArrayList<>();     //we cannot asign diff type of variable only assign sam as declare

   /* order preserved
      indexed collection 
      dublicate are allowed
    */

   name.add("mantu");
   name.add("hari");
// name.add(676);                           //it is throw a eror because variable is different
   name.add("ashish");
   name.add("neha");
   name.add("vikram");

 System.out.println(name);                     // it is use to print all list member if it is present

 //for geting eliment index wise

// System.out.println(name.get(0));
// System.out.println(name.get(1));
// System.out.println(name.get(2));
// System.out.println(name.get(3));
// System.out.println(name.get(4));
//System.out.println(name.get(5));            // throw an eroe because index out of bound:----


//we can remove index value

// name.remove("hari");              // we can use both type to remove item from list
 name.remove(4);
 System.out.println(name);


 // returning size 
 System.out.println("size of list is:"+name.size());


 // check item is available or not....

  System.out.println(name.contains("mantu"));
  System.out.println(name.contains("vikram"));


  //check  for empty

  System.out.println("empty status is:"+name.isEmpty());



  //setting value....

// name.set(1, "nidhi");                  //it is use for remove and set insted of index
 
  name.add(1, "nidhi");     //it is use for add value to given index and old value is sift forward index
  System.out.println(name);

//   // clear all element

//   name.clear();
//   System.out.println(name);


  //creat vactor  and copy all element in vactor

  Vector<String>name1=new Vector<>();
  name1.addAll(name);
  System.out.println("name1:"+name1);




  System.out.println("---------------------------------------------------------------------------------");

  //creat hasset

  HashSet<Double> nms=new HashSet<>();

  nms.add(11.345678);  
  nms.add(13.789101112);
  nms.add(15.910112);
  nms.add(18.234344);
  nms.add(20.564489);
  nms.add(11.345678);       // duplicate are not allowed

  System.out.println(nms);    //order not preserved


  // creat treeset

  TreeSet<Double>nms1=new TreeSet<>();     //sorted element
  nms1.addAll(nms);
  
  nms1.add(5.8);
  nms.add(8.3);

  System.out.println(nms1);  












System.out.println("");




// //un type safe..............

//    LinkedList list =new LinkedList<>();
//    list.add("mantu");
//    list.add(18);
//    list.add("1st sem");
//    list.add(8.5);

//    System.out.println(list);
//    System.out.println(list.get(0));
//    System.out.println(list.get(1));
//    System.out.println(list.get(2));
//    System.out.println(list.get(3));





}

}