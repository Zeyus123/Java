package Exception;

public class ArithmaticException {

	public static void main(String[] args)  {
		int a=30,b=0,c;
		try {
			c=a/b;
			System.out.println(c);
		}
		catch(Exception e){
			
			System.out.println("This is "+e);
		}
		
	}

}
