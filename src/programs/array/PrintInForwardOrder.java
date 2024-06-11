package programs.array;
//Input ==> [ 1, 2, 3, 4, 5, 6, 7, 8 , 9 ]
//output ==> 1 2 3 4 5 6 7 8 9
public class PrintInForwardOrder
{
    public static void main(String[] args) {
        int[] values = { 1, 2, 3, 4, 5, 6, 7, 8 , 9  } ;

        for( int i = 0 ; i < values.length ; i++ )
        {
            System.out.print( values[i] + " " );
        }

        System.out.println("\n===================");

        for( int value : values )
        {
            System.out.print( value + " ");
        }
    }
}
