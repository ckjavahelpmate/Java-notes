package oops.C17_Collection;

import java.util.ArrayList;

//Entry@100 ==> k=Samsung , v=5
//Entry@100 ==> k=Apple , v=3

public class Shop
{
    public static void main(String[] args)
    {
        ArrayList<Entry> mobile = new ArrayList<>(); // [ Entry@100 , Entry@200 ]
        mobile.add( new Entry( "Samsung" , 5 ) ) ;
        mobile.add( new Entry( "Apple" , 3 ) ) ;

        System.out.println( mobile );

    }
}

class Entry
{
    String key ;
    int value ;

    Entry( String key , int value)
    {
        this.key = key ;
        this.value = value ;
    }

    @Override
    public String toString() {
        return key + "="+value+" ," ;
    }
}