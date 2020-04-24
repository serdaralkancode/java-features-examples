package tr.salkan.code.java.pure.examples.hierarchicalDataStructure.binaryTree;

public class ExampleNode {

    ExampleNode left, right;

    int data;

    /* Constructor */
    public ExampleNode()
    {
        left = null;
        right = null;
        data = 0;
    }
    /* Constructor */
    public ExampleNode(int n)
    {
        left = null;
        right = null;
        data = n;
    }
    /* Function to set left node */
    public void setLeft(ExampleNode n)
    {
        left = n;
    }
    /* Function to set right node */
    public void setRight(ExampleNode n)
    {
        right = n;
    }
    /* Function to get left node */
    public ExampleNode getLeft()
    {
        return left;
    }
    /* Function to get right node */
    public ExampleNode getRight()
    {
        return right;
    }
    /* Function to set data to node */
    public void setData(int d)
    {
        data = d;
    }
    /* Function to get data from node */
    public int getData()
    {
        return data;
    }
}
