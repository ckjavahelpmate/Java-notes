package oops.c6_isArelationship;

public class Test
{
    public static void main(String[] args)
    {
        Sheela sheela = new Sheela();
        System.out.println( sheela.name );
        System.out.println( sheela.age );

        B b = new B();
        System.out.println( b.age );
//        System.out.println( b.name );

    }
}

/*
IS-A Relationship ==> Inheritance
=================================
Inheritance is design technique where one class will inherit states and behaviours from another class
class which gives states and behaviours is known as Parent class
class which receives states and behaviours is known as Child class
Inheritance can be Achieved using 2 keywords
============================================
1) extends ==> is used when parent and child are same type templates
2) implements ==> is used when parent and child different type templates
Syntax :
=========
class  parent
{
    //variables and methods
}

class child extends parent-class-name
{
    // parent class variables and methods are inherited
}
Note ::
1. Using child class we can access both child class members and parent class
    members
2. using parent class we can not access child class members
 */

