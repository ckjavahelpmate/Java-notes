package programs.array;

public class PrintMissingNumber
{
    public static void main(String[] args)
    {
        int[] values = { 1 , 4, 5, 7, 8, 10, 14 } ;  // 2 3 6 9 11  12 13

        for( int i = 0 ; i < values.length-1 ; i++ )
        {
            printBetweenNumber( values[i] , values[i+1]  );
        }
    }

    public static void printBetweenNumber( int start , int end )
    {
        for( int i = start+1 ; i < end ; i++ )
        {
            System.out.print( i + " " );
        }
    }
}
