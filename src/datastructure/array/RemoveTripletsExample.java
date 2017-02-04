package datastructure.array;

import java.util.Objects;

public class RemoveTripletsExample {

    public static void main(String[] args) {

        RemoveTripletsExample.removetriplets("aabbbacddddc");

    }

    public static String removetriplets(String str) {

        Objects.requireNonNull(str);

        StringBuffer stringBuffer = new StringBuffer(str);

        for (int i = 1; i < stringBuffer.length() - 2; i++) {

            if (stringBuffer.charAt(i - 1) == stringBuffer.charAt(i)
                    && stringBuffer.charAt(i) == stringBuffer.charAt(i + 1)) {

                System.out.println("Before " + stringBuffer);
                stringBuffer.delete(i - 1, i + 2);
                System.out.println("After " + stringBuffer);
            }

        }

        return stringBuffer.toString();
    }

}
