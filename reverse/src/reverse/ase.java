package reverse;

import java.util.Scanner;

public class ase {

	public static void main(String[] args) {
		int a[]=new int[5];
		int temp;
		System.out.print("enter 5 array element= ");
		Scanner s=new Scanner (System.in);
		for(int i=0;i<5;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
			 if(a[i]>a[j])
			 {
				 temp=a[i];
				 a[i]=a[j];
				 a[j]=temp;
			 }
			}
		}
		for(int i=0;i<5;i++)
		{
		 System.out.print(a[i]+" ");	
		}
	}

}
