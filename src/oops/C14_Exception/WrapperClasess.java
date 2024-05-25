package oops.C14_Exception;

public class WrapperClasess
{
    public static void main(String[] args)
    {

       int a  =  500 ; // a=500
       int b  =  500 ; // b=500
       System.out.println( a == b  ); // true

       Integer i = 500 ; // i=Integer@100  ==> Integer@100=500
       Integer j = 500 ; // i=Integer@200  ==> Integer@200=500
       System.out.println( i == j ); // false ==> Address
       System.out.println( i.equals(j) ); // true ==> values

        
    }
}
