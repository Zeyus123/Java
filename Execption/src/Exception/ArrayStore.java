package Exception;
public class ArrayStore {
    public static void main(String[] args) {
        try {
            Object[] array = new String[2];
            array[1] = 5;
        } catch (ArrayStoreException ase) {
            ase.printStackTrace();
          
        }
        System.out.println("Sucessfully exicute");
    }
}
