package programs.array;

//Input ==> [ 1, 2, 3, 4, 5, 6, 7, 8 , 9 ]
//output ==> 1 9 2 8 3 7 4 6 5
public class PrintFirstAndLast
{
    public static void main(String[] args) {
        int[] values = { 1, 2, 3, 4, 5, 6, 7, 8 , 9  } ;

        for( int i = 0, j = values.length-1  ; i <= j ; i++ , j-- ) // 1 9 2 8 3 7 4 6 5
        {
            if( i < j )
            {
                System.out.print( values[i] + " ");
                System.out.print( values[j] + " ");
            }
            else
            {
                System.out.println( values[i] );
            }

        }
    }
}
