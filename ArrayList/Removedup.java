import java.util.*;

public class Removedup {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(1);
        list.add(3);
        
        Set<Integer> set = new LinkedHashSet<>(list);
        ArrayList<Integer> n = new ArrayList<>(set);
        System.out.println(n);
    }

}
