
 class A {
	
	int a[];
	int rear;
	int capacity;
	 A (int n)
	 {
		 capacity=n;
		 a=new int[n];
		 rear=-1;
	 }
	 
	 void Enqueue(int data)
	 {
		 if(rear==capacity-1)
		 {
			 System.out.println("queue is full");
			 return;
		 }
		 rear++;
		 a[rear]=data;
	 }
	 
	 int Dequeue()
	 {
		 if(rear==-1)
		 {
			 System.out.println("queue is empty");
		 }
		 int result=a[0];
		 for(int i=0;i<rear;i++) {
			 a[i]=a[i+1];
		 }
		 rear--;
		 return result;
	 }
	 
	  void Display()
	  {
		  if(rear==-1)
		  {
			  System.out.println("queue is empty");
		  }
		  for(int i=0;i<=capacity-1;i++)
		  {
			  System.out.print(a[i]+" ");
		  }
	  }
	 
}
public class QueueArray 
{

	public static void main(String[] args) {
		A s=new A(5);
		s.Enqueue(19);
		s.Enqueue(12);
		s.Enqueue(13);
		s.Enqueue(14);
		s.Enqueue(15);
		//s.Enqueue(18);
		s.Display();
		
		
		

	}

	

	
}
	
