class Circularsinie {
    public static void main(String[] args) {
        Node3 head = new Node3(1);
        Node3 second = new Node3(20);
        Node3 third = new Node3(30);
        Node3 tail = new Node3(40);

        // Linking nodes forward
        head.next = second;
        second.next = third;
        third.next = tail;
        tail.next = head;

        // Linking nodes backward
        head.prev = tail;
        second.prev = head;
        third.prev = second;
        tail.prev = third;

        System.out.println("Forward traversal:");
        disp(head);

        System.out.println("\n Backward traversal:");
        disp2(tail);
    }

    public static void disp(Node3 head) {
        Node3 n = head;
        do {
            System.out.print(n.data + " ");
            n = n.next;
        } while (n != head);
    }

    public static void disp2(Node3 tail) {
        Node3 n = tail;
        do {
            System.out.print(n.data + " ");
            n = n.prev;
        } while (n != tail);
    }
}

class Node3 {
    int data;
    Node3 next;
    Node3 prev;

    Node3(int d) {
        this.data = d;
        next = null;
        prev = null;
    }
}
