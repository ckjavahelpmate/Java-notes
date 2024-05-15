package oops.C12_Array;

public class CreateArray
{
    static  String[] names = {"Sheela" , "Mala", "Leela", "Urmila" } ;
    double[]  prices = { 250.50 , 145.55 , 34.78 } ;
    public static void main(String[] args)
    {
        int[]  numbers = { 10 , 20 , 30 , 40 , 50 , 60 ,70  } ;
//      Address of Array object
        System.out.println( "numbers :: "+  numbers );  // [I@100abc
        System.out.println( "names :: "+  CreateArray.names ); // [String@100abc
        CreateArray obj = new CreateArray();
        System.out.println( "prices :: "+  obj.prices ); // [D@100abc

//      Number elements present in Array Object
        System.out.println( "Number of numbers :: "+ numbers.length ); // 7
        System.out.println( "Number of names:: "+ CreateArray.names.length ) ; // 4
        System.out.println( "Number of prices :: "+ obj.prices.length ); // 3

//      Accessing Array object elements one by one
        for( int i = 0 ; i < numbers.length ; i++ )
        {
            if( numbers[i] < 30 )
            {
                System.out.println( numbers[ i ] ); // 10 , 20 , 30 , 40 , 50 , 60, 70
            }
        }
        for( int i = 0 ; i < names.length ; i++ )
        {
            System.out.println( CreateArray.names[ i ] ); // Sheela, Mala, Leela, Urmila
        }
        for( int i = 0 ; i < obj.prices.length ; i++ )
        {
            System.out.println( obj.prices[ i ] ); // 250.50 , 145.55 , 34.78
        }

    }
}
