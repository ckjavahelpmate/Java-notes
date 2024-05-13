package oops.C11_abstraction;

public class Note {
}
/*
Abstraction
===========
==>Showing only necessary and hiding un-necessary details.
==>Abstraction is used achieve data security , easy maintenance.
==>In java hiding method implementation and showing only method declaration is known as abstraction.

Note ::
1. we can achieve abstraction only in abstract class or interface
2. abstract methods must be prefixed with abstract keyword and be with semicolon.
3. we can not create Object for Abstract class or interface
4. we provide functionality or body or implementation to the abstract method by method overriding

Technical terms
===============
1. class ==> it is blue print or template created using class keyword
    class Dinga
    {
        variable/concrete method/constructor/Initializers
    }
2. abstract class ==> a class prefixed with abstract keyword
    abstract class Mala
    {
        variable/concrete-method & abstract-method / constructor / Initializers
    }
3. interface ==> it is blue print or template created using interface keyword
    interface Sheela
    {
        public final static variable/abstract method
    }
4. Concrete method ==> methods which is having body or implementation
5. Abstract method ==> method which does not have body or implementation


difference between abstract class and interface
===============================================
Abstract class
==============
1.class which is prefixed with abstract keyword
2.abstract class can have both concrete method and abstract method
3.we must specify methods as abstract using abstract keyword
4.we can have all types of variables
5.constructor allowed
6.we can not achieve multiple inheritance

interface
=========
1.A template or block created using interface keyword
2.Only abstract methods are allowed
3.By default all the methods abstract
4.Only public final static variable is allowed
5.constructor not allowed
6.we achieve multiple inheritance

 */