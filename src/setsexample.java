import java.util.*;
import java.util.HashSet;
import java.util.Set;

public class setsexample {
    public static void main(String[] args) {
       Set<Integer> h = new HashSet<>();        //unored
       //Set<Integer> h = new LinkedHashSet<>();  //same order
//        Set<Integer> h = new TreeSet<>();  //ascending order
        h.add(1);
        h.add(3);
        h.add(5);
        h.add(4);
        h.add(2);
        h.add(-1);
        h.add(9);

        System.out.println(h);
    }
}
