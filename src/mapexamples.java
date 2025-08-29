import java.util.*;
public class mapexamples {
    public static void main(String[] args) {
       // Map<Integer,String> h=new HashMap<>();  //unoredred
        Map<Integer,String> h=new LinkedHashMap<>();  //ordered
       // Map<Integer,String> h=new TreeMap<>();    //ascending
        h.put(0,"navenn g");
        h.put(2,"c");
        h.put(4,"c++");
        h.put(1,"java");
        h.put(5,"python");
        h.put(-1,"siddu");
        System.out.println(h);

    }
}
