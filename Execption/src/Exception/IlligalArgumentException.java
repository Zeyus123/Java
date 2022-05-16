package Exception;

public class IlligalArgumentException {
	   int m;
	   public void Mark(int marks) {
	      if(marks < 0 || marks > 100)
	         throw new IllegalArgumentException(Integer.toString(marks));
	      else
	         m = marks;
	   }
	   public static void main(String[] args) {
		   IlligalArgumentException s1 = new IlligalArgumentException();
	      s1.Mark(45);
	      System.out.println(s1.m);
	      IlligalArgumentException s2 = new IlligalArgumentException();
	      s2.Mark(101);
	      System.out.println(s2.m);
	   }
	}
