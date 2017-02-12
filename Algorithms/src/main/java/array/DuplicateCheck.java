package array;

/**
 * Created by SHILPESH on 12-Feb-17.
 */
public class DuplicateCheck {

    public static void main(String[] args){

int[] array= {0,1,3,1,5,7,1,3};
        System.out.println(checkForDuplicates(array));
    }

    public static boolean checkForDuplicates(int[] array){

        boolean ret=false;

        for (int i=0;i<array.length;i++){

            for (int j=i;j<array.length;j++){

                if (array[i]==array[j]){
                    ret=true;
                    return ret;
                }
            }

        }

        return ret;
    }

}
