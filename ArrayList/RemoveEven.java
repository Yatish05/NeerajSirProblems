import java.util.*;

// Remove all even numbers from an ArrayList of integers.

public class RemoveEven{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        ArrayList<Integer> odd = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if (list.get(i) %2==0){
                continue;
            }
            else{
                odd.add(list.get(i));
            }
        }
        System.out.println(odd);
    }
}