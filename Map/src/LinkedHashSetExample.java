
import java.util.*;
public class LinkedHashSetExample {
    public static void main(String[] args) {

        LinkedHashSet<String> students = new LinkedHashSet<String>();
        students.add("Keshav");
        students.add("Satya");
        students.add("Reetanj");
        students.add("Reetanj");
        students.add("Reetanj");
        students.add("Priayank");
        students.add("Batula");
        students.add("Keshav");
        students.add("Manisha");
        students.add("Satya");

        System.out.println("Students list : " + students);
        
        students.remove("Batula");
        System.out.println("Students list : "+students);
        
        System.out.println(students.contains("Amit"));
        



    }
}
