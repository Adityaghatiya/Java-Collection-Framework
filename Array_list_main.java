import java.util.*;
class Array_list_main{
    public static void main(String args[])
    {
        // ArrayList <String> list=new ArrayList <String> (); ArrayList<String> list=new ArrayList<String>();//Creating arraylist   
         ArrayList<String> list=new ArrayList<String>();//Creating arraylist   
        list.add("Aditya");
        list.add("Akshat");
        list.add("Akshit");
        list.add("Pratik");
        System.out.println("Getting one element:"+list);
        System.out.println("Getting one elment"+list.get(2));
        list.set(2,"Naina");
        // Using iterator method
        Iterator <String > itr=list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        ArrayList<String> list1=new ArrayList<String>();
        list1.add("Priya"); 
        list1.add("Arpita"); 
        list1.add("Palak"); 
        list1.add("Alvira"); 
        list1.add("Nandini"); 
        System.out.println(list1);
        for(String name:list1)
        {
            System.out.println(name);
        }
        ListIterator <String> ltr=list.listIterator(list.size());
        while(ltr.hasPrevious())
        {
            System.out.println("This is the use of ListIterator:"+ltr.previous());
        }
        // Transverse using for loop
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
        // For each method
        list.forEach(a->{ //Here, we are using lambda expression  
                System.out.println(a);  
        });
    }
}