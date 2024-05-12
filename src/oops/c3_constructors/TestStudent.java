package oops.c3_constructors;

public class TestStudent
{
    public static void main(String[] args)
    {
        Student s1 = new Student( ) ;
        System.out.println( s1.id ); // 0
        System.out.println( s1.name ); // null
        s1.id = 101 ;
        s1.name = "Mala" ;
        System.out.println( s1.id ); // 101
        System.out.println( s1.name ); // Mala

        Student s2 = new Student( 202 , "Allen") ;
        System.out.println( s2.id ); // 202
        System.out.println( s2.name ); // Allen

    }
}
