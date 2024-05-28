package oops.C16_Collection;

import java.util.Arrays;

public class DeleteElement
{
    public static void main(String[] args) {
        int[] a = { 10, 20 , 30, 40 } ; // a ==> [ 10 , 20, 30, 40 ]  i = 4
        System.out.println( Arrays.toString( a ));
        int key = 20 ;
        int[] temp = new int[a.length -1 ] ; // temp ==> [ 10, 20 , 40 ]   j = 3
        for( int i = 0, j = 0 ; i < a.length ; i++ )
        {
            if( a[i] != key )
            {
                temp[j] = a[i] ;
                j++ ;
            }
        }
        a = temp ;
        System.out.println(Arrays.toString( a ));
    }
}
