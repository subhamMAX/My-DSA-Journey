import java.util.Vector;

    public class VectorExample {
        
        public static void main(String[] args) {

            Vector<String> v = new Vector<>();
            v.add("Apple");
            v.add("Banana");
            v.add("Mango");
            v.add(1, "Orange");
            System.out.println("Element at index 2: " + v.get(2));
            v.remove("Banana");
            System.out.println("Fruits in Vector:");
            for (String fruit : v) {
                System.out.println(fruit);
            }
            System.out.println("Size: " + v.size());
            System.out.println("Capacity: " + v.capacity());
        }
    }


