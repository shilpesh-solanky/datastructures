package sorting;

import org.junit.Test;

import java.util.HashMap;

/**
 * Created by shso1116 on 14-02-2017.
 */
public class SortByFrequency implements Sortable {

    @Override
    public int[] sort(int[] array) {
        HashMap<Integer, Integer> integerHashMap = new HashMap<>();

        for (int i = 0; i < array.length; i++) {

            if (integerHashMap.get(new Integer(array[i])) == null) {
                integerHashMap.put(new Integer(array[i]), new Integer(1));
            } else {
                Integer count = integerHashMap.get(new Integer(array[i]));
                integerHashMap.put(new Integer(array[i]), new Integer(count + 1));
            }
        }

        System.out.println(integerHashMap);
        integerHashMap.size();

        return new int[0];
    }

    @Test
    public void testSpecial() {
        SortByFrequency sorter = new SortByFrequency();
        int[] test = {5, 5, 6, 6, 4, 4, 5, 5, 4, 4, 6, 6, 5, 5};
        sorter.sort(test);

        for (int i = 0; i < test.length; i++) {
            System.out.print(test[i]);
        }
        System.out.println();
    }
}
