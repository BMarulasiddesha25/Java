public class queuelinkedlist {
    public static void main(String[] args) {
        DLL ob = new DLL();

        System.out.println("Inserting elements into the stack:");
        ob.insert(10);
        ob.insert(20);
        ob.insert(30);
        ob.insert(40);

        System.out.println("\nPeeking top element:");
        ob.peek();

        System.out.println("\nPopping top element:");
        ob.pop();

        System.out.println("\nDisplaying remaining elements:");
        ob.dis();
    }
}

class DLL {
    Node11 head;
    Node11 tail;

    DLL() {
        head = null;
        tail = null;
    }

    void insert(int data) {
        Node11 hello = new Node11(data);
        if (head == null) {
            head = hello;
            tail = hello;
        } else {
            tail.next = hello;
            hello.prev = tail;
            tail = hello;
        }
        System.out.println("Inserted: " + data);
    }

    void peek() {
        if (tail == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Peek element: " + tail.data);
        }
    }

    void pop() {
        if (tail == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Popped element: " + tail.data);
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }
        }
    }

    void dis() {
        if (head == null) {
            System.out.println("Stack is empty");
            return;
        }

        Node11 n = head;
        System.out.print("Elements in stack: ");
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }
}

class Node11 {
    int data;
    Node11 prev;
    Node11 next;

    Node11(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
