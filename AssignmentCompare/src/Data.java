import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class College
{
	private String name;
	private int id;
	private String Mailid;
	String city;
	
	College(String name,int id,String Mailid,String city){
		this.name=name;
		this.id=id;
		this.Mailid=Mailid;
		this.city=city;
	}
	

	public String getName() 
	{
		return name;
	}

	public int getid()
   {
		return id;
	}

	public String getMailid() 
	{
		return Mailid;
	}
	
	public String getcity()
	{
		return city;
	}


	
	public String toString() {
		return "College [name=" + name + ", Student id=" + id + ",Mail Id=" + Mailid + " Studen city=" +city +"]";
	}
}

class Comparatorid implements Comparator<College>
{

	@Override
	public int compare(College o1, College o2) {
		if(o1.getid()>o2.getid()) {
			return 1;
		}else if(o1.getid()<o2.getid()) {
			return -1;
		}
		return 0;
	}
	
}
class ComparatorName implements Comparator<College>
{

	@Override
	public int compare(College o1, College o2) {
		if(o1.getid()>o2.getid()) {
			return 1;
		}else if(o1.getid()<o2.getid()) {
			return -1;
		}
		return 0;
	}
	
}
//class Compartorcity implements Comparator<College>
//{
//
//	@Override
//	public int compare(College o1, College o2) {
//		
//		
//		return o1.city.compareTo(o2.city);;
//	}
//	
//}



public class Data {

	public static void main(String[] args) {
		List<College> list = new ArrayList<>();
		list.add(new College("Rahul",123,"rahul123@gamil.com","Delhi"));
		list.add(new College("Bikash",453,"Bikash123@gamil.com","Mumbai"));
		list.add(new College("Sunil",156,"Sunil123@gamil.com","Tamilnadu"));
		list.add(new College("Ram",557,"ram123@gamil.com","Pune"));
		
		Comparator<College> s = new ComparatorName();
		
		
		for(College c:list) 
		{
			System.out.println(c);
		}
		System.out.println();
		System.out.println(" sorting on Student id ----->>>>  ");
		System.out.println();
		Collections.sort(list,s);
		
		for(College c:list) {
			System.out.println(c);
		}
		
		
	}

}
