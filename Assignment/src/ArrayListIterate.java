import java.util.*;
class ArrayListIterate
{
  public static void main(String args[])
  {
    ArrayList<String> name=new ArrayList<String>();
    name.add("tapash");
    name.add("Akash");
    name.add("abinash");
    name.add("Rohit");
    name.add("rahul");
    name.add("Amit");
    System.out.println("this is not in iterate form= "+name);
    
  System.out.print("this is in iterate form= ");
    
    for(String a : name)
    {
    
      System.out.print( a+" ");
    }

  }
}