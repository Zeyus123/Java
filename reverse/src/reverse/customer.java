package reverse;

import java.util.*;
class bank

{
	private int bal=5000;
	private int pass;

	public void deposite()
	{
		System.out.println("enter the password: ");
		Scanner s=new Scanner (System.in);
		pass=s.nextInt();
		if(pass==1234)
		{
			System.out.println("your passwrod is correct");
			System.out.println("enter your deposite amout: ");
			Scanner t=new Scanner (System.in);
			int a=t.nextInt();

			bal+=a;
			System.out.println("your totalbalance is :"+bal);
        }
        else
        {
        	System.out.println("your passwrod is incorrect");
        }

	}
	public void withdraw()
	{
		System.out.println("enter the password: ");
		Scanner s=new Scanner (System.in);
		pass=s.nextInt();
		if(pass==1234)
		{
			System.out.println("your passwrod is correct");
			System.out.println("enter your withdraw amout: ");
			Scanner u=new Scanner (System.in);
			int b=u.nextInt();
			if(b<=5000)
			{
				bal=bal-b;
			System.out.println("your totalbalance is :"+bal);
			}
			else
			{
				System.out.println("insufficient amount");
			}
		}

			
        
        else
        {
        	System.out.println("your passwrod is incorrect");
        }
    }
    public void check_balance()
	{
		System.out.println("enter the password: ");
		Scanner s=new Scanner (System.in);
		pass=s.nextInt();
		if(pass==1234)
		{
			System.out.println("your passwrod is correct");
			System.out.println("your total balance is :"+bal);
		}
		else
        {
        	System.out.println("your passwrod is incorrect");
        }
    }


}
class customer 
{
	public static void main(String[] args) {
		 
		 bank n=new bank();
		 int ch;
		 System.out.println("1.Deposite");
		 System.out.println("2.Withdraw");
		 System.out.println("3.Check_Balance");
		 System.out.println("enter your choice: ");
		 Scanner m=new Scanner (System.in);
		 ch=m.nextInt();

			switch(ch)
			{
				case 1: n.deposite();
				break;
				case 2: n.withdraw();
				break;
				case 3: n.check_balance();
				break;
				default: System.out.print("invalid choice");
			}		 

	}
}
