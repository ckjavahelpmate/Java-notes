package programs.array;

//Input ==> [ 1, 2, 3, 4, 5, 6, 7, 8 , 9 ]
//output ==> 2 3 5 7
public class PrintOnlyPrimeNumber {
    public static void main(String[] args) {
        int[] values = { 1, 2, 3, 4, 5, 6, 7, 8 , 9  } ;

        for( int i = 0 ; i < values.length ; i++ )
        {
            System.out.println( "Sending "+  values[i] +" to isPrime Function and received "+ isPrime(values[i]));
           if( isPrime( values[i] ) )
           {
               System.out.println( values[i] );
           }
        }
    }

    public static boolean isPrime(int num) {
        int count = 0;
        int i = 1;
        while (i <= num) {
            if (num % i == 0) {
                count++;
            }
            i++;
        }
        if (count == 2) {
            return true ;
        } else {
           return false ;
        }
    }
}
