package sorting;

import org.junit.Test;

/**
 * Created by SHILPESH on 13-Feb-17.
 */
public class QuickSort {

    @Test
    public void testQuickSort() {

        int[] intArraySort = {2, 4, 6, 7, 8, 1, 9};
        System.out.println(this.sort(intArraySort));

    }

/*
 A large array is partitioned into two arrays one of which holds values smaller than the specified
  value, say pivot, based on which the partition is made and another array holds values greater
  than the pivot value.

   Quick sort partitions an array and then calls itself recursively twice to sort the two resulting
 subarrays. This algorithm is quite efficient for large-sized data sets as its average and worst
 case complexity are of Ο(n2), where n is the number of items.
* */

    public int[] sort(int[] arrayToSort) {
        /*Step 1 − Choose the highest index value has pivot
Step 2 − Take two variables to point left and right of the list excluding pivot
Step 3 − left points to the low index
Step 4 − right points to the high
Step 5 − while value at left is less than pivot move right
Step 6 − while value at right is greater than pivot move left
Step 7 − if both step 5 and step 6 does not match swap left and right
Step 8 − if left ≥ right, the point where they met is new pivot*/

        int[] sortedArray = arrayToSort;
        arrayToSort = null;
        return sortedArray;
    }
}