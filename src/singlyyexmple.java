class SinglyExample {
    public static void main(String[] args) {
        SinglyLL s = new SinglyLL();
        s.insert(10);
        s.insert(20);
        s.insert(30);
        s.insert(40);
        s.insert(50);
        s.display();
    }
}

class SinglyLL {
    Node6 head;
    Node6 tail;

    SinglyLL() {
        head = null;
        tail = null;
    }

    public void insert(int data) {
        Node6 newNode = new Node6(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head; // circular link
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; // maintain circular link
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node6 current = head;
        do {
            System.out.println(current.data);
            current = current.next;
        } while (current != head);
    }

}
class Node6 {
    int data;
    Node6 next;

    Node6(int data) {
        this.data = data;
        next = null;
    }
}
