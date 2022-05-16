import java.util.HashSet;
import java.util.Iterator;

public class Practice1 {

	public static void main(String[] args) {
		HashSet<String> name=new HashSet<String>();
		name.add("tapash");
		name.add("Akash");
		name.add("Abinash");
		name.add("Rahul");
		name.add("Hari");
		System.out.println(name);
		
		      	
				Iterator<String> iter = name.iterator();
				while (iter.hasNext()) {
				 String curr = iter.next();
				 System.out.println(curr);
				 
				}
			
	}

}
