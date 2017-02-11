package string;

/**
 * Created by SHILPESH on 08-Feb-17.
 */
public class ReverseString {

    public static void main(String[] args){

        System.out.println(reverseStringUsingArray("Shilpesh"));
    }

    public static String reverseStringUsingArray(String string){
        String reverseString="";

        char[] charArraystr= string.toCharArray();

        int i=0;
        int j = 7;
        while(i!=j){
            char temp=charArraystr[i];
            charArraystr[i]=charArraystr[j];
            charArraystr[j]=temp;
            i++;
            j--;
        }
        reverseString=String.valueOf(charArraystr);
        return reverseString;
    }
}
