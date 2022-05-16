
import java.util.*;
class ArrayListInsert1stPosition
{
  public static void main(String args[])
  {
    ArrayList<String> name=new ArrayList<>();
    name.add("tapash");
    name.add("akash");
    name.add("hari");
    name.add("rahul");
    name.add("rakesh");
    System.out.println(name);
    name.add(1,"amit");
    name.add(3,"bikash");
    System.out.print(name);
  }
}