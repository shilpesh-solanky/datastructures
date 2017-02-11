package array;

import utilities.GetData;
import utilities.PrintUtility;

/**
 * Created by SHILPESH on 04-Feb-17.
 * <p>
 * Input {5,3,7,11,2,3,13,5,7}
 * <p>
 * Output {5,7,11,2,13,5,7,0,0}
 */
public class DeleteItemArray {


    public static void main(String args[]) {

        PrintUtility.printArrayInt(DeleteItemArray.deleteItemFromArray(GetData.getArray10(), 3));
    }

    public static int[] deleteItemFromArray(int[] intArray, int numberToDelete) {

        //Iterate Array
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == numberToDelete) {
                intArray[i] = 0;
            }
        }
        //Shuffle
        for (int j = 0; j < intArray.length - 1; j++) {
            if (intArray[j] == 0) {
                int temp = intArray[j + 1];
                intArray[j + 1] = 0;
                intArray[j] = temp;
            }
        }
        return intArray;

    }

    public static int[] deleteItemFromArrayOptimised(int[] intArray, int numberToDelete) {
        int count = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == numberToDelete) count++;
        }

        return intArray;
    }
}