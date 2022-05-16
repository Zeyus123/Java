//import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExample2 {

	public static void main(String[] args) {
		 
		LinkedList<Integer> s=new LinkedList<Integer>();
		// add element
		s.add(1);
		s.add(2);
		s.add(3);
		System.out.println(s);
		
		//get the specific index element
		
		int a=s.get(2);
		System.out.println(a);
		
		//add element in specific index
		s.add(1,5);
		System.out.println(s);
		
		//replace the specific index element
		s.set(2, 6);
		System.out.println(s);
		
		//remove element
		s.remove(0);
		System.out.println(s);
		
		//loop element
		for(int i=0;i<s.size();i++)
		{
			System.out.print(s.get(i));
		}
		System.out.println();
		
		//sorting
		
		Collections.sort(s);
		System.out.println(s);
		
		//size
		int b=s.size();
		System.out.println(b);
		
		
	}

}

