class C extends Thread
{
	public void run()
	{
		String name=Thread.currentThread().getName();
		for(int i=0;i<10;i++)
		{
			System.out.println(name);
		}
	}
}
public class JoinMethod {

	public static void main(String[] args)  {
		
	C t1=new C();
	C t2=new C();
	C t3=new C();
	
	t1.setName("tapash");
	t2.setName("Akash");
	t3.setName("Amit");
	
	
	t2.start();
	try {
		t2.join();
	}
	catch (InterruptedException e) 
	   {
		e.printStackTrace();
	   }
	t3.start();
	t1.start();
	
		
	}

}
