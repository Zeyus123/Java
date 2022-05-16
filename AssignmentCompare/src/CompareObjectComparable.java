
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product1 {
	private String name;
	private int price;
	private char grade;
	
	Product1(String name,int price,char grade){
		this.name=name;
		this.price=price;
		this.grade=grade;
	}
	

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public char getGrade() {
		return grade;
	}


	
	public String toString() {
		return "Product1 [name=" + name + ", price=" + price + ", grade=" + grade + "]";
	}

}
class comparatorDemo implements Comparator<Product1>{

	@Override
	public int compare(Product1 p1, Product1 p2) {
		if(p1.getPrice()>p2.getPrice()) {
			return 1;
		}else if(p1.getPrice()<p2.getPrice()) {
			return -1;
		}
		return 0;
	}
	
}
public class CompareObjectComparable {
	public static void main(String[] arr) {
		List<Product1> list = new ArrayList<>();
		list.add(new Product1("noodles",20,'A'));
		list.add(new Product1("biscuit",30,'D'));
		list.add(new Product1("sauce",10,'B'));
		list.add(new Product1("chips",50,'C'));
		list.add(new Product1("chocolate",20,'A'));
		list.add(new Product1("juice",80,'A'));
		
		Comparator<Product1> comp = new comparatorDemo();
		
		for(Product1 p:list) {
			System.out.println(p);
		}
		System.out.println("=======>>>>>>>>>>>=====");
		Collections.sort(list,comp);
		
		for(Product1 p:list) {
			System.out.println(p);
		}
	}
}
