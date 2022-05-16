package Exception;

 class MyClass {
        public static MyClass initT() {     
        return null;
       }      
        public void print(String s) {
        System.out.println(s.toLowerCase());
      }
    }
class Null
     {
  public static void main(String[] args) {
	  try
	  {
		  MyClass t = MyClass.initT();    
	        t.print("Hello, World!");   
	  }
	  catch(Exception e)
	  {
		  System.out.print(e);
	  }
    
    	     
      }
}
