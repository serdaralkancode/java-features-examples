package tr.salkan.code.java.pure.examples.sorting.sortingAlgorithms;

public class BubleSorting {

    /*
        * Bubble sort works by swapping adjacent elements

        * * 4 2 1 5 3: The first two elements are in the wrong order, so we swap them.
        * * 2 4 1 5 3: The second two elements are in the wrong order too, so we swap.
        * * 2 1 4 5 3: These two are in the right order, 4 < 5, so we leave them alone.
        * * 2 1 4 5 3: Another swap.
        * * 2 1 4 3 5: Here's the resulting array after one iteration.
     */


    void bubbleSortingForLoop(int arr[])
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

    void bubleSortingWhileAndForLoop(int arr[])
    {
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i+1]) {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }

    void optimizedBubbleSorting(int arr[], int n)
    {

        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++)
        {
            swapped = false;
            for (j = 0; j < n - i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (swapped == false)
                break;
        }
    }


    public static void main(String[] args) {

        BubleSorting bs = new BubleSorting();

        int arr[] = {63, 35, 24, 13, 22, 10, 89};
        int arr2[] = {63, 35, 24, 13, 22, 10, 89};
        int arr3[] = {63, 35, 24, 13, 22, 10, 89};

        bs.bubbleSortingForLoop(arr);
        bs.bubleSortingWhileAndForLoop(arr2);
        bs.optimizedBubbleSorting(arr3,arr3.length);

        printArr(arr);

        System.out.println("------------------");

        printArr(arr2);

        System.out.println("------------------");

        printArr(arr3);

    }

    private static void printArr(int[] intarray) {

        for(int x = 0; x < intarray.length; x++)
        {
            System.out.println("index : " + x  + " value : " + intarray[x]);
        }

    }
}
