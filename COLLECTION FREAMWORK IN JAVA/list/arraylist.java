import java.util.*;


public class arraylist {

    public static void main(String[] args) {
    
        List<String> name=new ArrayList<>();

        name.add("mantu");
        name.add("ashish");
        name.add("nisha");
        System.out.println(name);
        name.add("anuj");                   //adding new element in array list
        System.out.println(name);   

        //we can add element at particular index using add(index,element);...................

        name.add(1,"nidhi");
        System.out.println(name);


         //we can replace element at particular index using set(index,element);...................

         name.set(2, "rakesh");
         System.out.println(name);


         //we can easily add araylist in another arraylist.............

         List<String> name1=new ArrayList<>();

         name1.add("rishi");
         name1.add("nirma");

         name.addAll(name1);
         System.out.println(name);

     //we can easily copy araylist in another void arraylist.............

         List<String> name2=new ArrayList<>();
         name2.addAll(name);
         System.out.println(name2);


    //getting value index wise................

    System.out.println(name2.get(5));
    System.out.println(name2.get(2));
    System.out.println(name2.get(0));


    
   //we can remove index element
    
    // name.remove("hari");

    name2.remove(4);                 // we can use both type to remove item from list
    System.out.println(name2);


    
 // returning size of arraylist.............

 System.out.println("size of arraylist is:"+name2.size());


  // check element is available or not in arraylist....

  System.out.println(name2.contains("mantu"));
  System.out.println(name2.contains("vikram"));


  // clear all element of arraylist ..........................

     name2.clear();
     System.out.println(name2);


    //check  the array list is empty or not...............

        System.out.println("empty status is:"+name2.isEmpty());
        name2.add("aditya");
        System.out.println(name2);
        System.out.println("empty status is:"+name2.isEmpty());     
        
        
    // ittrate all element of arraylist one by one............

    //1.ittrate using for-each loop

    System.out.println("__________________________________");
    
    for(String e:name){
        System.out.println(e);
    }

    System.out.println("__________________________________");

    //2. ittrate  using for loop

    for(int i=0;i<name.size();i++){
        System.out.println(name.get(i));
    }
    System.out.println("__________________________________");

    //3.ittrate using ittrator(forword ittrator)

    Iterator<String> itt= name.iterator();
        
    while(itt.hasNext()){
        System.out.println(itt.next());
    }
    System.out.println("__________________________________");

    
    //4.ittrate using listittrator(backword ittrator)

    ListIterator<String> itt2=name.listIterator(name.size());
       while(itt2.hasPrevious()){
        System.out.println(itt2.previous());
       }

     System.out.println("__________________________________");

     //5.traversing using for each-mathod()...

       name.forEach(e->{
      
        System.out.println(e);
  
       });
       
   
    }
}