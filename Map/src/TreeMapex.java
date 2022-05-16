
import java.util.*;

public class TreeMapex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer>tree=new TreeMap<>();

		//inserting Elements
		tree.put("Amar", 234);
		tree.put("Vasu", 134);
		tree.put("Rama", 453);
		tree.put("Shyam", 653);
		tree.put("Banita", 908);
		tree.put("Aruna", 908);
		tree.put("Muna", 908);
		tree.put("Juli", 908);
		System.out.println(tree);
		
		
		System.out.println(((TreeMap<String, Integer>) tree).descendingMap());
		
		System.out.println(((TreeMap<String, Integer>) tree).headMap("Rama",true));

		System.out.println(((TreeMap<String, Integer>) tree).tailMap("Banita",true));
}

}
