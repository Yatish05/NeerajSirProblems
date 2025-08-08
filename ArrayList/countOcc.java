//package ArrayList;
import java.util.*;

//  Q2. Count Occurrences of a Given Number

public class countOcc {
    public static void main(String[] args){
            ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,3,2,4,2,1));

            Map<Integer,Integer> freq = new HashMap<>();
            for(int num : list){
                        freq.put(num,freq.getOrDefault(num,0)+1);
                }
                System.out.println("Frequencies: " + freq);
            }
    }

