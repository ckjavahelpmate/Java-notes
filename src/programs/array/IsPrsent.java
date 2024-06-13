package programs.array;

import java.util.Arrays;

public class IsPrsent // Linear Search
{
    public static void main(String[] args)
    {
        int[] values = { 5, 1, 7, 3, 6, 2, 5, 8, 4 } ;

        int key = 7 ;

        for( int i = 0 ; i < values.length ; i++ )
        {
            if( values[i] == key )
            {
                System.out.println( key + " is Present in index "+ i ); return;
            }
        }
        System.out.println( key + " is not present, Actual values are :: "+ Arrays.toString(values) );

    }
}
