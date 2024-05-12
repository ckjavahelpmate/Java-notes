package oops.c8_scannerclass;

import java.util.Scanner;

public class Addition
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner( System.in );
        System.out.println("Welcome to Addition App");
        System.out.println("=======================");

        System.out.println("Enter 1st number:: ");
        int a = scanner.nextInt() ;

        System.out.println("Enter 2nd Number:: ");
        int b = scanner.nextInt() ;

        int res = a + b ;
        System.out.println("Addition of "+ a + " & "+ b + " is " + res );

    }
}
