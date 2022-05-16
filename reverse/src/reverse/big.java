package reverse;

import java.util.Scanner;

public class big {

	public static void main(String[] args) {
			int a,b,c;
			System.out.println("enter your 1st number: ");
			Scanner s=new Scanner (System.in);
			a=s.nextInt();
			System.out.println("enter your 2nd number: ");
			Scanner t=new Scanner (System.in);
			b=t.nextInt();
			System.out.println("enter your 3rd number: ");
			Scanner u=new Scanner (System.in);
			c=u.nextInt();
			int r=(a>b)?(a>c?a:c):(b>c?b:c);
			System.out.print("the greater number is: "+r);
	}

}
