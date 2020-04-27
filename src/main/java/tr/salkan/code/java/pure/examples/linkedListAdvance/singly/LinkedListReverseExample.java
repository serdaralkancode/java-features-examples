package tr.salkan.code.java.pure.examples.linkedListAdvance.singly;

public class LinkedListReverseExample {

    /*
            1) Iterator

                - Initialize three pointers prev as NULL, curr as head and next as NULL.
                - Iterate trough the linked list. In loop, do following

                    // Before changing next of current,
                    // store next node
                    next = curr->next
                    // Now change next of current
                    // This is where actual reversing happens
                    curr->next = prev

                    // Move prev and curr one step forward
                    prev = curr
                    curr = next

            2) Recursive

                    - Divide the list in two parts - first node and rest of the linked list.
                    - Call reverse for the rest of the linked list.
                    - Link rest to first.
                    - Fix head pointer
     */

    static Node head;

    static class Node {

        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    public Node reverseIteration(Node node)
    {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    //Another reverse recursive
    public Node reverseRecursiveTwo(Node head) {
        if (head == null || head.next == null) return head;
        Node p = reverseRecursiveTwo(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }

    Node reverseRecursive(Node curr, Node prev)
    {
        if (curr.next == null) {
            head = curr;

            curr.next = prev;

            return head;
        }


        Node next1 = curr.next;

        curr.next = prev;

        reverseRecursive(next1, curr);
        return head;
    }


    public static void main(String[] args) {

        LinkedListReverseExample example = new LinkedListReverseExample();

        example.head = new Node(5);
        Node n2 = new Node(12);
        Node n3 = new Node(3);
        Node n4 = new Node(8);
        Node n5 = new Node(9);

        example.head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        example.printList();

        head = example.reverseIteration(head);

        System.out.println("After reverse - iterator ");

        example.printList(head);

        System.out.println("Reverse recursive");

        example.head = new Node(1);
        Node n22 = new Node(2);
        Node n33 = new Node(3);
        Node n44 = new Node(4);
        Node n55 = new Node(5);

        example.head.next = n22;
        n22.next = n33;
        n33.next = n44;
        n44.next = n55;

        example.printList();

        example.reverseRecursive(head,null);

        System.out.println("After reverse - Recursive ");

        example.printList(head);
    }

    private void printList() {

        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }

        System.out.println("\n");
    }

    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }

        System.out.println("\n");
    }
}
