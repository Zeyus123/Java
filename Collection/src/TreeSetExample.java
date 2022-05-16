import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Integer> name=new TreeSet<Integer>();
		name.add(54);
		name.add(545);
		name.add(23);
		name.add(8);
		name.add(53);
		System.out.println(name);
		
		System.out.println("the Greater number is = "+ name.pollLast());
		System.out.println("the Smallest number is = "+ name.pollFirst());
		System.out.println(name.isEmpty());
		System.out.println(name.equals(4));
		
		
		
		
//		for(String a: name)
//		{
//			System.out.print(a+"  ");
//		}
		
	
	}

}
