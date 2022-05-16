package reverse;

import java.util.Scanner;

public class ne {

	public static void main(String[] args) {
		 int s;
		 int t;
		 int r;
		 int a=0;
		 System.out.print("enter any number= ");
		 Scanner n=new Scanner(System.in);
		 s=n.nextInt();
		 t=s;
		 while(s>0)
		 {
			 r=s%10;
			 a=(a*10)+r;
			 s=s/10;
		 }
		 System.out.println(a);
		 if(t==a)
		 {
			 System.out.print("this is palindrem");
		 }
		 else
		 {
			 System.out.print("not palindream");
		 }

	}

}
