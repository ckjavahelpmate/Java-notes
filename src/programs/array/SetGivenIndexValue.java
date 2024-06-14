package programs.array;

import java.util.Arrays;

// 1.Set Given index value to 888; [ 1, 2, 3, 4, 5 ] ele = 888 , index=2 ;  output:: [ 1, 2, 888 , 4 , 5 ]
public class SetGivenIndexValue {
    public static void main(String[] args) {

       int[] values = { 1, 2, 3, 4, 5  } ;  // [ 0=1, 1=2, 2=888, 3=4, 4=5 ]
       int ele = 888 , index = 2 ;

       for( int i = 0 ; i < values.length ; i++ )
       {
           if( i == index ) // 4 == 2
           {
               values[i] = ele ;
           }
       }

        System.out.println(Arrays.toString( values) ); // [ 1, 2, 888 , 4 , 5 ]
    }
}
