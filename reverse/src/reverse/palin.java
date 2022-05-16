package reverse;

public class palin {

	public static void main(String[] args) {
	    String s="tapapat";
		int i=0,j=s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j))
			{
				System.out.print("string is not palindream");
				System.exit(0);
				break;
			}
			i++;
			j--;
			}
		System.out.print("palindream");
		}
}
