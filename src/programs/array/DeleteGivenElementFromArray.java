package programs.array;

import java.util.Arrays;
// 2.Delete Given Element from Array [ 1, 2, 3, 4 ,5 ] ele = 3 , output::[ 1, 2, 4, 5 ]
public class DeleteGivenElementFromArray {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        int ele = 3;
        System.out.println(Arrays.toString(values)); //  [ 1, 2, 3, 4, 5 ]

        //manipulation
        values = deleteGivenElement(values, ele);

        System.out.println(Arrays.toString(values)); // [ 1, 2, 4, 5 ]


    }

    public static int[] deleteGivenElement(int[] values, int ele) {
        int[] temp = new int[values.length - 1];
        for (int i = 0, j = 0; i < values.length; i++) {
            if (values[i] != ele)  // 5 != 3
            {
                temp[j] = values[i];
                j++;
            }
        }
        return temp;
    }

}
