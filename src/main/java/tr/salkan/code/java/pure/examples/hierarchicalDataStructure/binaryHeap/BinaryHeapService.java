package tr.salkan.code.java.pure.examples.hierarchicalDataStructure.binaryHeap;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class BinaryHeapService {

    /** The number of children each node has **/
    private static final int d = 2;
    private int heapSize;
    private int[] heap;

    /** Constructor **/
    public BinaryHeapService(int capacity)
    {
        heapSize = 0;
        heap = new int[capacity + 1];
        Arrays.fill(heap, -1);
    }


    public boolean isEmpty( )
    {
        return heapSize == 0;
    }


    public boolean isFull( )
    {
        return heapSize == heap.length;
    }


    public void makeEmpty( )
    {
        heapSize = 0;
    }


    private int parent(int i)
    {
        return (i - 1)/d;
    }

    /** Function to get index of k th child of i **/
    private int kthChild(int i, int k)
    {
        return d * i + k;
    }


    public void insert(int x)
    {
        if (isFull( ) )
            throw new NoSuchElementException("Overflow Exception");

        heap[heapSize++] = x;
        heapifyUp(heapSize - 1);
    }

    /** Function to find least element **/
    public int findMin( )
    {
        if (isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        return heap[0];
    }

    /** Function to delete min element **/
    public int deleteMin()
    {
        int keyItem = heap[0];
        delete(0);
        return keyItem;
    }

    /** Function to delete element at an index **/
    public int delete(int ind)
    {
        if (isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        int keyItem = heap[ind];
        heap[ind] = heap[heapSize - 1];
        heapSize--;
        heapifyDown(ind);
        return keyItem;
    }

    /** Function heapifyUp  **/
    private void heapifyUp(int childInd)
    {
        int tmp = heap[childInd];
        while (childInd > 0 && tmp < heap[parent(childInd)])
        {
            heap[childInd] = heap[ parent(childInd) ];
            childInd = parent(childInd);
        }
        heap[childInd] = tmp;
    }

    /** Function heapifyDown **/
    private void heapifyDown(int ind)
    {
        int child;
        int tmp = heap[ ind ];
        while (kthChild(ind, 1) < heapSize)
        {
            child = minChild(ind);
            if (heap[child] < tmp)
                heap[ind] = heap[child];
            else
                break;
            ind = child;
        }
        heap[ind] = tmp;
    }

    /** Function to get smallest child **/
    private int minChild(int ind)
    {
        int bestChild = kthChild(ind, 1);
        int k = 2;
        int pos = kthChild(ind, k);
        while ((k <= d) && (pos < heapSize))
        {
            if (heap[pos] < heap[bestChild])
                bestChild = pos;
            pos = kthChild(ind, k++);
        }
        return bestChild;
    }


    public void printHeap()
    {
        System.out.print("\nHeap = ");
        for (int i = 0; i < heapSize; i++)
            System.out.print(heap[i] +" ");
        System.out.println();
    }

}
