package sorting;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SHILPESH on 12-Feb-17.
 */
public class BubbleSort {

    public List<Integer> sort(List<Integer> list){
        int size = list.size();

        for (int i=0;i<size;i++){

            for (int j=i;j<size;j++){

                if(list.get(i)>list.get(j)){

                    Integer temp=list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);

                }

            }

        }

        return list;
    }


    @Test
    public void testSort(){
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(3);
        list.add(9);
        list.add(2);
        System.out.println(this.sort(list));
        //TODO Complete Tests
      //  Assert.assertArrayEquals();
    }
}
