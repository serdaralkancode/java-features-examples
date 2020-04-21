package tr.salkan.code.java.pure.examples.binarySearch;

public class SearchByRecursive {

    public static void main(String[] args) {

        int[] numbers = new int[] { 1,2,3,4,5 };

        int findVal = 2;
        int result = recursiveSearch(numbers,findVal);

        System.out.println(result);

    }

    public static int recursiveSearch(int[] arrayToSearch, int element) {
        return recursiveSearch(arrayToSearch, element, 0, arrayToSearch.length-1);
    }

    private static int recursiveSearch(int[] arrayToSearch, int element, int lowIndex, int highIndex) {

        if (lowIndex > highIndex) return -1;

        int midIndex = (lowIndex + highIndex) / 2;

        if (element == arrayToSearch[midIndex]) {
            return midIndex;
        } else if (element < arrayToSearch[midIndex]) {
            return recursiveSearch(arrayToSearch, element, lowIndex, midIndex-1);
        } else if (element > arrayToSearch[midIndex]) {
            return recursiveSearch(arrayToSearch, element, midIndex+1, highIndex);
        }

        return -1;
    }

}
