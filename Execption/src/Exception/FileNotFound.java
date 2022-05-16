package Exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFound {

	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("file.txt");
	      
	   
	    BufferedReader br = new BufferedReader(reader);
	    try
	    {
	    	  String data =null;
		      
	  	    
	  	    while ((data = br.readLine()) != null) 
	  	    {
	  	        System.out.println(data);
	  	    }
	  	      
	  	   br.close();
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e);
	    }
	      
	   
	  
	  }
	    
	}


