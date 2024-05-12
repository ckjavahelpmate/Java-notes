package oops.c8_scannerclass;

// Step1 import scanner class
import java.util.Scanner;

public class ReadUserDetails {

    public static void main(String[] args)
    {
//       Step02 Create Scanner class object and pass Input stream reference
        Scanner sc = new Scanner( System.in );
//      call the methods using scanner object reference
        System.out.println("Enter your name");
        String name  = sc.nextLine();

        System.out.println("Enter your id");
        int id = sc.nextInt() ;

        System.out.println("Enter your salary");
        double sal = sc.nextDouble() ;

        System.out.println("name :: "+ name );
        System.out.println("id :: "+ id );
        System.out.println("sal :: "+ sal );
    }
}
