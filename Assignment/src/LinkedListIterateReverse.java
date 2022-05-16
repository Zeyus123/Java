import java.util.LinkedList;

public class LinkedListIterateReverse {

	public static void main(String[] args) {
		 LinkedList<String> name=new LinkedList<>();
		 name.add("tapash");
		 name.add("akash");
		 name.add("rahul");
		 name.add("amit");
		 System.out.println("in normal order "+name);
		 
		 for(int i=name.size()-1;i>=0;i--)
		 {
			 System.out.print( name.get(i)+" ");
			 
		 }
		 
	}

}
