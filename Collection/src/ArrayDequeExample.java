import java.util.ArrayDeque;

public class ArrayDequeExample {

	public static void main(String[] args) {
		
	    ArrayDeque<String> Name=new ArrayDeque<>(); // FIFO
		   Name.push("Ankit");
		   Name.push("Ankush");
		   Name.push("Altaf");
		                                                     
		   System.out.println(Name);
		   Name.pop();
		   System.out.print(Name);
		    }


}
