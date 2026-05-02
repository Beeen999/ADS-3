import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("TEST\n");

        MyHashTable<MyTestingClass, Student> table = new MyHashTable<>();

        Random random = new Random();

        for (int i = 0; i < 10000; i++) {
            MyTestingClass key = new MyTestingClass(i, "Student" + i);
            Student value = new Student("Name" + i, random.nextInt(18, 25));
            table.put(key, value);
        }

        table.printBucketSizes();

        System.out.println("\nTesting get:");
        MyTestingClass testKey = new MyTestingClass(100, "Student100");
        System.out.println("Key: " + testKey + " -> Value: " + table.get(testKey));

        System.out.println("\nTesting contains:");
        Student testStudent = new Student("Name50", 20);
        System.out.println("Contains " + testStudent + ": " + table.contains(testStudent));

        System.out.println("\n\nBST \n");

        BST<Integer, String> bst = new BST<>();

        bst.put(50, "Fifty");
        bst.put(30, "Thirty");
        bst.put(70, "Seventy");
        bst.put(20, "Twenty");
        bst.put(40, "Forty");
        bst.put(60, "Sixty");
        bst.put(80, "Eighty");

        System.out.println("Size: " + bst.size());

        System.out.println("\nIn-order traversal:");
        for (var elem : bst) {
            System.out.println("key is " + elem.getKey() + " and value is " + elem.getValue());
        }

        System.out.println("\nGet value for key 40: " + bst.get(40));

        System.out.println("\nDeleting key 30...");
        bst.delete(30);

        System.out.println("Size after delete: " + bst.size());

        System.out.println("\nIn-order traversal after delete:");
        for (var elem : bst) {
            System.out.println("key is " + elem.getKey() + " and value is " + elem.getValue());
        }
    }
}
