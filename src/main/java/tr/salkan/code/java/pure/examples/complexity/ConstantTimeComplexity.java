package tr.salkan.code.java.pure.examples.complexity;

import java.util.ArrayList;
import java.util.List;

public class ConstantTimeComplexity {

    /*
            - O(1)

            - Example

                Accessing Array Index
                Inserting a node in Linked List
                Pushing and Poping on Stack
                Insertion and Removal from Queue
                Finding out the parent or left/right child of a node in a tree stored in Array
                Jumping to Next/Previous element in Doubly Linked List
     */

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void insertToHead(int val) {
        Node newNode = new Node(val);

        newNode.next = head;

        head = newNode;
    }


    public static void main(String[] args) {


        Integer[] intArray = new Integer[]{ 10,20,30,40,50 };

        System.out.println(intArray[3]);  // access  O(1)

        List<Integer> list = new ArrayList<>();

        list.add(5);  // push   O(1)

        list.remove(0); // remove    O(1)


        ConstantTimeComplexity constantTimeComplexity = new ConstantTimeComplexity();

        constantTimeComplexity.head = new Node(4);
        Node n2 = new Node(8);

        constantTimeComplexity.head.next = n2;

        constantTimeComplexity.insertToHead(12); // add to head -> O(1)


    }

}
