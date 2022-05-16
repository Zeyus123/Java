package Exception;

class A
{
	void parent()
	{
		System.out.print("i am parent calss");
	}
}
class B extends A
{
	void parent()
	{
		System.out.print("I am child class");
	}
}

public class ClassCastException  {

	public static void main(String[] args) {
		
		
try {
	B s= (B) new A();
	s.parent();
}
catch(Exception e) {
	System.out.println("This is "+ e);
}
		
	}

}
