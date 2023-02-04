import java.util.*;
public class Array_list_to_array{
    public static void main(String[] args)
    {
        List<String> fruitlist=new ArrayList<>();
        fruitlist.add("Mango");
        fruitlist.add("Banana");
        fruitlist.add("Guava");
        fruitlist.add("Watermellon");

        Iterator itr=fruitlist.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println("List="+fruitlist);
        String[] arr=fruitlist.toArray(new String[fruitlist.size()]);
        for(String s:arr)
        {
            System.out.print(s+" ");
        }

        List <String> l2=new ArrayList<>();
        l2=Arrays.asList(arr);
        System.out.println(l2);
    }
}