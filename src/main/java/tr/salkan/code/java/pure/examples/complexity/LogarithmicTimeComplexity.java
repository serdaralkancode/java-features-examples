package tr.salkan.code.java.pure.examples.complexity;

public class LogarithmicTimeComplexity {

    /*
            - O(log n)

            - Examples

                    Binary Search
                    Finding largest/smallest number in a binary search tree
                    Certain Divide and Conquer Algorithms based on Linear functionality
                    Calculating Fibonacci Numbers
     */

    //Binary Seacrh
    public static int iterativeSearch(int[] arrayToSearch, int element) {
        int lowIndex = 0;
        int highIndex = arrayToSearch.length-1;

        int elementPos = -1;

        while (lowIndex <= highIndex) {

            int midIndex = (lowIndex + highIndex) / 2;

            if (element == arrayToSearch[midIndex]) {
                elementPos = midIndex;
                break;
            } else if (element < arrayToSearch[midIndex]) {
                highIndex = midIndex-1;
            } else if (element > arrayToSearch[midIndex]) {
                lowIndex = midIndex+1;
            }
        }
        return elementPos;
    }

    public static void main(String[] args) {


        //Easy example
        int n = 5;
        for (int i = 1; i < n; i = i * 2){                          // i = i* 2   -> 1->2->4
            System.out.println("Hey - I'm busy looking at: " + i);
        }

    }
}
