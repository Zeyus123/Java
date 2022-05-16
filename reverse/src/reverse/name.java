package reverse;

abstract class flower
{
	public abstract void sound();
	
}

class rose extends flower
{
	 public void sound()
	{
		System.out.println("dog is barking");
	}
}

class leaf extends flower
{
	public void sound()
	{
		System.out.print("lion is roar");
	}
}

public class name {
	public static void main(String args[]) {
		dog d=new dog();
		lion l=new lion();
		
		d.sound();
		l.sound();
		
		
	}

}
