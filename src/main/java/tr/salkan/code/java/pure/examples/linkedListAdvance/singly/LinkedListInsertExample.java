package tr.salkan.code.java.pure.examples.linkedListAdvance.singly;

public class LinkedListInsertExample {

    /*
        1) At the front of the linked list
        2) After a given node.
        3) At the end of the linked list.
     */

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        } // Constructor
    }

    // 1) At the front of the linked list
    public void insertToHead(int val) {
        Node newNode = new Node(val);

        newNode.next = head;

        head = newNode;
    }

    //2) After a given node.
    public void insertAfter(Node prev_node, int new_data)
    {
        if (prev_node == null)
        {
            System.out.println("The given previous node cannot be null");
            return;
        }

        Node new_node = new Node(new_data);

        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }

    //3) At the end of the linked list.
    public void append(int new_data)
    {
        Node new_node = new Node(new_data);

        if (head == null)
        {
            head = new Node(new_data);
            return;
        }

        new_node.next = null;

        Node last = head;
        while (last.next != null)
            last = last.next;

        last.next = new_node;
        return;
    }

    public static void main(String[] args) {

        LinkedListInsertExample example = new LinkedListInsertExample();

        example.head = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        example.head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        System.out.println("linked list");
        example.printList();

        example.insertToHead(6);

        System.out.println("1. linked list after push 6 ");  // new element is head
        example.printList();

        example.insertAfter(n4,8);

        System.out.println("2. linked list insertAfter node 4 -> node 8 "); //new element between
        example.printList();

        example.append(20);
        System.out.println("3. linked list add last (append) 20 ");  //new element last
        example.printList();


    }

    private void printList() {

        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }

        System.out.println("\n");
    }

}
