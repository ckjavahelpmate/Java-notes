package oops.c9_classcasting;

import java.util.*;

public class Cab
{
    public static void main(String[] args) {

        List v = new ArrayList() ;
        System.out.println( v instanceof List); //  true
        System.out.println( v instanceof ArrayList); // true
        System.out.println( v instanceof Vector ); // false
        System.out.println( v instanceof LinkedList ); // false
        System.out.println( v instanceof Stack); // false
    }
}
