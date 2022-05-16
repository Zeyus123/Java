import java.util.HashMap;
import java.util.Map;

public class HashExample {
	public static void main(String[] args) {
		Map<String, String> name=new HashMap<>();
		name.put("name", "tapash");
		name.put("age", "25");
		name.put("city", "banglore");
		
		System.out.println(name.keySet());
		System.out.println(name.values());
		
		System.out.println(name.containsKey("city"));
		
		System.out.println(name);
		System.out.println(name.get("age"));
		
		name.remove("city");
		System.out.println(name.get("age"));
		
		
	}

}
