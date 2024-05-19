package oops.C13_string;

import java.util.Arrays;

public class StringClassMethods
{
    public static void main(String[] args)
    {

        String str = "Java class" ;   // ['J', 'a', 'v', 'a',' ', 'c', 'l', 'a', 's', 's']
                                      // [ 0,   1,   2,   3,  4,   5,   6,   7,   8,   9 ]
//      Number characters present in String
        System.out.println( str.length() );// 10
//      Accessing characters from string
        System.out.println( str.charAt( 2 ) ); // v
        for( int i = 0 ; i < str.length() ; i++ )
        {
            System.out.println(  str.charAt(i)  );
        }
//      Extract subString from original String ==> end index is excluded
        System.out.println( "SubString :: "+  str.substring( 2 , 4 ));
        System.out.println("SubString :: "+  str.substring( 5 ));

//      Find index of given character in String
        System.out.println( str.indexOf( 'a' )); // 1
        int count = 0 ;
        for(int i = 0; i < str.length() ; i++ )
        {
            if( str.charAt(i) == 'a' )
            {
              count++;
            }
            if( count == 1 )
            {
                System.out.println( i ); break;
            }
        }
//      Replace new char with old char
        System.out.println( str.replace('a' , 'o'));
//      Convert String into Upper case
        System.out.println( str.toUpperCase() ); //
//      Convert String into Lower case
        System.out.println( str.toLowerCase());

//        str.startsWith();
//        str.endsWith() ;
//        str.toCharArray() ;
//        str.split() ;
//        str.contains() ;
//        str.equalsIgnoreCase();
//        str.trim();








    }
}
