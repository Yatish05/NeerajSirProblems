import java.util.*;

//Insert an element at a specific position in an ArrayList.

 public class SpeicificPos{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        
        list.add(1,3);
        System.out.println(list);
    }
}
