import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

public class Main {




    public static <T> void main (String[] args) {

        String[] Arr = {"1", "2", "3", "4", "5"};
        replacingElementsArr(Arr, 0, 3);
        ConvertArr(Arr);

    }


    public static <T, In1, In2> void replacingElementsArr (T[] items, In1 in1, In2 in2) {
        int x = (int) in1;
        int y = (int) in2;
        T box;
        T item = items[x];
        T item02 = items[y];
        box = item;
        items[x] = item02;
        items[y] = box;

        for (T it : items) {
            System.out.println(it);
        }

    }


    public static <T> List<T> ConvertArr (T[] items) {

        List<T> arrayList;
        arrayList =  Arrays.asList(items);
        ArrayList<T> arrayList1=  new ArrayList<>(arrayList);

      /*  for (int i = 0; i < items.length; i++) {  //На мой взгляд работает одинаково.
            arrayList.add(items[i]);

        }*/


        System.out.println("Вывожу ArrayList : " +arrayList1);
        return arrayList;
    }


}
