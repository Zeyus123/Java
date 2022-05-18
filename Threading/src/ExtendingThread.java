class A extends Thread{
	public void fun()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("tapash");
			try {
				Thread.sleep(1000);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}


public class ExtendingThread {
	
	public static void main (String args[])
	
	{
		A s=new A();
		s.fun();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("Akash");
			try {
				Thread thread = new Thread();
				thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}

}
