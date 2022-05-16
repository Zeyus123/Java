package reverse;


import java.util.Arrays;
import java.util.*;


public class rre {

	public static void main(String[] args) {
		int a[]=new int[5];
		System.out.print("\nenter array element = ");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			a[i]=s.nextInt();
			
		}
		Arrays.sort(a);
		System.out.print("\narray element = ");
		
		for(int i=0;i<5;i++)
		{
			System.out.print(a[i]+" ");
		}
		/*for(int i=0;i<5;i++);
		{
		 System.out.print(a[i]);	
		}*/
		/*for(int i=5-1;i>=0;i--)
		{
			System.out.print(a[i]);
		}*/

	}

}
