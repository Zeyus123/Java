import java.util.*;
public class ArrayListExampleString {

	public static void main(String[] args) {
		 
		ArrayList<String> s=new ArrayList<>();
		
		// add element
		s.add("tapash");
		s.add("akash");
		s.add("amit");
		s.add("suraj");
		s.add("hari");
		s.add("saroj");
		
		System.out.println(s);
		
		//remove element
		s.remove(3);
		System.out.println(s);
		
		//replace element
		s.set(2,"helow");
		System.out.println(s);
		
		//get the specific element
		
		String a=s.get(1);
		System.out.println(a);
		
		//size of the index
		int b=s.size();
		System.out.println(b);
		
		//loop
		for(int i=0;i<s.size();i++)
		{
			System.out.print(s.get(i)+" ");
		}
		System.out.println();
		
		//sort
		Collections.sort(s);
		System.out.println(s);
				
	}

}
