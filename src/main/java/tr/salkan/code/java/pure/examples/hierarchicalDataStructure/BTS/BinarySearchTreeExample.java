package tr.salkan.code.java.pure.examples.hierarchicalDataStructure.BTS;

public class BinarySearchTreeExample {

    /*

                            58
                          /    \
                        15       62
                      /   \     /   \
                    7     24   86    89


        * Like Binary Tree
        * Right values greater than left values always

     */

    static class Node
    {
        int key;
        Node left, right;

        public Node(int item)
        {
            key = item;
            left = right = null;
        }
    }

    BinarySearchTreeExample(int key)
    {
        root = new Node(key);
    }

    BinarySearchTreeExample()
    {
        root = null;
    }

    Node root;

    public static void main(String[] args) {

        BinarySearchTreeExample treeExample = new BinarySearchTreeExample();

        /*create root*/
        treeExample.root = new Node(58);

        // left and right
        treeExample.root.left = new Node(15);
        treeExample.root.right = new Node(62);

        treeExample.root.left.left = new Node(7);
        treeExample.root.left.right = new Node(24);
    }
}
