package programs.array;

import java.util.HashMap;
import java.util.Map;

//1.Print the Duplicate elements in Array
//input[ 1, 2, 2, 3, 1, 2, 4, 5, 4 ]   output ::  1=2 , 2=3 , 4=2,
public class PrintDuplicateElements {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 2, 3, 1, 2, 4, 5, 4};

        HashMap<Integer, Integer> fq = new HashMap<>(); //  { 1=2 , 2=3 , 3=1 , 4=2, 5=1}

        for (int num : numbers) {
            if (fq.containsKey(num)) {
                // Duplicate element
                fq.put(num, fq.get(num) + 1);
            } else {
                //Unique element
                fq.put(num, 1);
            }
        }

        for(Map.Entry<Integer,Integer>  entry :  fq.entrySet() ) //  Set=[ 1=2 , 2=3 , 3=1 , 4=2, 5=1 ] ent
        {
            if( entry.getValue() > 1 )
            {
                System.out.println(  entry.getKey() +" == "+ entry.getValue() );
            }
        }

    }
    public static void printFrequency(int[] values)
    {
        boolean[] visited = new boolean[values.length] ;
        for( int i=0 ; i < values.length ; i++ )
        {
            if( visited[i] == false )
            {
                int count = 1 ;
                for( int j = i+1 ; j < values.length ; j++ )
                {
                    if( values[i] == values[j] )
                    {
                        count++ ;
                        visited[j] = true ;
                    }
                }
                if( count > 1)
                {
                    System.out.println( values[i] + " ==> "+ count );
                }
            }
        }
    }
}

/*
Map :: default size 16
=====
HashMap ==> un-order
TreeMap ==> Sorted Order
LinkedHshMap ==>  Insertion Order
Hashtable ==> Synchronized


 */