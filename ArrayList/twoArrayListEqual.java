import java.util.*;

public class twoArrayListEqual {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("apple");
        list1.add("ban");
        list1.add("cherry");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("apple");
        list2.add("ban");
        list2.add("cherry");

        if (list1.equals(list2)) {
            System.out.println("equal");
        } else {
            System.out.println("not.");
        }
    }

}
