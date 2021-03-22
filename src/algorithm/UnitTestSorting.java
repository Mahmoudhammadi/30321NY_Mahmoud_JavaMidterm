package algorithm;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class UnitTestSorting {

    /*
      This class is used to help with unit testing of sorting algorithms from the Sort class
     */
    public static void main(String[] args) {
        int[] unSortedArray = {6, 9, 2, 5, 1, 0, 4};
        int[] sortedArray = {0, 1, 2, 4, 5, 6, 9};

        // Create instance of Sort class
        Sort sort = new Sort();

        // Pass the unsorted array to selectionSort() method from Sort class
        sort.selectionSort(unSortedArray);



        // Verify if the unsorted array is sorted by the selectionSort() method
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "ARRAY IS NOT SORTED... YET!\n***YOU GOT THIS!***");
        } catch (Exception ex) {
            ex.getMessage();
        }

        // Implement Unit test for rest of the sorting algorithms below

          sort.bubbleSort(unSortedArray);
          System.out.println(Arrays.toString(unSortedArray));
          sort.mergeSort(unSortedArray,6);
          System.out.println(Arrays.toString(unSortedArray));
          sort.quickSort(sortedArray,0,6);
          System.out.println(Arrays.toString(unSortedArray));
          sort.shellSort(unSortedArray);
          System.out.println(Arrays.toString(unSortedArray));

    }
}
