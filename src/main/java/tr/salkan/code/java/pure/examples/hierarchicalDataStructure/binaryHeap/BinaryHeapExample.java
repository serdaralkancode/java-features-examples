package tr.salkan.code.java.pure.examples.hierarchicalDataStructure.binaryHeap;

import java.util.Scanner;

public class BinaryHeapExample {

    /*
            * Like a Binary Tree

                    * Min Binary Heap

                         root is minimum key

                                        6
                                      /    \
                                    7       12
                                  /   \     /   \
                                11     16   86    89

                    * Max Binary Heap

                        root is maximum key

                                        75
                                      /    \
                                    17       12
                                  /   \     /   \
                                11     16   5    2
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        BinaryHeapService bh = new BinaryHeapService(scan.nextInt() );

        char ch;
        /**  Perform Binary Heap operations  **/
        do
        {
            System.out.println("\nBinary Heap Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. delete min");
            System.out.println("3. check full");
            System.out.println("4. check empty");
            System.out.println("5. clear");

            int choice = scan.nextInt();
            switch (choice)
            {
                case 1 :
                    try
                    {
                        System.out.println("Enter integer element to insert");
                        bh.insert( scan.nextInt() );
                    }
                    catch (Exception e)
                    {
                        System.out.println(e.getMessage() );
                    }
                    break;
                case 2 :
                    try
                    {
                        System.out.println("Min Element : "+ bh.deleteMin());
                    }
                    catch (Exception e)
                    {
                        System.out.println(e.getMessage() );
                    }
                    break;
                case 3 :
                    System.out.println("Full status = "+ bh.isFull());
                    break;
                case 4 :
                    System.out.println("Empty status = "+ bh.isEmpty());
                    break;
                case 5 :
                    bh.makeEmpty();
                    System.out.println("Heap Cleared\n");
                    break;
                default :
                    System.out.println("Wrong Entry \n ");
                    break;
            }


            bh.printHeap();

            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
        } while (ch == 'Y'|| ch == 'y');

    }
}