package tr.salkan.code.java.pure.examples.complexity;

public class LinearTimeComplexity {

    /*
            *  O(n)

            * Example

                    Traversing an array
                    Traversing a linked list
                    Linear Search
                    Deletion of a specific element in a Linked List (Not sorted)
                    Comparing two strings
                    Checking for Palindrome
                    Counting/Bucket Sort and here too you can find a million more such examples
     */

        // equals method structure

        // best case  -> O(1)
        // worst case -> O(n)

        //    public boolean equals(Object anObject) {
        //        if (this == anObject) { // O(1)
        //            return true;
        //        }
        //        if (anObject instanceof String) //O(1)  {
        //            String anotherString = (String)anObject;
        //        int n = value.length;
        //        if (n == anotherString.value.length) { // O(1)
        //            char v1[] = value;
        //            char v2[] = anotherString.value;
        //            int i = 0;
        //            while (n-- != 0) {  // O(n)
        //                if (v1[i] != v2[i]) //O(1)
        //                    return false;
        //                i++;
        //            }
        //            return true;
        //        }
        //    }
        //    return false;
        //}

    public static void main(String[] args) {

        int[] intArray = new int[]{ 10,20,30,40,50 };

        for(int i  = 0 ; i < intArray.length ; i++)            // traverse  i = i+ 1  // 1-2-3-4-5-6
        {
            System.out.println(" index : " + i +  " value :" + intArray[i]);
        }

        //linear search
        int findVal = 40;

        for(int i  = 0 ; i < intArray.length ; i++)
        {
            if(intArray[i] == findVal)
            {
                System.out.println("YES");
                break;
            }
        }


    }
}
