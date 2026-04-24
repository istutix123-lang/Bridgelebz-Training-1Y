
import java.util.*;
import java.util.ArrayList;

public class D1 {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        List<Integer>  l2 = new Vector<>();
        List<Integer> list2  = new ArrayList<>();
        Set<Integer> Set = new HashSet<>()
        list.add(1);

        list.addAll(list2); // list2 is empty

        System.out.println(list);
    }
}