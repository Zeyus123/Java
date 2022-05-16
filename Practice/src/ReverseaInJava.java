import java.util.Scanner;

public class ReverseaInJava {

	public static void main(String[] args) {
		
			System.out.println("enter any  number= ");
			Scanner num=new Scanner (System.in);
			int a=num.nextInt();
//			int b=num.nextInt();
//			int c=num.nextInt();
//			int d=num.nextInt();
			int reverse=0;  // a=1234
			
			while(a!=0) //1234 != 0
			{
				int remainder = a % 10;     //remainder= 4,3,2,
				reverse = reverse * 10 + remainder;  //reverse =4,  4*10+3=43,  43*10+2=432
				a = a/10;  //a= 1234/10=123,12,10
				
			}
			System.out.println(reverse);

	}

}
