package tr.salkan.code.java.pure.examples.complexity;

public class QuadraticTimeComplexity {

    /*
            - O(n²)

            - Examples

                    Bubble Sort
                    Insertion Sort
                    Selection Sort
                    Traversing a simple 2D array
     */

    // Bubble Sort
    void bubbleSorting(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }

    // Insertion Sort
    void insertionSorting(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {

    }

}
