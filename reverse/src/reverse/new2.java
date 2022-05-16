package reverse;

import java.util.Arrays;

public class new2 {

	public static void main(String[] args) {
			String str1="silet";
			String str2="listen";
			
			if(str1.length()!= str2.length())
			{
				System.out.println("in this string there is an missing word");
			}
			char[] String1=str1.toCharArray();
			char[] String2=str2.toCharArray();
			
			Arrays.sort(String1);
			Arrays.sort(String2);
			if(Arrays.equals(String1,String2)==true)
			{
			 System.out.print("both are anagram");	
			}
			else
			{
				System.out.print("not anagram");
			}
			

	}

}
