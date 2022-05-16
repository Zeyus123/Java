//import java.util.LinkedList;
import java.util.Stack;

public class StackExample1 {

	public static void main(String[] args) {
		Stack<String> name=new Stack<>();
		name.push("tapash");
		name.push("akash");
		System.out.println(name);
		name.push("amit");
		name.push("biswa");
		System.out.println(name);
		name.pop();
		System.out.println(name);
		name.pop();
		System.out.println(name);
		name.peek();
		System.out.println(name.peek());
		
	}

}
