import java.util.LinkedList;

public class LinkedListClone {

	public static void main(String[] args) {
		 LinkedList<String> name=new LinkedList<>();
		 name.add("tapash");
		 name.add("akash");
		 name.add("rahul");
		 name.add("amit");
		 System.out.println(name);
		 
		 LinkedList<String> copy=new LinkedList<>();
		 copy=(LinkedList) name.clone();
		 System.out.println(copy);
	}

}
