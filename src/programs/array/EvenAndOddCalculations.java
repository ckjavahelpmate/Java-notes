package programs.array;

import java.util.Arrays;

//    2.Add 10 to even index elements and multiply Odd index elements with 100;
//            input[ 1, 2, 3, 4, 5 ]   output ::[ 11, 200, 13, 400, 15 ]
public class EvenAndOddCalculations {

    public static void main(String[] args) {
        int[] values = { 1, 2, 3, 4, 5 } ;  //  [ 1, 2, 3, 4, 5 ]

        for (int i = 0; i < values.length ; i++)
        {
            if( i%2==0 )
            {
                // task-01
                values[i] = values[i] + 10 ;
            }
            else
            {
                //task-02
                values[i] = values[i] * 100 ;
            }
        }
        System.out.println(Arrays.toString( values )); //[ 11, 200, 13, 400, 15 ]
    }
}
