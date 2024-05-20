package oops.C14_Exception;
class Student
{
    int id ;
    String name ;
    public Student(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
}

public class WithoutCreatingObjectAccessingObjectDetails
{

    public static void main(String[] args)
    {
        Student s1 = new Student(101 , "Mala");

        Student s2 = null ;

        System.out.println( s1.name ); // Student@100.name
        System.out.println( s2.name ); // null.name ==> NullPointerException

    }
}
