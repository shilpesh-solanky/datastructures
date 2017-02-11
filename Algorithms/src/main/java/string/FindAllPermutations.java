package string;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SHILPESH on 08-Feb-17.
 */
public class FindAllPermutations {

    public static void main(String[] args) {
        String str = "abc";
        System.out.print("Input  " + str + "  Result  " + findAllPermutations(str));
    }

    public static List<String> findAllPermutations(String inputString) {
        List<String> result = new ArrayList<>();
        result.add(inputString);
        StringBuffer sb = new StringBuffer(inputString);

        for (int i = 0; i < sb.length() - 1; i++) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(i + 1));
            sb.setCharAt(i + 1, temp);
            result.add(sb.toString());
        }
        return result;
    }
}
