package tr.salkan.code.java.pure.examples.linkedListAdvance.singly;

public class LinkedListDeleteByKeyExample {

    /*
        1) Find previous node of the node to be deleted.
        2) Change the next of previous node.
        3) Free memory for the node to be deleted.
     */

    Node head;

    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    void deleteNode(int key)
    {
        Node temp = head, prev = null;


        if (temp != null && temp.data == key)
        {
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != key)
        {
            prev = temp;
            temp = temp.next;
        }


        if (temp == null) return;

        prev.next = temp.next;
    }

    public static void main(String[] args) {

        LinkedListDeleteByKeyExample example = new LinkedListDeleteByKeyExample();

        example.head = new Node(5);
        Node n2 = new Node(12);
        Node n3 = new Node(3);
        Node n4 = new Node(8);
        Node n5 = new Node(5);

        example.head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        System.out.println("linked list");
        example.printList();

        example.deleteNode(8);    // data -> 8  (NOT NODE 8)

        System.out.println("delete key 8 after");
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
