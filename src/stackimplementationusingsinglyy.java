
// Node class representing each element in the stack
class Node14 {
    int data;
    Node14 next;

    Node14(int data) {
        this.data = data;
        this.next = null;
    }
}

// Stack implementation using Singly Linked List
class StackSLL {
    private Node14 top;

    // Constructor to initialize the stack
    StackSLL() {
        top = null;
    }

    // Push operation (insert element at the top)
    void push(int val) {
        Node14 newNode = new Node14(val); // Create new node
        newNode.next = top;               // Link new node to current top
        top = newNode;                    // Move top to new node
        System.out.println("inserted elemts are=" + val);
    }

    // Peek operation (see top element without removing it)
    void peek() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("peek value is = " + top.data);
        }
    }

    // Pop operation (remove the top element)
    void pop() {
        if (top == null) {
            System.out.println("Stack underflow");
        } else {
            System.out.println("Deleted element is = " + top.data);
            top = top.next; // Move top to next node
        }
    }

    // Display operation (print all elements from top to bottom)
    void display() {
        if (top == null) {
            System.out.println("[]");
        } else {
            Node14 temp = top;
            while (temp != null) {
                System.out.println("array elements=" + temp.data);
                temp = temp.next;
            }
        }
    }
}


public class StackUsingSLL {
    public static void main(String[] args) {
        StackSLL st = new StackSLL();

        st.push(10);
        st.push(20);
        st.push(30);

        st.peek();       // Show top element
        st.display();    // Show all stack elements

        st.pop();        // Remove top element
        st.display();    // Show stack after pop
    }
}
