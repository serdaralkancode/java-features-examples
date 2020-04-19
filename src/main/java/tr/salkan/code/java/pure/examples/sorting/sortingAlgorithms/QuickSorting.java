package tr.salkan.code.java.pure.examples.sorting.sortingAlgorithms;

public class QuickSorting {

    /*
           *  Divide and Conquer algorithm
           *  Picks one element of an array as the pivot and sorts all of the other elements around it
           *
           * * Always pick first element as pivot.
           * * Always pick last element as pivot (implemented below)
           * * Pick a random element as pivot.
           * * Pick median as pivot.
     */

    int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1);
        for (int j=low; j<high; j++)
        {

            if (arr[j] < pivot)
            {
                i++;


                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }


        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    void sort(int arr[], int low, int high)
    {
        if (low < high)
        {
            int pi = partition(arr, low, high);

            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = {18, 9, 8, 13, 1, 4};
        int n = arr.length;

        QuickSorting qs = new QuickSorting();
        qs.sort(arr,0, n-1);

        printArray(arr);
    }
}
