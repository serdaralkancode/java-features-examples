package tr.salkan.code.java.pure.examples.ternarySearch;

public class TernarySeachExample {

    public static void main(String[] args) {

        int[] array = new int[]{ 3, 6, 8, 11, 14, 18 };

        int findValue = 18;

        int result = ternarySearch(array,findValue);

        System.out.println(result);

    }

    public static int ternarySearch(int[] array, int x)
    {
        int left = 0, right = array.length - 1;

        while (left <= right)
        {
            int leftMid = left + (right - left) / 3;
            int rightMid = right - (right - left) / 3;

            if (array[leftMid] == x) {
                return leftMid;

            } else if (array[rightMid] == x) {
                return rightMid;
            }
            else if (array[leftMid] > x) {
                right = leftMid - 1;
            }
            else if (array[rightMid] < x) {
                left = rightMid + 1;
            }
            else {
                left = leftMid + 1;
                right = rightMid - 1;
            }
        }
        return -1;
    }

}
