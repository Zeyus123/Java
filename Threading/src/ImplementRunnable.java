class B implements Runnable
{
	public void run()
	{
		for(int i=1; i<=10;i++)
		{
			System.out.println("tapash");
		}
	}
}


public class ImplementRunnable {
	public static void main(String []args)
	{
		B s=new B();
		Thread t=new Thread(s);
		t.start();
		for(int i=1;i<=10;i++)
		{
			System.out.println("Akash");
		}
		
	}

}
