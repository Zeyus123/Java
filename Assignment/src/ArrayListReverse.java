import java.util.ArrayList;

public class ArrayListReverse {
	public static void main(String args[])
	{
		ArrayList<String> name=new ArrayList<>();
		name.add("tapash");
		name.add("Akash");
		name.add("Amit");
		name.add("rocky");
		System.out.println(name);
		
		for(int i=name.size()-1;i>=0;i--)
		{
			System.out.print(name.get(i)+" ");
		}
	}

}
