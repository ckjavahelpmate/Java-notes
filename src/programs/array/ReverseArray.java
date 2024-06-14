package programs.array;

import java.util.Arrays;

// 3.Reverse Array input[ 1, 2, 3, 4 ,5  ]  output :: [ 5, 4, 3, 2, 1 ]
public class ReverseArray
{
    public static void main(String[] args) {
        int[] values = { 1, 2, 3, 4, 5 } ;

        System.out.println(Arrays.toString( values) ); //j[ 1, 2, 3, 4 , 5 ] i

//     without Creating another Array Object
        for( int i=0 , j = values.length-1 ;  i < j  ; i++ , j-- )
        {
            int temp = values[i] ;  // temp = 3
            values[i] = values[j] ;
            values[j] = temp ;
            System.out.println( Arrays.toString( values ));

        }
        System.out.println( Arrays.toString( values)); // [ 5, 4, 3, 2, 1 ]

    }
    public static void reverse(int[] values)
    {
        //    By Creating another Array Object
        int[] temp = new int[ values.length] ; // [ 5, 4, 3, 2, 1 ] j
        for( int i = values.length-1 , j=0  ; i >= 0 ; i-- , j++ )
        {
            temp[j] = values[i] ;
        }
        System.out.println( Arrays.toString(temp) ); // [ 5, 4, 3, 2, 1 ]
    }
}


