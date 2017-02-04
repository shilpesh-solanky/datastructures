package utilities;

/**
 * Created by SHILPESH on 04-Feb-17.
 */
public class PrintUtility {

    public static void printArrayInt(int[] intArray) {
        System.out.print("{");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ,");
        }
        System.out.print("}");
    }
}
