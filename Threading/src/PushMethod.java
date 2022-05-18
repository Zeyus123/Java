class F extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch Flock
				e.printStackTrace();
			}
			System.out.println("helow world");
			
		}
		
	}
}
public class PushMethod {

	public static void main(String[] args) {
		F s=new F();
		s.start();

	}

}
