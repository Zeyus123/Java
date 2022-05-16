import java.util.LinkedList;

public class LinkedListPositionElement {

	public static void main(String[] args) {
		LinkedList<String> name=new LinkedList<>();
		
		name.add("tapash");
		name.add("Akash");
		name.add("Hari");
		name.add("rahul");
		System.out.println(name);
		
		for(int i=0;i<=name.size()-1;i++)
		{
			System.out.println("in the index number"+" " +i+ " "+"=" + " "+ name.get(i));
		}
	}

}
