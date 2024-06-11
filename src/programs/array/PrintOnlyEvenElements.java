package programs.array;
//Input ==> [ 1, 2, 3, 4, 5, 6, 7, 8 , 9 ]
//output ==> 2 4 6 8
public class PrintOnlyEvenElements {

    public static void main(String[] args) {
        int[] values = { 1, 2, 3, 4, 5, 6, 7, 8 , 9  } ;

        for( int i =0 ; i < values.length ; i++ )
        {
           if( values[i] %2 == 0 )
           {
               System.out.print( values[i] + " ");
           }
        }
    }
}
