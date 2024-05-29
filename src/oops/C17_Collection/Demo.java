package oops.C17_Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class Demo
{
    public static void main(String[] args)
    {
        ArrayList al = new ArrayList() ;  // al = ArrayList@100abc
        al.add( 10 ) ;
        al.add( 20 ) ;
        al.add( 30 ) ;
        al.add( 20 ) ;
        al.add( 1, 888) ;
        System.out.println( "ArrayList :: "+ al );
        System.out.println( al.get(2) );


        HashSet hs = new HashSet() ;
        hs.add( 10 );
        hs.add(20) ;
        hs.add(30) ;
        hs.add(20 ) ;
        System.out.println( "HashSet :: "+ hs);
        //System.out.println( hs.get() ); ==> no Index


    }
}


/*


    Heap Area
    ==========
    ArrayList@100abc
    [ 10, 20, 30, 10 ]

    HashSet@200abc
    [10, 20, 30]


 */