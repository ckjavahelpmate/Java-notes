package oops.c3_constructors;

public class Student
{
    int id;
    String name;
    public Student()
    {
        //Load non-static method
        //load non-static var
        //non-static initializer
        System.out.println("i don't receive input");
    }
    public Student(int id, String name)
    {
        //id = 202 , name = "Allen"
        //Load non static method & variable
        System.out.println("i received inputs");
        this.id = id;
        this.name = name;
    }
}
// default values
// byte, short, int , long ==> 0
// float , double ==> 0.0
//char ==> space
//boolean ==> false
//String ==> null
