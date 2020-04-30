package tr.salkan.code.java.pure.examples.complexity;

public class PolynomialTimeComplexity {

    /*
               - O(n^c)
     */


    public static void main(String[] args) {

        //Easy example

        int n = 3;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for(int j = 1; j < n; j++) {
                System.out.println("i : " + i + " - j: " + j);
                count++;
            }
        }

        System.out.println(" n : " + n + " - count : " + count);

        n = 4;
        count = 0;

        for (int i = 1; i <= n; i++) {
            for(int j = 1; j < n; j++) {
                System.out.println("i : " + i + " - j: " + j);
                count++;
            }
        }

        System.out.println(" n : " + n + " - count : " + count);
    }
}
