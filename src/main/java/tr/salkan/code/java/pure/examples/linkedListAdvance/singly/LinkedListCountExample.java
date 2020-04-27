package tr.salkan.code.java.pure.examples.linkedListAdvance.singly;

public class LinkedListCountExample {

    Node head;

    static class Node
    {
        int data;
        Node next;
        Node(int d)  { data = d;  next = null; }
    }

    public int getCount()
    {
        Node temp = head;
        int count = 0;
        while (temp != null)
        {
            count++;
            temp = temp.next;
        }
        return count;
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

        LinkedListCountExample example = new LinkedListCountExample();

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

        System.out.println("linked list count : "  + example.getCount());

        example.insertToHead(80);

        System.out.println("linked list insertToHead 80 value after count : "  + example.getCount());

        example.append(18);

        System.out.println("linked list append the last 18 value after count : "  + example.getCount());


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
