import java.util.ArrayList;
import java.util.Collections;


class Movie implements Comparable<Movie>
{
	private double rating;
	private String name ;
	private int year;
	
	
	public Movie(String name, double rating, int year)
    {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }
	
	public double getRating() 
	
	{ 
		return rating;
	}
	
    public String getName()   
    
    {  
    	return name; 
    }
    
    public int getYear()      
    
    {  
    	return year;  
    }

	@Override
	public int compareTo(Movie o) {
		
		return 0;
	}
    
	
}

class CompUsingCompar
{
	

		public static void main(String[] args) {
			
			ArrayList<Movie> name=new ArrayList<>();
			name.add(new Movie("Force Awakens", 8.3, 2015));
	        name.add(new Movie("Star Wars", 8.7, 1977));
	        name.add(new Movie("Empire Strikes Back", 8.8, 1980));
	        name.add(new Movie("Return of the Jedi", 8.4, 1983));
	         Collections.sort(name);
	         
	        for(Movie a: name)
	        {
	        	System.out.println(a.getName()+" "+ a.getRating()+" "+ a.getYear());
	        }
	         
			

		}

	

}
