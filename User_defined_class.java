import java.util.*;
class User_{
   int name;
   int s_num;
   int marks;
   
   User_(int name,int s_num,int marks )
   {
    this.name=name;
    this.s_num=s_num;
    this.marks=marks;
   }
   
}
class User_defined_class{
    public static void main(String args[])
    {
        User_ u1=new User_(01,1,77);
          User_ u2=new User_(02,1,77);
            User_ u3=new User_(03,1,77);
        ArrayList <User_> al=new ArrayList<User_>();
        Scanner sc=new Scanner(System.in);
        al.add(u1);
        al.add(u2);
        al.add(u3);

        Iterator itr= al.iterator();
        while(itr.hasNext())
        {
            int s=(User_)itr.next();
            System.out.println(s.name+" "+s.s_num+" "+s.marks);

        }

        ArrayList<Integer> l=new ArrayList<Integer>();
        al.add

    }
}