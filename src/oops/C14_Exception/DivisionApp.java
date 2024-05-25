package oops.C14_Exception;

import java.util.Scanner;

public class DivisionApp {
    public static void main(String[] args) {

           try
           {
               Scanner sc = new Scanner(System.in);
               System.out.println("Welcome to Division App");
               System.out.println("=======================");
               System.out.println("Enter 1st Number");
               int a = sc.nextInt();
               System.out.println("Enter 2nd Number");
               int b = sc.nextInt();
               int res = a / b;
               System.out.println("Reslut of " + a + " / " + b + " is " + res);
           }
           catch (Exception e )
           {
               System.out.println("invalid input");
           }
           finally
           {
               System.out.println("Thank you for Using Division App");
           }

    }
}

