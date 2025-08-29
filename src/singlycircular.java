class singlycircular {
    public static void main(String[] args) {
        Singly s = new Singly();
        s.insert(10);
        s.insert(20);
        s.insert(30);
        s.insert(40);
        s.insert(50);
        s.dis();
    }
}

class Singly {
    Node head;
    Node tail;

    Singly() {
        head = null;
        tail = null;
    }

    public void insert(int data) {
        Node hello = new Node(data);
        if (head == null) {
            head = hello;
            tail = hello;
            tail.next = head; // circular link
        } else {
            tail.next = hello;
            tail = hello;
            tail.next = head; // maintain circular link
        }
    }

    void dis() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node n = head;
        do {
            System.out.println(n.data);
            n = n.next;
        } while (n != head); // stop when it loops back to head
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}
