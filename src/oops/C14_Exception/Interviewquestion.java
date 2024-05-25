package oops.C14_Exception;

public class Interviewquestion
{

    public static void main(String[] args) {

        String str = "Manoj Kumar" ;
        int gch  = 'a' ;
        int count  = 0 ;
        for( char ch : str.toCharArray() )
        {
            if( ch == gch )
            {
                count++ ;
                for( int i = 1 ; i <= count ; i++ )
                {
                    System.out.print( "*" );
                }
            }
            else
            {
                System.out.print(ch);
            }
        }
    }
}
