package tr.salkan.code.java.pure.examples.sorting.sortingAlgorithms;

public class SelectionSorting {

    /*
        Selection Sort also divides the array into a sorted and unsorted subarray.
        Though, this time, the sorted subarray is formed by inserting
        the minimum element of the unsorted subarray at the end of the sorted array, by swapping

        * 62 26 10 22 18    => min element [0,4] = 10 62 26 22 18
        * 10 62 26 22 18    => min element [1,4] = 10 18 22 26 62
        * ...

     */

    void sort(int arr[])
    {
        int n = arr.length;


        for (int i = 0; i < n-1; i++)
        {

            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String[] args) {

        SelectionSorting ss = new SelectionSorting();
        int arr[] = {64,25,12,22,11};
        ss.sort(arr);
        System.out.println("Sorted array");
        ss.printArray(arr);
    }
}
