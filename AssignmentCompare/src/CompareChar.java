import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareChar {

	public static void main(String[] args) {
		List<Character> name=new ArrayList<>();
		name.add('A');
		name.add('E');
		name.add('B');
		name.add('F');
		name.add('C');
		name.add('G');
		name.add('D');
		System.out.println(name);
		Collections.sort(name);
		
		System.out.println(name);
		

	}

}
