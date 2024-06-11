package programs.array;
//Input ==> [ 1, 2, 3, 4, 5, 6, 7, 8 , 9 ]
//output ==> 9 8 7 6 5 4 3 2 1
public class PrintInReverseOrder
{
    public static void main(String[] args) {
        int[] values = { 1, 2, 3, 4, 5, 6, 7, 8 , 9  } ;

        for( int i = values.length-1 ; i >= 0   ; i-- )
        {
            System.out.print( values[i] + " " );
        }


    }
}
