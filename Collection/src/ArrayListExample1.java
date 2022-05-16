import java.util.ArrayList;

public class ArrayListExample1 {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();

		name.add("tapashjhh");
		name.add("tapsh");
		name.add("akash");
		name.add("Amit");
		name.add("bishaw");
		System.out.println(name);
		name.add(1, "tapashjhh");
		System.out.println(name);
		name.remove(1);
		System.out.println(name);
		name.set(3, "tapashjhh");
		System.out.println(name);
		System.out.println(name.get(3));
		name.clear();
		System.out.println(name);

	}

}
