import java.util.*;

public class linkedlist {
        public static void main(String[] args) {
            LinkedList <Integer> a=new LinkedList<>();
            System.out.println(a.isEmpty());
            a.add(1);
            a.add(2);
            a.add(3);
            System.out.println(a);
            System.out.println(a.size());
            a.remove(2);
            System.out.println(a);
            System.out.println(a.isEmpty());
            a.clear();
            System.out.println(a);

        }
    }


