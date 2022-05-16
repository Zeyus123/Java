
import java.util.*;
class ArrayListRetrive
{
  public static void main(String args[])
  {
    ArrayList<String> name=new ArrayList<String>();
    name.add("tapash");
    name.add("akash");
    name.add("hari");
    name.add("amit");
    name.add("rahul");
    System.out.println(name);
    
   String s= name.get(1);
    System.out.print(s);
    
    
  }
}