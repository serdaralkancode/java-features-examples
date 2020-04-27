package tr.salkan.code.java.pure.examples.linkedListAdvance.singly;

public class LinkedListTraverseExample {

    Node head;

    static class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        } // Constructor
    }

    public static void main(String[] args) {

        LinkedListTraverseExample example = new LinkedListTraverseExample();

        example.head = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        example.head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;


        example.printList();
    }

    private void printList() {

        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
}
