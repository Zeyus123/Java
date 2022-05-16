package Exception;
import java.util.*;

public class ConcCurrentModificationExpection {
              public static void main(String[] args) {
           ArrayList<Integer> list = new ArrayList<>();


            try{

            	list.add(1);

            	list.add(2);

            	list.add(3);

            	list.add(4);

            	list.add(5);

            	Iterator<Integer> it = list.iterator();

            	while (it.hasNext()) {

            		Integer value = it.next();

            		System.out.println("List Value:" + value);

            		if (value.equals(3))

            			list.remove(value);

            	}



            }


            catch(ConcurrentModificationException e) {

            	System.out.println(e);


            }



}

}
