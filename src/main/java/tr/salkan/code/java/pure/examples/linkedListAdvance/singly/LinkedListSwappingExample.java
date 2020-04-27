package tr.salkan.code.java.pure.examples.linkedListAdvance.singly;

public class LinkedListSwappingExample {

        /*
                Input:  1->2->3->4->5->6   x = 3, y = 5
                Output: 1->2->5->4->3->6

                Input:  1->2->3->4->5->6   x = 1, y = 5
                Output: 5->2->3->4->1->6

                Input:  1->2->3->4->5->6  x = 3, y = 4
                Output: 1->2->4->3->5->6
        */

    Node head;

    static class Node
    {
        int data;
        Node next;
        Node(int d)  { data = d;  next = null; }
    }

    public void swapNodes(int x, int y)
    {

        if (x == y) return;

        // Search x
        // find previousNodeX and currentNodeX
        Node prevX = null, currX = head;
        while (currX != null && currX.data != x)
        {
            prevX = currX;
            currX = currX.next;
        }

        // Search y
        // find previousNodeY and currentNodeY
        Node prevY = null, currY = head;
        while (currY != null && currY.data != y)
        {
            prevY = currY;
            currY = currY.next;
        }

        // x or y not in linkedList?
        if (currX == null || currY == null)
            return;

        // If x is not head of linked list
        if (prevX != null)
            prevX.next = currY;
        else //make y the new head
            head = currY;

        // If y is not head of linked list
        if (prevY != null)
            prevY.next = currX;
        else // make x the new head
            head = currX;

        // Swap next pointers
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }

    public static void main(String[] args) {

        LinkedListSwappingExample example = new LinkedListSwappingExample();

        example.head = new Node(5);
        Node n2 = new Node(12);
        Node n3 = new Node(3);
        Node n4 = new Node(8);
        Node n5 = new Node(9);

        example.head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        System.out.println("Linked List");
        example.printList();

        example.swapNodes(12,8);
        System.out.println("after swap x:12 y:8");
        example.printList();

        example.swapNodes(5,9);
        System.out.println("after swap x:12 y:8");
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
