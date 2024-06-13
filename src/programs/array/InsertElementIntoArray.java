package programs.array;

import java.util.Arrays;

public class InsertElementIntoArray {

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        int element = 888, index = 2;
        System.out.println(Arrays.toString(values)); // [ 1, 2, 3, 4, 5 ]
        values = insert(values, element, index);
        System.out.println(Arrays.toString(values)); // [ 1, 2, 888, 3, 4, 5 ]

    }

    public static int[] insert(int[] values, int element, int index) {
        int[] temp = new int[values.length + 1];    // [ 1, 2, 888, 3, 4, 5 ]
        for (int i = 0, j = 0; i < temp.length; i++) {
            if (i == index) {
                temp[i] = element;
            } else {
                temp[i] = values[j];
                j++;
            }
        }
        return temp;
    }
}
