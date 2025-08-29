import java.util.*;

public class priorityexmple {
    public static void main(String[] args) {
        Queue<Integer>q = new PriorityQueue<>();
        q.add(8);
        q.add(5);
        q.add(3);
        q.add(9);
        q.add(-1);
        q.add(6);
        q.add(12);
        q.add(0);
        System.out.println(q);
    }
}
