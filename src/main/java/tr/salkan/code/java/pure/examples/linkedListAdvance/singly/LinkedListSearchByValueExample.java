package tr.salkan.code.java.pure.examples.linkedListAdvance.singly;

public class LinkedListSearchByValueExample {

    Node head;

    static class Node
    {
        int data;
        Node next;
        Node(int d)  { data = d;  next = null; }
    }

    public boolean search(Node headNode, int x)
    {
        Node current = headNode;
        while (current.next != null)
        {
            if (current.data == x)
                return true;    //data found
            current = current.next;
        }
        return false;    //data not found
    }

    public static void main(String[] args) {

        LinkedListSearchByValueExample example = new LinkedListSearchByValueExample();

        example.head = new Node(5);
        Node n2 = new Node(12);
        Node n3 = new Node(3);
        Node n4 = new Node(8);
        Node n5 = new Node(5);

        example.head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        if (example.search(example.head, 8))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
