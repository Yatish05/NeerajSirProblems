import java.util.*;

// Find Second Largest Element in an ArrayList

public class SecondLargest{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,30,78,90,65));
            Collections.sort(list);
            int sl = list.get(list.size() - 2);
            System.out.println(sl);
    }
}





