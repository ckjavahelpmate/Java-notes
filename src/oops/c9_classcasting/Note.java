package oops.c9_classcasting;

public class Note {
}


/*

Type Casting
============
==> Converting One data type into another data type
==> Type casting is classified into 2 types, they are
    1) Primitive type casting
    2) Non-Primitive type casting / Class casting

 1) Primitive type casting
 =========================
 ==> Converting one primitive data type into another primitive datatype
 ==> Ex.
        Widening Process ==> Implicit
        ================
        double a = 10 ; // a = 10.0  ==> int types data is converted(stored) in double type variable
        Narrowing ==> Explicit
        ==========
        int b = (int)10.5 ;  // b = 10 ==> double type data is converted(stored) in int type variable

2) Non-Primitive type casting / Class casting
=============================================
==> Converting one class object reference into another class
==> class casting classified into 2 types
    1)Upcasting
    2)down casting

1) upcasting
=============
==>Converting child reference type into parent reference type
==> we can store child class object address(reference) in parent variable
==> Upcasting is implicit process
Note : Using parent class reference(Variable) we can not access child class members
==> To Access child class members when upcasting is done we go for down casting

        Cab cab = new Aut() ;
        System.out.println("Price " +  cab.price ) ; // Compile time error


 2) Down casting
 ===============
 ==> Converting parent class reference type into child class reference type
 ==> down casting is explicit process

        Cab cab = new Mini() ;

        if( cab instanceof  Auto )
        {
            Auto auto = (Auto)cab ;
            System.out.println("Price " + auto.price );
        }
        else if( cab instanceof  Mini )
        {
            Mini mini = (Mini) cab ;
            System.out.println("Price "+ mini.price);
        }
        else if ( cab instanceof Luxury)
        {
            Luxury luxury = (Luxury) cab ;
            System.out.println( "Price :: "+ luxury.price);
        }



ClassCastException
==================
==> Runtime Error we get during down casting.when we try to convert non-relative classes
==>To overcome ClassCastException we must verify type of Object before down casting using
   instanceof operator(keyword)


instanceof
==========
==> it is a keyword and operator to check specified class is present in object or not
==> return type is boolean that is specified class present in object it return true else return false.
==> Syntax ::   Object-reference   instanceof   ClassName ;





 */