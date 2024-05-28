package oops.C16_Collection;

public class ArraySize
{
    public static void main(String[] args)
    {
        int[] arr  =  { 1, 2,3 } ;


        int[] brr = new int[3] ;   // brr = [I@100abc ==> [ 25, 45, 55 ]

        for( int i = 0; i < brr.length ; i++ )
        {
            System.out.println( brr[i] );
        }

        brr[0] = 25 ;
        brr[1] = 45 ;
        brr[2] = 55 ;



        int[] temp = new int[ brr.length + 1 ] ; // [I@200abc ==>[ 25, 45, 55, 65 ]

        //Transfer values from old brr to temp
        for( int i = 0 ; i < brr.length ; i++ )
        {
            temp[i] = brr[i] ;
        }
        temp[ temp.length-1 ] = 65 ;

        brr = temp ;





    }
}
