package tr.salkan.code.java.pure.examples.binarySearch;

public class SearchByIteration {


    public static void main(String[] args) {

        int[] numbers = new int[] { 1,2,3,4,5 };

        int findArr = 2;

        int result = iterativeSearch(numbers,findArr);

        System.out.println(result);

    }

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

}


