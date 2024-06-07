package oops.C17_Collection;

import java.util.ArrayList;
import java.util.Vector;

public class ForEach
{
    public static void main(String[] args)
    {
        int[] nums = { 1 , 2, 3, 4 };
        for( int num : nums )
        {
            System.out.println( num );
        }

        String[] names = { "Apple", "Mango", "Banana" };
        for( String name : names )
        {
            System.out.println(name);
        }

        ArrayList<Integer> al = new ArrayList<>();
        al.add(10) ;

        Vector<Integer> v = new Vector<>();
        v.add(20);

    }
}
