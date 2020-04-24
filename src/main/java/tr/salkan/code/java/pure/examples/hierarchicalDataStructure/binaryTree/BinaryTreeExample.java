package tr.salkan.code.java.pure.examples.hierarchicalDataStructure.binaryTree;

public class BinaryTreeExample {

    /*
                            ROOT NODE
                                1             depth = 0   level = 1
                            /       \
                           2         3        depth = 1   level = 2
                         /   \      /  \
                        4     5    6    7     depth = 2   level = 3

                                              height = 3

             * The most number of nodes at level 'l'                 => 2^(l-1)

             * Maximum number of nodes ( h is the height of tree)    =>  2^(h) – 1
                Sometimes level 1 is height (some books)             => 2^(h+1) -1

             * Minimum possible height or minimum number of levels   => Log2(N+1) ?

             * Time Complexity of Tree Traversal                    => O(n)

             * Each node has most node 2. Left and Right or 0 node
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

    BinaryTreeExample(int key)
    {
        root = new Node(key);
    }

    BinaryTreeExample()
    {
        root = null;
    }

    Node root;

    public static void main(String[] args) {

        BinaryTreeExample treeExample = new BinaryTreeExample();

        /*create root*/
        treeExample.root = new Node(1);

        // left and right
        treeExample.root.left = new Node(2);
        treeExample.root.right = new Node(3);

        treeExample.root.left.left = new Node(4);
        treeExample.root.left.right = new Node(5);

    }

}
