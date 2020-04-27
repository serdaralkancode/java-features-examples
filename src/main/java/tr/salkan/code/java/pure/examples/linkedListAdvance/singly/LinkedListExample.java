package tr.salkan.code.java.pure.examples.linkedListAdvance.singly;

public class LinkedListExample {

    /*

        * data
        * next element pointer

     */

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

        LinkedListExample example = new LinkedListExample();

        example.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        example.head.next = second;
        second.next = third;

    }
}
