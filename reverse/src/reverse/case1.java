package reverse;

import java.util.Scanner;

public class case1 {

	public static void main(String[] args) {
		int a,b,ch;
		
		System.out.print("enter 1st number: ");
		Scanner s=new Scanner (System.in);
		a=s.nextInt();
		System.out.print("enter 2nd number: ");
		Scanner t=new Scanner (System.in);
		b=t.nextInt();
		System.out.println("enter the choice : ");
		System.out.println("choice 1=addition");
		System.out.println("choice 2=substraction");
		System.out.println("choice 3=multiplication");
		System.out.println("choice 3=division");
		Scanner n=new Scanner(System.in);
		ch=n.nextInt();
		
		switch(ch)
		{
		case 1:  System.out.print(a+b);
		break;
		case 2:  System.out.print(a-b);
		break;
		case 3:  System.out.print(a*b);
		break;
		case 4:  System.out.print(a/b);
		break;
		
		}
	}

}
