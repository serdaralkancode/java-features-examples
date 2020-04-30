package tr.salkan.code.java.pure.examples.complexity;

public class NLogNTimeComplexity {

    /*
            - O(n log n)

            - Examples

                    Merge Sort
                    Heap Sort
                    Quick Sort
                    Certain Divide and Conquer Algorithms based on optimizing O(n^2) algorithms

     */


    void merge(int arr[], int l, int m, int r)
    {

        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int [n1];
        int R[] = new int [n2];


        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    //Merge Sorting
    void sort(int arr[], int l, int r)
    {
        if (l < r)
        {

            int m = (l+r)/2;


            sort(arr, l, m);
            sort(arr , m+1, r);

            merge(arr, l, m, r);
        }
    }

    public static void main(String[] args) {


        //Easy example
        int n = 5;
        for (int i = 1; i <= n; i++){
            for(int j = 1; j < 8; j = j * 2) {
                System.out.println("i : " + i + " -  j : " + j);
            }
        }

    }

}
