package tr.salkan.code.java.pure.examples.linkedListAdvance.singly;

public class LinkedListDeleteByPositionExample {

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

    void deleteNode(int position)
    {

        if (head == null)
            return;

        Node temp = head;

        if (position == 0)
        {
            head = temp.next;
            return;
        }

        for (int i=0; temp!=null && i<position-1; i++)
            temp = temp.next;

        if (temp == null || temp.next == null)
            return;

        Node next = temp.next.next;

        temp.next = next;
    }

    public static void main(String[] args) {

        LinkedListDeleteByPositionExample example =new LinkedListDeleteByPositionExample();

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

        example.deleteNode(2);

        System.out.println("deleted position 2");
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
