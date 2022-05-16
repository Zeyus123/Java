//import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListSwap {

	public static void main(String[] args) {
      LinkedList<String> name=new LinkedList<>();
		
		name.add("tapash");
		name.add("Akash");
		name.add("Hari");
		name.add("rahul");
		System.out.println(name);
		
		Collections.swap(name, 0, 2);
		System.out.println(name);
	}

}
