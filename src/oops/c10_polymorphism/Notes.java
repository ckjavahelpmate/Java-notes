package oops.c10_polymorphism;

public class Notes {
}
/*
Polymorphism
============
==> One member showing multiple behaviours based situations
==> polymorphism is classified into 2 types
    1) compile time polymorphism / static binding / early binding
    2) Runtime time polymorphism / dynamic binding / lazy binding

1) compile time polymorphism / static binding / early binding
=============================================================
==> which behaviour(method) has to executed will decided by compiler
==>Ex.
        1.Method overloading
        2.Constructor overloading

1.Method overloading
=====================
==> Designing multiple methods with same name but different arguments
==> which method has to be executed is decided by arguments
==> order of static binding
    1.similar datatype
    2.widening ==> byte < short < int < long < float < double

2) Runtime time polymorphism / dynamic binding / lazy binding
=============================================================
==> which behaviour(method) has to executed will decided by JVM in run time
==> Ex.
        Method Overriding

Method Overriding
================
==> Changing parent class method implementation according child class requirement
==> Designing multiple methods with same name & same arguments
==> which method has to be executed is decided by Object created
==> Method overriding rules
    ======================
       1.Extend your class to parent class
       2.Method declaration must be same
       3.upcasting must be done

 */