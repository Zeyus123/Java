package reverse;

public class who {

	public static void main(String[] args) {
		String inputStr="gogoagone";
	
		for(char i: inputStr.toCharArray())
		{
			if(inputStr.indexOf(i)==inputStr.lastIndexOf(i))
			{
				System.out.print("first non reapting character is : "+i);
				break;
			}
		}
	}

}
