// Class to insert element in LL
class LinkedList {

    // A linked list node
    class Node {
        int data;
        Node next;
    }

    // Driver code
    public static void main(String[] args) {
        // Start with the empty lsist
        LinkedList list = new LinkedList();

        list.insertAtFront(6);
        list.insertAtFront(5);
        list.insertAtFront(4);
        list.insertAtFront(3);
        list.insertAtFront(2);
        list.insertAtFront(1);
        list.insertAtFront(0);

        System.out.print("After inserting nodes at the front: ");
        list.printList();
        list.removeFirstNode();
        System.out.print("After removing first node(head): ");
        list.printList();
        list.removeLastNode();
        System.out.print("After removing last node(tail): ");
    }

    Node head; // head of list

    // Given a reference (pointer to pointer)
    // to the head of a list and an int, inserts
    // a new node on the front of the list.
    void insertAtFront(int new_data) {
        // 1. allocate node
        Node new_node = new Node();

        // 2. put in the data
        new_node.data = new_data;

        // 3. Make next of new node as head
        new_node.next = head;

        // 4. move the head to point
        // to the new node
        head = new_node;
    }

    // Function to remove the first node
    // of the linked list /
    void removeFirstNode() {
        if (head == null)
            return;

        head = head.next;
    }

    // Function to remove the last node of linked list
    void removeLastNode() {

    }

    // This function prints contents of
    // linked list starting from head
    void printList() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}