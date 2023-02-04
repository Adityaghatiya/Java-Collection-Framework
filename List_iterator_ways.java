import java.util.*;
import java.util.Arrays;
class List_iterator_ways{
public static void main(String args[])
{
    ArrayList <String> list=new ArrayList<String>();
    list.add("Aditya");
    list.add("Akshat");
    list.add("Akshit");
    list.add("Kshitij");

    
    ListIterator <String> l1= list.listIterator(list.size());

    while(l1.hasPrevious())
    {
        System.out.println(l1.previous());
    }

}
}