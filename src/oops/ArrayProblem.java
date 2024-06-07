package oops;

import java.util.Arrays;

/*
    input ==>  [3,6,0,2,5,0,0,6,8,9]
    output ==> [0,0,0,3,6,2,5,6,8,9]
 */
public class ArrayProblem
{
    public static void main(String[] args)
    {
        int[] arr = { 3,6,0,2,5,0,0,6,8,9 } ;

        int[] temp = new int[ arr.length  ] ;

        for( int i =arr.length-1, j= temp.length-1 ; i>= 0 ; i-- )
        {
            if( arr[i] != 0 )
            {
                temp[j--] = arr[i] ;
            }
        }
        System.out.println(Arrays.toString( arr));
        System.out.println(Arrays.toString( temp));

    }
}
