import java.util.*;
public class stackexample {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        System.out.println(s.peek());
        System.out.println(s);
        s.pop();
        System.out.println(s);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s);
        System.out.println(s.peek());
    }
}
