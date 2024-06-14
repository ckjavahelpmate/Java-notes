package programs.array;

import java.util.Arrays;

// 1.Delete given index element [ 1, 2, 3, 4, 5 ] index=3 output :: [ 1, 2, 3, 5 ]
public class DeleteGivenIndexElement
{
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5} ;
        int index = 3 ;
        System.out.println(Arrays.toString( values )); //  [ 1, 2, 3, 4, 5 ]

        //manipulation
        int[] temp = new int[ values.length-1 ] ;  // [ 1, 2, 3, 5]
        for( int i = 0, j = 0 ; i < values.length ; i++ )
        {
            if( i != index )  // 4 != 3
            {
                temp[j] = values[i];
                j++;
            }
        }

        values = temp ;
        System.out.println( Arrays.toString( values )); // [ 1, 2, 3, 5 ]


    }
}
