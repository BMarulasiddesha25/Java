import java.util.*;

public class ssltask2 {
    public static void main(String[] args) {
        SinglyCircularList list = new SinglyCircularList();
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many elements do you want to insert? ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int data = scanner.nextInt();
            list.insert(data);
        }

        System.out.println("\nElements in the circular linked list:");
        list.display();

        scanner.close();
    }
}

class SinglyCircularList {
    private Node12 head;
    private Node12 tail;

    public void insert(int data) {
        Node12 newNode12 = new Node12(data);
        if (head == null) {
            head = newNode12;
            tail = newNode12;
            tail.next = head;
        } else {
            tail.next = newNode12;
            tail = newNode12;
            tail.next = head;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node12 current = head;
        do {
            System.out.println(current.data);
            current = current.next;
        } while (current != head);
    }
}

class Node12 {
    int data;
    Node12 next;

    Node12(int data) {
        this.data = data;
        next = null;
    }
}
