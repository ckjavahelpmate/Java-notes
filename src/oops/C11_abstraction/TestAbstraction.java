package oops.C11_abstraction;

abstract class Addition
{
    public abstract int addition(int a , int b) ;

}
interface  Calci1
{
    public int addition(int a , int b) ;
}
interface calci2
{
    public int addition( int a , int b) ;
}

public class TestAbstraction
{
    public static void main(String[] args)
    {
        Calci1 app = new ImplementingClass2();
        app.addition( 10 , 20 );

    }
}
