import java.util.*;

public class HashSetExample {
	public static void main(String[] args) {

		HashSet<String> color = new HashSet<String>();

		color.add("Red");
		color.add("Green");
		color.add("Black");
		color.add("White");
		color.add("123");
		color.add("Pink");
		color.add("Yellow");

		System.out.println("The Hash Set: " + color);
		
		for(String a:color)
		{
			System.out.print(a+" , ");
		}
	}
}
