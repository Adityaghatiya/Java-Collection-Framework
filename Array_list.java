import java.util.*;
import java.util.Arrays;
class Array_list{
public static void main(String args[])
{
    ArrayList <String> list=new ArrayList<String>();
    list.add("Aditya");
    list.add("Akshat");
    list.add("Akshit");
    list.add("Adi");

    
      Iterator <String> itr=list.iterator();//getting the Iterator  
    while(itr.hasNext()){//check if iterator has the elements  
    System.out.println(itr.next());
    }

 Collections.sort(list);
 for(String arr:list)
 {
    System.out.println(arr);
 }

}
}