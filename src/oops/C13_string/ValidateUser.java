package oops.C13_string;

import java.util.Scanner;

public class ValidateUser
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name ");
        String username = sc.nextLine() ;
        System.out.println("Enter password");
        String password = sc.nextLine() ;

        if( username.equals("Dinga") && password.equals("Dinga143@Dingi") )
        {
            System.out.println("Valid User");
        }
        else
        {
            System.out.println("Invalid user");
        }
    }
}
