
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareString{
	public static void main(String[] arr) {
		List<String> list = new ArrayList<>();
		list.add("tapash");
		list.add("raju");
		list.add("Akash");
		list.add("Amit");
		System.out.println(list);
		Collections.sort(list);
		
		
		
		System.out.println(list);
	}

}
