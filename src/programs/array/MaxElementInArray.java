package programs.array;

import java.util.Arrays;

public class MaxElementInArray
{
    public static void main(String[] args)
    {

        int[] values = {  30 , 50 , 40, 80, 20 , 10 }  ;

        int max = values[0] ; //  max = 50
        int min = values[0] ; // min = 10

        for( int i = 0 ;  i < values.length ; i++ )
        {
            if( values[i]  > max ) // 10 > 50
            {
                max = values[i] ;
            }
            if( values[i] < min )
            {
                min = values[i] ;
            }
        }

        System.out.println( "Max Element in "+ Arrays.toString( values ) + " ==> "+ max );
        System.out.println( "Min Element in "+ Arrays.toString( values ) + " ==> "+ min );
    }
}
