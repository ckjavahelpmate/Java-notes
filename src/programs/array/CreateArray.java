package programs.array;

import java.util.Arrays;

public class CreateArray
{
    public static void main(String[] args)
    {
//        When you know Elements
        int[] values = { 10, 20 , 30 ,40 } ; // values=[I@100abc ==> [ 10, 20, 30, 40 ]
        System.out.println(Arrays.toString( values ) );

//        When you want to initialize elements later
        int[] values2 = new int[ 3 ] ; // values2=[I@200abc ==> [ 0, 0, 0, 0 ]
        System.out.println( Arrays.toString( values2 ) );
    }
}
