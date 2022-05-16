import java.util.Scanner;

// write a program to find leep year from 2000 to 2030
public class Practice {
	public static void main(String[] args) {
		Scanner p =new Scanner(System.in);
		int x=p.nextInt();
		if(x<=25) {
			System.out.println("F");
		}
		else if((x>=25)&&(x<=45)) {
			System.out.println("E");
			
		}
		else if((x>=45)&&(x<=50)) {
			System.out.println("D");
			
		}
		else if((x>=50)&&(x<=60)) {
			System.out.println("C");
			
		}
		else if((x>=60)&&(x<=80)) {
			System.out.println("B");
			
		}
		else if((x<=100)&&(x>=80)) {
	
			System.out.println("A");
		}
		else {
			System.out.println("Please Enter Valid Percentage!");
		}
	}
	
}
