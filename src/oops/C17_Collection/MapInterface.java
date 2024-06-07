package oops.C17_Collection;

import java.util.HashMap;
// Entry@100 ==> k=Samsung , v=5
// Entry@200 ==> k=Apple , v=1
public class MapInterface
{
    public static void main(String[] args)
    {

        HashMap<String,Integer> hm = new HashMap<>() ; // {  Entry@100  , Entry@200  ,        ,          ,        }
        hm.put( "Samsung" , 5 ) ;
        hm.put( "Apple" , 3 ) ;
        System.out.println( hm );

        System.out.println(  hm.get( "Apple")  );

//      hm.put( "Apple" , 1 );
//      for updating value of key present
        int oldValue = hm.get("Apple") ;
        hm.put( "Apple" , oldValue + 1 ) ;
        System.out.println( hm);

    }
}
