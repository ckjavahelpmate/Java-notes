package oops.C14_Exception;

import java.util.Arrays;
import java.util.Scanner;

public class SelectNameFromList
{
    public static void main(String[] args)
    {
        String[] names = {"Sheela" , "Mala", "Leela", "Urmila" , "Allen"} ;
        try
        {
            System.out.println( Arrays.toString( names )  );
            Scanner sc = new Scanner(System.in);
            System.out.println("Select the index of name to be printed");
            int index = sc.nextInt() ;
            System.out.println("Selected Name is :: "+ names[index]);
        }
        catch (Exception e)
        {
            System.out.println("Invalid Input.");
            System.out.println("Index is ONly between "+ 0 + " to "+ (names.length-1) );
        }
    }
}
