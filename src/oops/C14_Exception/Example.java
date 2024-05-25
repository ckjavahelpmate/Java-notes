package oops.C14_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example {
    public static void main(String[] args) {
        System.out.println(10 / 0); // ArithmeticException

    }

}
    /*
what is Exception ==> Unwanted situation occurring at run time

How to handle Exception ==> Using try and catch block

How to create Exception ==> Using throw keyword

Types of Exception
==================
1.Checked Exception
==> checked Exceptions are checked by the compiler during compilation
==> we can not compile program without handling checked Exception
==> Exception child classes other than RuntimeException are checked Exceptions

2.Unchecked Exception
==> Unchecked Exceptions are checked by the compiler during compilation
==> we can compile program without handling un checked Exception
==> RuntimeException child classes are unchecked Exceptions

 */