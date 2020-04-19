package tr.salkan.code.java.pure.examples.sorting.sortingAlgorithms;

public class InsertionSorting {

    /*
           * Insert sorting every element inserting true position
           * Starting 1.index
     */

    void sort(int arr[])
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

        int arr[] = { 6 ,5 ,3 ,1 ,8 ,7 ,2 ,4 };

        InsertionSorting is = new InsertionSorting();
        is.sort(arr);

        printArr(arr);

    }

    private static void printArr(int[] intarray) {

        for(int x = 0; x < intarray.length; x++)
        {
            System.out.println("index : " + x  + " value : " + intarray[x]);
        }

    }
}
