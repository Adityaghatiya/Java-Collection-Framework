import java.util.*;
class Linked_list1{
    public static void main(String args[])
    {
        LinkedList <String> l1=new LinkedList<String>();
        l1.add("Aditya");
        l1.add("Akshat");
        l1.add("Akshit");
        l1.add("Kshitij");

        System.out.println(l1);
        l1.addFirst("Palak");
        // l1.addLast(1);
         l1.remove("Naina");
        System.out.println("Adi");
        Iterator itr=l1.iterator();
        while(itr.hasNext())
        {
            System.out.println("Iterator way:-"+itr.next());
        }
 
        LinkedList <String>l2=new LinkedList<String>();
        l2.add("A");
        
        l1.addAll(l2);
         System.out.println(l1);
       
    }
}