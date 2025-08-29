public class doublyexample {
    public static void main(String[] args) {
        Node1 head = new Node1(10);
        Node1 second = new Node1(20);
        Node1 third = new Node1(30);
        Node1 tail = new Node1(40);

        head.next = second;
        second.next = third;
        third.next = tail;
        tail.next = null;

        tail.prev = third;
        third.prev = second;
        second.prev = head;
        head.prev = null;
        dis1(head);
        dis2(tail);

    }

    public static void dis1(Node1 head) {
        Node1 n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    public static void dis2(Node1 tail) {
        Node1 n = tail;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.prev;
        }
    }
}
class Node1 {
    int data;
    Node1 next;
    Node1 prev;
    Node1(int data) {
        this.data = data;
        next=prev = null;
    }
}


